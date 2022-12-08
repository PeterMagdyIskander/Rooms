package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CommentDTO> getAllCommentsByUser(String userId) {
        List<CommentDTO> comments=new ArrayList<>();
        Users userEntity=userRepository.findByName(userId);
        for(Comment c:commentRepository.findByUserId(userEntity.getId())){
            comments.add(modelMapper.map(c, CommentDTO.class));
        };
        return comments;
    }

    public List<CommentDTO> getAllCommentsByRoom(String roomId) {
        List<CommentDTO> comments=new ArrayList<>();
        for(Comment c:commentRepository.findByRoomId(roomId)){
            comments.add(modelMapper.map(c, CommentDTO.class));
        };
        return comments;
    }

    public List<CommentDTO> getAllReplies(Long commentId){
        List<CommentDTO> comments=new ArrayList<>();
        for(Comment c:commentRepository.findByCommentId(commentId)){
            comments.add(modelMapper.map(c, CommentDTO.class));
        };
        return comments;
    }

    public CommentDTO getComment(Long id) {
        CommentDTO commentDTO=modelMapper.map(commentRepository.findById(id).get(),CommentDTO.class);
        List<CommentDTO> comments=new ArrayList<>();
        for(Comment c:commentRepository.findByCommentId(commentDTO.getId())){
            comments.add(modelMapper.map(c, CommentDTO.class));
        };
        commentDTO.setReplies(comments);
        return commentDTO;
    }

    public void addComment(CommentDTO comment,Long parentCommentId) {
        Users userEntity=userRepository.findByName(comment.getUserName());
        // Comment commentEntity=new Comment(comment.getText(),comment.getCommentId(),userEntity,new Room(comment.getRoomId()),new Comment("", parentCommentId));
        Comment commentEntity=new Comment(comment.getText());
        commentEntity.setRoom(new Room(comment.getRoomId()));
        commentEntity.setUser(userEntity);
        commentEntity.setComment(new Comment(parentCommentId));
        commentRepository.save(commentEntity);
        
    }

    // public void updateComment(CommentDTO comment){
    //     Comment commentEntity=new Comment(comment.getText(),new Users("", comment.getUserId()),new Room(comment.getRoomId()),comment.getReplies());
    //     commentRepository.save(commentEntity);
    // }

    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }
}

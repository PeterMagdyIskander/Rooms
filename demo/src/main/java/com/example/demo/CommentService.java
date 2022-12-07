package com.example.demo;

import java.util.ArrayList;
import java.util.List;

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
        for(Comment c:commentRepository.findByUserId(userId)){
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

    public List<CommentDTO> getAllReplies(String commentId){
        List<CommentDTO> comments=new ArrayList<>();
        for(Comment c:commentRepository.findByCommentId(commentId)){
            comments.add(modelMapper.map(c, CommentDTO.class));
        };
        return comments;
    }

    public CommentDTO getComment(String id) {
        return modelMapper.map(commentRepository.findById(id).get(),CommentDTO.class);
    }

    public void addComment(CommentDTO comment,String parentCommentId) {
        Users userEntity=userRepository.findByName(parentCommentId);
        Comment commentEntity=new Comment(comment.getText(),comment.getCommentId(),userEntity,new Room(comment.getRoomId()),new Comment("", parentCommentId));
        commentRepository.save(commentEntity);
    }

    // public void updateComment(CommentDTO comment){
    //     Comment commentEntity=new Comment(comment.getText(),new Users("", comment.getUserId()),new Room(comment.getRoomId()),comment.getReplies());
    //     commentRepository.save(commentEntity);
    // }

    public void deleteComment(String id){
        commentRepository.deleteById(id);
    }
}

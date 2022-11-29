package com.example.demo;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<Comment> getAllCommentsByUser(String userId) {
        return (List<Comment>) commentRepository.findByUserId(userId);
    }

    public List<Comment> getAllCommentsByRoom(String roomId) {
        return (List<Comment>) commentRepository.findByRoomId(roomId);
    }

    public List<Comment> getAllReplies(String commentId){
        return (List<Comment>) commentRepository.findByCommentId(commentId);
    }

    public CommentDTO getComment(String id) {
        CommentDTO commentDTO=modelMapper.map(commentRepository.findById(id).get(),CommentDTO.class);
        // commentRepository.findById(id).get();
        return commentDTO; 
    }

    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment){
        commentRepository.save(comment);
    }

    public void deleteComment(String id){
        commentRepository.deleteById(id);
    }
}

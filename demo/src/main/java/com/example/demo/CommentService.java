package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllCommentsByUser(String userId) {
        return (List<Comment>) commentRepository.findByUserId(userId);
    }

    public List<Comment> getAllCommentsByRoom(String roomId) {
        return (List<Comment>) commentRepository.findByRoomId(roomId);
    }

    public List<Comment> getAllReplies(String commentId){
        return (List<Comment>) commentRepository.findByCommentId(commentId);
    }

    public Comment getComment(String id) {
        return commentRepository.findById(id).get();
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

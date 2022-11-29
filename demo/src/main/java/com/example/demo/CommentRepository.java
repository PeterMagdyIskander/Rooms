package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,String>{
    
    public List<Comment> findByUserId(String userId);
    public List<Comment> findByRoomId(String roomId);
    public List<Comment> findByCommentId(String commentId);
}

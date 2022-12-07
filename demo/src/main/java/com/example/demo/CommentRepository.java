package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Long>{
    
    public List<Comment> findByUserId(long userId);
    public List<Comment> findByRoomId(String roomId);
    public List<Comment> findByCommentId(Long commentId);
}

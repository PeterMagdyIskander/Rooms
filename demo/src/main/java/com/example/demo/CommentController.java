package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping("/users/{userId}/comments")
    public List<Comment> getAllCommentsByUser(@PathVariable String userId) {
        return commentService.getAllCommentsByUser(userId);
    }

    @RequestMapping("/rooms/{roomId}/comments")
    public List<Comment> getAllCommentsByRoom(@PathVariable String roomId) {
        return commentService.getAllCommentsByRoom(roomId);
    }

    @RequestMapping("/comments/{id}/replies")
    public List<Comment> getAllReplies(@PathVariable String id) {
        return commentService.getAllReplies(id);
    }

    @RequestMapping("/comments/{id}")
    public CommentDTO getComment(@PathVariable String id) {
        return commentService.getComment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rooms/{roomId}/users/{userId}/comments")
    public void addComment(@RequestBody Comment comment, @PathVariable String userId, @PathVariable String roomId) {
        
        comment.setUser(new Users("", userId));
        comment.setRoom(new Room(roomId));

        commentService.addComment(comment);
    }

    // this is the id of the user who's writing the comment
    @RequestMapping(method = RequestMethod.POST, value = "/rooms/{roomId}/users/{userOwnerId}/comments/{parentCommentId}")
    public void addReply(@RequestBody Comment comment, @PathVariable String userOwnerId, @PathVariable String roomId,
            @PathVariable String parentCommentId) {
        comment.setUser(new Users("", userOwnerId));
        comment.setRoom(new Room(roomId));
        comment.setComment(new Comment("", parentCommentId));
        commentService.addComment(comment);
    }

    //or make it with requestBody

    @RequestMapping(method = RequestMethod.PUT, value = "/comments/{id}")
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/comments/{id}")
    public void deleteComment(@PathVariable String id) {
        commentService.deleteComment(id);
    }
}

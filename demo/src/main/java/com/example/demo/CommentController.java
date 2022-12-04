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
    public List<CommentDTO> getAllCommentsByUser(@PathVariable String userId) {
        return commentService.getAllCommentsByUser(userId);
    }

    @RequestMapping("/rooms/{roomId}/comments")
    public List<CommentDTO> getAllCommentsByRoom(@PathVariable String roomId) {
        return commentService.getAllCommentsByRoom(roomId);
    }

    @RequestMapping("/comments/{id}/replies")
    public List<CommentDTO> getAllReplies(@PathVariable String id) {
        return commentService.getAllReplies(id);
    }

    @RequestMapping("/comments/{id}")
    public CommentDTO getComment(@PathVariable String id) {
        return commentService.getComment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/comments")
    public void addComment(@RequestBody CommentDTO comment) {
        commentService.addComment(comment, "");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/comments/{parentCommentId}")
    public void addReply(@RequestBody CommentDTO comment, @PathVariable String parentCommentId) {
        commentService.addComment(comment, parentCommentId);
    }

    // @RequestMapping(method = RequestMethod.PUT, value = "/comments/{id}")
    // public void updateComment(@RequestBody Comment comment) {
    // commentService.updateComment(comment);
    // }

    @RequestMapping(method = RequestMethod.DELETE, value = "/comments/{id}")
    public void deleteComment(@PathVariable String id) {
        commentService.deleteComment(id);
    }
}

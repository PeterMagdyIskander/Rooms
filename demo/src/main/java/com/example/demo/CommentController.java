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
    public List<Comment> getAllComments(@PathVariable String userId) {
        return commentService.getAllComments(userId);
    }

    @RequestMapping("/comments/{id}")
    public Comment getComment(@PathVariable String id) {
        return commentService.getComment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users/{userId}/comments")
    public void addComment(@RequestBody Comment comment,@PathVariable String userId) {
        comment.setUser(new Users("",userId));
        commentService.addComment(comment);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{userId}/comments/{id}")
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/comments/{id}")
    public void deleteComment(@PathVariable String id) {
        commentService.deleteComment(id);
    }
}

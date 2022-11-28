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

    @RequestMapping("/comments")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @RequestMapping("/comments/{id}")
    public Comment getComment(@PathVariable String id) {
        return commentService.getComment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/comments")
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
    }
}

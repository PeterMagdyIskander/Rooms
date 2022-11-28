package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    private List<Comment> comments = new ArrayList<Comment>() {
        {
            add(new Comment("ay 7aga", "123", "false", "bito", "SEC"));
        }
    };

    public List<Comment> getAllComments() {

        // List<Comment> comments=new ArrayList<>();
        return (List<Comment>) commentRepository.findAll();
        // return comments;
    }

    public Comment getComment(String id) {
        return comments.stream().filter(comment -> comment.getId().equals(id)).findFirst().get();
    }

    public void addComment(Comment comment) {
        // comments.add(comment);
        commentRepository.save(comment);
    }

    //TODO : DELETE comment
}

package com.example.demo.many_to_one_unidirectional.controller;

import com.example.demo.many_to_one_unidirectional.entity.Comment;
import com.example.demo.many_to_one_unidirectional.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ManyToOneUnidirectionalController {

    private final CommentRepository commentRepository;


    @PostMapping("/comments")
    public List<Comment> saveComments(@RequestBody List<Comment> comment) {
        return commentRepository.saveAll(comment);
    }

    @GetMapping("/comments")
    public List<Comment> comments() {
        return commentRepository.findAll();
    }
}

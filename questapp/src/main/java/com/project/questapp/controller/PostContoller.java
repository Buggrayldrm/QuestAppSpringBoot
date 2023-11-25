package com.project.questapp.controller;

import com.project.questapp.entities.Post;
import com.project.questapp.service.PostService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PostContoller {
    private PostService postService;

    public PostContoller(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public List<Post> getAllPosts(@RequestParam Optional<Long>,userId){

    }
}

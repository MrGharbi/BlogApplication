package com.example.BlogApplication.controller;

import com.example.BlogApplication.models.Post;
import com.example.BlogApplication.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class HomeController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public List<Post> getAllPosts(){
        List<Post> posts = postService.getAll();
        return posts;
    }


    @GetMapping("/post/{id}")
    public Optional<Post> getPost(@PathVariable Long id){
        return postService.getById(id);
    }

    @PostMapping("/post")
    HttpStatus addPost(@RequestBody Post post){
            postService.save(post);
            return HttpStatus.CREATED;
    }
}

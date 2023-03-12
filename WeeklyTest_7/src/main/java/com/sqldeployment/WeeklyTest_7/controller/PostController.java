package com.sqldeployment.WeeklyTest_7.controller;


import com.sqldeployment.WeeklyTest_7.model.Post;
import com.sqldeployment.WeeklyTest_7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping(value = "/addPost")
    public String savePost(Post createPost){
        postService.savePost(createPost);
        return "save post";
    }
    @GetMapping(value = "/getPost")
    public List<Post> getPost(){
        return postService.getAllPost();

    }
}

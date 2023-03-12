package com.sqldeployment.WeeklyTest_7.service;

import com.sqldeployment.WeeklyTest_7.dao.PostRepo;
import com.sqldeployment.WeeklyTest_7.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;
    public void savePost(Post createPost) {
        postRepo.save(createPost);
    }

    public List<Post> getAllPost() {
        return postRepo.findAll();
    }
}

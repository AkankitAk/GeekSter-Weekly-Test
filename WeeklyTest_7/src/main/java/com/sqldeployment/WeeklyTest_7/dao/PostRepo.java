package com.sqldeployment.WeeklyTest_7.dao;

import com.sqldeployment.WeeklyTest_7.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}

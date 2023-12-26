package com.example.blogtest.repo;

import com.example.blogtest.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}

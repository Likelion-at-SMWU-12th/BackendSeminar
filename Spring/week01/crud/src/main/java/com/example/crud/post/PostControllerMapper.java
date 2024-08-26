package com.example.crud.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Post")
public class PostControllerMapper {
    private static final Logger logger = LoggerFactory.getLogger(PostControllerMapper.class);
    private final PostServiceMapping postServiceMapping;
//    private final Gson gson;

    public PostControllerMapper(@Autowired PostServiceMapping postService) {
        this.postServiceMapping = postService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(@RequestBody PostDto postDto) {
        this.postServiceMapping.createPost(postDto);
    }

    // 과제!!!!!!!
//    @GetMapping("{id}")
//    public PostDto readPost(@PathVariable("id") int id) {
//        return this.postServiceMapping.readPost(id);
//    }
//
//    @GetMapping("")
//    public List<PostDto> readPostAll() {
//        return this.postServiceMapping.readPostAll();
//    }
//
//    @PutMapping("{id}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void updatePost(@PathVariable("id") int id, @RequestBody PostDto postDto) {
//        this.postServiceMapping.updatePost(id, postDto);
//    }
//
//    @DeleteMapping("{id}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void deletePost(@PathVariable("id") int id) {
//        this.postServiceMapping.deletePost(id);
//    }
}

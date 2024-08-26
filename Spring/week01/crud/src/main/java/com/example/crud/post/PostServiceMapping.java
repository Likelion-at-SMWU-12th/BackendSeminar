package com.example.crud.post;

import com.example.crud.entity.PostEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceMapping {

    private final PostMapper postMapper;

    public PostServiceMapping (@Autowired PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public void createPost(PostDto dto) {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(dto.getTitle());
        postEntity.setContent(dto.getContent());
        postEntity.setWriter(dto.getWriter());
        postEntity.setBoardEntity(null);

        this.postMapper.createPost(postEntity);
    }
}

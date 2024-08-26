package com.example.crud.post;

import com.example.crud.entity.PostEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    void createPost(PostEntity postEntity);
}

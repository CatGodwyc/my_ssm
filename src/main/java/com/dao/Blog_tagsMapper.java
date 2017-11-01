package com.dao;

import com.model.pojo.Blog_tags;

public interface Blog_tagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog_tags record);

    int insertSelective(Blog_tags record);

    Blog_tags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog_tags record);

    int updateByPrimaryKey(Blog_tags record);
}
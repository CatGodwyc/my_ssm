package com.dao;

import com.model.pojo.Response1;

public interface Response1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Response1 record);

    int insertSelective(Response1 record);

    Response1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Response1 record);

    int updateByPrimaryKey(Response1 record);
}
package com.dao;

import com.model.pojo.Users_info;

public interface Users_infoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Users_info record);

    int insertSelective(Users_info record);

    Users_info selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(Users_info record);

    int updateByPrimaryKey(Users_info record);
}
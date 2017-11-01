package com.service.impl;

import com.model.pojo.Blogger;
import com.service.IBloggerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("bloggerService")
public class BloggerService implements IBloggerService {

	@Resource   //注入BloggerDao对象
    private IBloggerDao dao;
	public IBloggerDao getDao() {
		return dao;
	}

	@Override
	public Blogger getBloggerData() {
		return dao.getBloggerData();
	}
}

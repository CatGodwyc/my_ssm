package com.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 51459 on 2017/10/31.
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用spring测试
@ContextConfiguration(locations = "classpath:applicationContext.xml") //设置spring配置文件路径
public class BloggerDaoTestTest {
    @Resource   //注入BloggerDao对象
//    private IBloggerDao bloggerDao;

    @Test
    public void getBloggerData() throws Exception {
//        Blogger blogger = bloggerDao.getBloggerData();
//        System.out.println(blogger);
    }
}
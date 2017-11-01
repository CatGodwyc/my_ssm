package com.controller;

import com.model.vo.JsonBean;
import com.service.IBloggerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by 51459 on 2017/10/30.
 */
@Controller //注册为控制器bean
public class BloggerController {

    @Resource
	private IBloggerService service;

	@RequestMapping(value = "/list")
	@ResponseBody
	public JsonBean name() {
		System.out.println("haha");
        Blogger blogger = service.getBloggerData();
		JsonBean bean = new JsonBean();
		bean.setMsg(blogger);
		return bean;
	}

	@ResponseBody
	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello";
	}
}

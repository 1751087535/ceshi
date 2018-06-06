package com.dlq.dlqtest.controller;



import java.util.List;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.dlq.dlqtest.model.ClientLogin;


@Controller
public class TestController{
	 private final Logger log =  LoggerFactory.getLogger(TestController.class);
	@Autowired
	private com.dlq.dlqtest.server.Server Server;
	
	@RequestMapping("/ceshi")
	@ResponseBody
    public JSONObject test(){
		log.info("开始测试 //////////////////////");
		log.debug("debug ceshi ");
		log.error("kaishi error");
		System.out.println("nihao kai shi ce shi ");
		List<ClientLogin> client =Server.add("list");
		JSONObject json=new JSONObject();
		json.put("name", "张三");
		json.put("sex", "男");
		json.put("age", 15);
		json.put("data", client.get(0));
        return json;
    }
	
}

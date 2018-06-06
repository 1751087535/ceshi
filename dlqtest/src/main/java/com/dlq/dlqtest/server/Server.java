package com.dlq.dlqtest.server;

import java.util.List;

import com.dlq.dlqtest.model.ClientLogin;

public interface Server {
   /*
    * 天加一个测试用的方法
    * 
    */
	List<ClientLogin> add(String string);

}

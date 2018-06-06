package com.dlq.dlqtest.server.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dlq.dlqtest.Dao.ClientloginDao;
import com.dlq.dlqtest.model.ClientLogin;
import com.dlq.dlqtest.server.Server;
@Service
public class ServerImpl  implements Server{
	@Autowired
	private ClientloginDao clientloginDao;

	@Override
	public List<ClientLogin> add(String string) {
		System.out.println("你好" +string);
		
		List<ClientLogin> CclientLogin=clientloginDao.selectall();
		
		return CclientLogin;
		
	}

}

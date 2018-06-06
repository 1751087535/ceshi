package com.dlq.dlqtest.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dlq.dlqtest.model.ClientLogin;

@Mapper
public interface ClientloginDao {
	
	@Select("select * from td_client_login")
    List<ClientLogin> selectall();
}

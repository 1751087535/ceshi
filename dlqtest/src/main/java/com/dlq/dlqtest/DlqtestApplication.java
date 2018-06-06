package com.dlq.dlqtest;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@ComponentScan(basePackages={"com.dlq.dlqtest"})
public class DlqtestApplication extends SpringBootServletInitializer  {
	public static void main(String[] args) {
		SpringApplication.run(DlqtestApplication.class, args);
	}
}

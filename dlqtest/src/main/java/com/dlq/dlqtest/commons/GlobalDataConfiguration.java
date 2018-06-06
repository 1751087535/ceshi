package com.dlq.dlqtest.commons;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  
public class GlobalDataConfiguration {  
	/**
	 * 注意：在application.properties当中配置jdbc的时候，url的路径请使用jdbcurl 
	 * 如果使用 url 则会出现 jdbcUrl is required with driverClassName. 现在不知道原因！
	 * @return
	 */
    @Bean(name="primaryDataSource")  
    @Primary  
    @Qualifier("dataSourcePrimary")
    @ConfigurationProperties(prefix="spring.datasource1") 
    public DataSource primaryDataSource() {  
        System.out.println("-------------------- primaryDataSource init ---------------------");
        DataSource DataSource=   DataSourceBuilder.create().build();
        System.out.println(DataSource);
        return DataSourceBuilder.create().build();  
    }  
      
    @Bean(name="secondaryDataSource")  
    @ConfigurationProperties(prefix="custom.datasource1.ds1")  
    public DataSource secondaryDataSource() {  
        System.out.println("-------------------- secondaryDataSource init ---------------------");  
        return DataSourceBuilder.create().build();  
    }  
}  
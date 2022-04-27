package com.example.memboard;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

@SpringBootApplication
public class MemboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemboardApplication.class, args);
	}
	
	//SqlSessionFactory 설정 
	   @Bean
	   public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
	      SqlSessionFactoryBean sessionFactory=new SqlSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource);
	      return  sessionFactory.getObject();
	   }
	
}

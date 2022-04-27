package com.example.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean sessionFactory=new SqlSessionFactoryBean();
	      sessionFactory.setDataSource(dataSource);
	      return sessionFactory.getObject();
	}
	//@Bean : 스프링에 필요한 객체를 생성
	//sqlSessionFactory() : MyBatis의 SqlSessionFactory를 반환한다
	//스프링 부트가 실행될 때 DataSource객체를 이 메서드 실행시 주입해서 결과를 만들고,
	//그 결과를 스프링 내 빈으로 사용하게 된다
}

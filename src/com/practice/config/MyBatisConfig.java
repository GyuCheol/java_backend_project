package com.practice.config;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static SqlSessionFactory sqlSessionFactory;  
	
	
	@Override
	public void init() throws ServletException {
		String resource = "com/practice/config/mybatis-config.xml";
		
		try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSessionFactory() {
		return sqlSessionFactory;
	}

	
}

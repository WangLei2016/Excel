package com.ssmm.dao;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserDao {
	private static final Logger logger = Logger
			.getLogger(TestUserDao.class);

	
	@Autowired
	private lxcUserMapper UserMapper;

	
	@Test
	public void getAll1(){
		String date="2016-10-17 23:59:59";
		Integer selectAllNumebr = UserMapper.selectAllNumebr(date);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+selectAllNumebr);
	
	}
}

package com.dan.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dan.seckill.entity.SuccessKilled;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
	
	@Autowired
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled() throws Exception {
		long id = 1001L;
		long phone = 18800000000L;
		int insertCount = successKilledDao.insertSuccessKilled(id, phone);
		System.out.println("insertCount="+insertCount);
	}
	
	@Test
	public void testQueryByIdWithSeckill() throws Exception {
		long id = 1001L;
		long phone = 18800000000L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
		System.out.println(successKilled);
		System.out.println(successKilled.getSeckill());
	}
	
}

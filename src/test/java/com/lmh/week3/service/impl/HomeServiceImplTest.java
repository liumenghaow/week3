package com.lmh.week3.service.impl;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lmh.common.utils.DateUtil;
import com.lmh.common.utils.RandomUtil;
import com.lmh.common.utils.StringUtil;
import com.lmh.week3.service.HomeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class HomeServiceImplTest {

	@Test
	public void testAdd() {
		String name = StringUtil.generateChineseName();
		String pone = RandomUtil.randomNumber(11);
		int id = RandomUtil.random(1, 3);
		Integer type_id=new Integer(id);
		Calendar c = Calendar.getInstance();
		c.set(2020, 4,1); 
		System.out.println(name+pone+"  "+id+c.getTime());
		Date ydtime = DateUtil.randomDate(c.getTime(), new Date());
		
		HomeService h=new HomeServiceImpl();
		h.add(ydtime, name, type_id, pone, Integer.parseInt("200"));
		
		
		
	}

}

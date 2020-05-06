package com.lmh.week3.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmh.week3.dao.HomeMapper;
import com.lmh.week3.domain.Home;
import com.lmh.week3.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Resource
	private HomeMapper homeMapper;

	@Override
	public PageInfo<Home> selects(Integer page, Integer pageSize, String name, Integer money1, Integer money2) {
		PageHelper.startPage(page, pageSize);
		List<Home> list = homeMapper.selects(name, money1, money2);
		
		return new PageInfo<Home>(list);
	}

	@Override
	public int add(Date ydtime, String name, Integer type_id, String pone, Integer money) {
		int i = homeMapper.add(ydtime, name, type_id, pone, money);
		return i;
	}

}

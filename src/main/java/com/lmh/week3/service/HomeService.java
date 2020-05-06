package com.lmh.week3.service;

import java.util.Date;


import com.github.pagehelper.PageInfo;
import com.lmh.week3.domain.Home;

public interface HomeService {

	PageInfo<Home> selects(Integer page,Integer pageSize,String name,Integer money1,Integer money2);
	int add(Date ydtime,String name,Integer type_id,String pone,Integer money);
}

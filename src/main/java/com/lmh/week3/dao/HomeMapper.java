package com.lmh.week3.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lmh.week3.domain.Home;

public interface HomeMapper {

	List<Home> selects(@Param("name")String name,@Param("money1")Integer money1,@Param("money2")Integer money2);
	
	int add(@Param("ydtime")Date ydtime,@Param("name")String name,@Param("type_id")Integer type_id,@Param("pone")String pone,@Param("money")Integer money);
}

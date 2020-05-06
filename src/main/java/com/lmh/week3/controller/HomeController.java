package com.lmh.week3.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.lmh.week3.domain.Home;
import com.lmh.week3.service.HomeService;

@Controller
public class HomeController {

	@Resource HomeService homeService;
	
	@RequestMapping("selects")
	public String selects(Model m,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "3")Integer pageSize,String name,Integer money1,Integer money2) {
		PageInfo<Home> info = homeService.selects(page, pageSize, name, money1, money2);
		m.addAttribute("info", info);
		return "list";
	}
}

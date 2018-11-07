package com.jxcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxc.dto.SysmenuDto;
import com.jxcdemo.business.ISysmenuBusiness;

@Controller
@RequestMapping("sysmenu")
public class SysmenuController {

	@Autowired
	ISysmenuBusiness imenuBll;

	@GetMapping(value = "/GetMenus")
	@ResponseBody
	public List<SysmenuDto> GetMenus() {
		List<SysmenuDto> list = imenuBll.GetMenus();
		return list;
	}
}

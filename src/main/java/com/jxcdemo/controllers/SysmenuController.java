package com.jxcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxcdemo.business.ISysmenuBusiness;
import com.jxcdemo.entitys.Sysmenu;

@Controller
@RequestMapping("sysmenu")
public class SysmenuController {

	@Autowired
	ISysmenuBusiness imenuBll;

	@GetMapping(value = "/GetMenus")
	@ResponseBody
	public List<Sysmenu> GetMenus() {
		return imenuBll.GetMenus();
	}
}

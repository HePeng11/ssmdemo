package com.jxcdemo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jxcdemo.dto.SysmenuDto;

@Service
public interface ISysmenuBusiness {
	/**
	 * 组装菜单层级数据并放入缓存
	 * @return
	 */
	List<SysmenuDto> GetMenus();
}

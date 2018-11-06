package com.jxcdemo.dao;

import java.util.List;

import com.jxcdemo.entitys.Sysmenu;

public interface SysmenuDao {
	/**
	 * 得到系统菜单集合
	 * @return
	 */
	List<Sysmenu> GetMenus();
}

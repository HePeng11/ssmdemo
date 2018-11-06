package com.jxcdemo.businessimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxcdemo.business.ISysmenuBusiness;
import com.jxcdemo.dao.SysmenuDao;
import com.jxcdemo.entitys.Sysmenu;

@Service
public class SysmenuBusiness implements ISysmenuBusiness {
	@Autowired
	SysmenuDao mDao;

	@Override
	public List<Sysmenu> GetMenus() {
		List<Sysmenu> list = mDao.GetMenus();
		return list;
	}

}

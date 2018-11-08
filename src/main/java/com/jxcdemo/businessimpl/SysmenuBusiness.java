package com.jxcdemo.businessimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxc.dto.SysmenuDto;
import com.jxcdemo.business.ISysmenuBusiness;
import com.jxcdemo.dao.SysmenuDao;
import com.jxcdemo.entitys.Sysmenu;

@Service
public class SysmenuBusiness implements ISysmenuBusiness {
	@Autowired
	SysmenuDao mDao;

	@Override
	public List<SysmenuDto> GetMenus() {
		List<Sysmenu> list = mDao.GetMenus();
		List<SysmenuDto> result = new ArrayList<SysmenuDto>();
		list.forEach(f -> {
			if (f.getParentId() == 0) {
				result.add(new SysmenuDto(f.getId(), f.getText(), f.getIcon(), f.getUrl()));
			}
		});
		convert(list, result);

		return result;
	}

	/**
	 * 转换dto  以后存redis
	 * 
	 * @param list
	 * @param result
	 */
	private void convert(List<Sysmenu> list, List<SysmenuDto> result) {
		for (SysmenuDto menuDto : result) {
			List<Sysmenu> children = list.stream().filter(f -> f.getParentId() == menuDto.getId())
					.collect(Collectors.toList());
			if (children.size() > 0) {
				for (Sysmenu item : children) {
					if (menuDto.getChildren() == null) {
						menuDto.setChildren(new ArrayList<SysmenuDto>());
					}
					menuDto.getChildren().add(new SysmenuDto(item.getId(), item.getText(), item.getIcon(), item.getUrl()));
					//list.remove(item);
				}
				convert(list, menuDto.getChildren());
			}
		}

	}

}

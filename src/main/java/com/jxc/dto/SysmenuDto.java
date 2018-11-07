package com.jxc.dto;

import java.util.List;

public class SysmenuDto {
	private int id;
	private String text;
	private String icon;
	private String url;
	private String targetType;
	private List<SysmenuDto> children;

	public SysmenuDto(int id, String text, String icon, String url) {
		super();
		this.id = id;
		this.text = text;
		this.icon = icon;
		this.url = url;
		this.targetType = "iframe-tab";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTargetType() {
		return targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public List<SysmenuDto> getChildren() {
		return children;
	}

	public void setChildren(List<SysmenuDto> children) {
		this.children = children;
	}

}

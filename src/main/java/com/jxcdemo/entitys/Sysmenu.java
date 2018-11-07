package com.jxcdemo.entitys;


public class Sysmenu {
	
	private int id;
	private String text;
	private String icon;
	private String url;
	private int parentId;
	
	@Override
	public String toString() {
		return "Sysmenu [id=" + id + ", text=" + text + ", icon=" + icon + ", url=" + url + ", parentId=" + parentId
				+ "]";
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
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	
	
}

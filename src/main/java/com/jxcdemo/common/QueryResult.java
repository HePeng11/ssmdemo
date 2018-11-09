package com.jxcdemo.common;

import java.util.List;

/**
 * 查询返回结果 { "code": 0, "msg": "", "count": 1000, "data": [{}, {}] }
 * 配合layui
 * @author hepeng
 *
 */
public class QueryResult<T> {
	/**
	 * 状态码 默认0 为查询成功
	 */
	private int code;
	private String msg;
	private int count;
	private List<T> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}

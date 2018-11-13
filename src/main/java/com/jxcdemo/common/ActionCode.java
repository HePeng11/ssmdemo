package com.jxcdemo.common;

/**
 * 操作结果码
 * @author hepeng
 *
 */
public enum ActionCode {
	Success(1, "成功"), Failed(2, "失败");

	private String description;
	private Integer index;

	private ActionCode(int index, String description) {
		this.description = description;
		this.index = index;
	}

	@Override
	public String toString() {
		return this.index.toString();
	}
}

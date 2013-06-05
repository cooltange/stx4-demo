package com.stx.demo.util;

import java.util.List;

/**
 * 封装分页数据
 * 
 * @author getan
 * 
 */
public class Pager {
	/** 默认每页显示条数 */
	public static final int DEFAULT_MAX_PAGE_ITEMS = 10;
	/** 总记录数 */
	private int total;
	/** 保存分页记录列表 */
	private List<Object> dataList;
	/** 开始记录偏移量 */
	private int offset;
	/** 每页最大显示条数 */
	private int maxPageItems = DEFAULT_MAX_PAGE_ITEMS;
	
	/** 分页查询条件 */
	private Object[] params;

	public Pager() {
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getMaxPageItems() {
		return maxPageItems;
	}

	public void setMaxPageItems(int maxPageItems) {
		this.maxPageItems = maxPageItems;
	}
	
	public List<Object> getDataList() {
		return dataList;
	}

	public void setDataList(List<Object> dataList) {
		this.dataList = dataList;
	}

	/**
	 * 计算总页面数
	 */
	public int getMaxPageNumber() {
		return (total - 1) / getMaxPageItems() + 1;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

}

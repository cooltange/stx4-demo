package com.stx.demo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.stx.demo.util.Pager;

/**
 * 分页查询基类
 * 
 * @author getan
 * 
 */
public class PagerAction extends ActionSupport {
	// 分页工具对象
	private Pager pager;

	public Pager getPager() {
		if (pager == null)
			pager = new Pager();
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

}

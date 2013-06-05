package com.stx.demo.util;

import java.util.ArrayList;

/**
 * 分页SQL工具类
 * 
 * @author getan
 *
 */
public class PageSQLUtil {

	private final String templet = " AND %s %s '%s' ";
	private String baseSql;
	private String countBaseSql;
	private ArrayList<SQLParam> params = new ArrayList<SQLParam>();

	public PageSQLUtil(String baseSql, String countBaseSql) {
		this.baseSql = baseSql;
		this.countBaseSql = countBaseSql;
	}

	/**
	 * 要求baseSql带有where条件
	 * 
	 * @param baseSql
	 */
	public void setBaseSql(String baseSql) {
		this.baseSql = baseSql;
	}

	public void addParam(SQLParam param) {
		params.add(param);
	}

	public String getPageSql(int offset,int maxPageItems) {
		StringBuilder pageSql = new StringBuilder();
		pageSql.append("select t.* from (select rownum rn, s.* from (");
		pageSql.append(baseSql);
		pageSql.append(" where 1=1");
		for (SQLParam p : params) {
			// TODO
			if (p.getValue() != null && !"".equals(p.getValue())) {
				String valueStr = p.getValue().toString();
				if(valueStr.contains("null")){
					valueStr = valueStr.replaceAll("null", "");
				}
				pageSql.append(String.format(templet,p.getField(),p.getOperator(),valueStr));
			}
		}

		pageSql.append(" ) s where rownum <=  ");
		pageSql.append(offset + maxPageItems);
		pageSql.append(" ) t where t.rn > ");
		pageSql.append(offset);

		return pageSql.toString();
	}
	
	public String getCountSql(){
		StringBuilder countSql = new StringBuilder(countBaseSql);
		countSql.append(" where 1=1");
		for (SQLParam p : params) {
			// TODO
			if (p.getValue() != null && !"".equals(p.getValue())) {
				String valueStr = p.getValue().toString();
				if(valueStr.contains("null")){
					valueStr = valueStr.replaceAll("null", "");
				}
				countSql.append(String.format(templet,p.getField(),p.getOperator(),valueStr));
			}
		}
		return countSql.toString();
	}

}

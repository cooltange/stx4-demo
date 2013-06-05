<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="pg" uri="http://jsptags.com/tags/navigation/pager"%>
<link href="${pageContext.request.contextPath}/css/pager.css" type="text/css" rel="stylesheet" />
<div>
	<c:if test="${pager.total >= 1}">
		<pg:pager url="${param.url}" maxPageItems="${pager.maxPageItems}"
			items="${pager.total}" export="offset,currentPageNumber=pageNumber"
			maxIndexPages="6">
			<%
				// 在会话中存放当前页面的位置
				request.getSession().setAttribute("pos", offset);
			%>
			<div class="pager">
				<span class='count'>共<b>${pager.maxPageNumber}</b>页 <b>${pager.total}</b>条记录
				</span>
				<c:if test="${currentPageNumber != 1}">
					<pg:first>
						<a href="${pageUrl}&${param.conditions}">首页</a>
					</pg:first>
				</c:if>
				<pg:prev>
					<a href="${pageUrl}&${param.conditions}">&lt;上页</a>
				</pg:prev>
				<pg:pages>
					<c:if test="${pageNumber == currentPageNumber}">
						<span class='current'>${pageNumber}</span>
					</c:if>
					<c:if test="${pageNumber != currentPageNumber}">
						<a href="${pageUrl}&${param.conditions}">${pageNumber}</a>
					</c:if>
				</pg:pages>
				<pg:next>
					<a href="${pageUrl}&${param.conditions}">下页&gt;</a>
				</pg:next>
				<c:if test="${currentPageNumber != pager.maxPageNumber}">
					<pg:last>
					<a href="${pageUrl}&${param.conditions}">末页</a>
					</pg:last>
				</c:if>
			</div>
		</pg:pager>
	</c:if>
	<c:if test="${pager.total == 0}">
    	　没有相关消息
    </c:if>
</div>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
 陈德元：


 课程地址：http:///details/7ae3d7eddc4742f78b0548aa8bd9ccdb
 -->
<div class="panelBar">
	<div class="pages">
		<span>显示</span>
		<select theme="simple" cssClass="combox" name="numPerPage"
			value="${pageBean.numPerPage}" onchange="navTabPageBreak({numPerPage:this.value})">
			<c:forEach begin="15" end="100" step="5" varStatus="s">
				<option value="${s.index}" ${pageBean.numPerPage eq s.index ? 'selected="selected"' : ''}>${s.index}</option>
			</c:forEach>
		</select>
		<span> 条,共<a style="color: red">${pageBean.totalCount}</a>条, 共${pageBean.totalPage}页, 当前第${pageBean.currentPage}页 </span>
	</div>
	<div class="pagination" targetType="navTab"
		totalCount="${pageBean.totalCount}" numPerPage="${pageBean.numPerPage}"
		pageNumShown="10"
		currentPage="${pageBean.currentPage}"></div>
</div>
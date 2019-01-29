<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
	            <th scope="col">글번호</th>
	            <th scope="col">flag</th>
	            <th scope="col">Rank</th>
	            <th scope="col">클리어 시간</th>
	            <th scope="col">클리어 날짜</th>
	        </tr>
	    </thead>
	    <tbody>
	    <!-- Memory 출력 -->
	        <c:choose>
	            <c:when test="${fn:length(list) > 0}">
	                <c:forEach items="${list}" var="list" varStatus="rowcnt">
	                    <tr>
	                        <td>${list.memoryIdx}</td>
	                        <td>${list.memoryflag}</td>
	                        <td>${list.memoryRank}</td>
	                        <td>${list.memorySec}</td>
	                        <td>${list.memoryDate}</td>
	                    </tr>
	                </c:forEach>
	            </c:when>
	            <c:otherwise>
	                <tr>
	                    <td colspan="4">조회된 결과가 없습니다.</td>
	                </tr>
	            </c:otherwise>
	        </c:choose>
	    </tbody>
	</table>
	

</body>
</html>
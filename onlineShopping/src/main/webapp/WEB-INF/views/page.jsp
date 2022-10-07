<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Online Shopping - ${title}</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="${images}/favicon.ico" />
<!-- Bootstrap icons-->

<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link rel="stylesheet" href="${css}/styles.css" />
</head>
<body>

	<div>
		<!-- Navigation-->
		<%@include file="./shared/navbar.jsp"%>
	</div>

	<!-- Only When User Click userClickAllProducts or userClickCategoryProducts -->
	<c:if test="${userClickAllProducts == true  or  userClickCategoryProducts == true }">
		<%@include file="listProduct.jsp"%>
	</c:if>

	<!--Page Content / Home Content  -->
	<!-- Only When User Click Contact Us -->
	<c:if test="${userClickContactUs == true }">
		<%@include file="contactUs.jsp"%>
	</c:if>

	<!-- Only When User Click Home , / , index  -->
	<c:if test="${userClickHome == true }">
		<%@include file="home.jsp"%>
	</c:if>
	<!-- Only When User Click About Us -->
	<c:if test="${userClickAboutUs == true }">
		<%@include file="aboutUs.jsp"%>
	</c:if>

	<!-- Footer-->
	<%@include file="./shared/footer.jsp"%>


	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<!-- Core theme JS-->
	<script type="text/javascript" src="/${js}/scripts.js"></script>

</body>
</html>

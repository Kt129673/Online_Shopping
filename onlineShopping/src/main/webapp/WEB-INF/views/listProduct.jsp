<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">

	<div class="col-md-12">

		<!--Added Breadcrumb Component  -->
		<div class="row">

			<div class="col-lg-12"	>
			<c:if test="${userClickAllProducts == true }">
				<ol  class="breadcrumb">
					<li "breadcrumb-item"><a href="${contextRoot}/home">Home </a></li>
					<li class="breadcrumb-item active" aria-current="page">All Product</li>
				</ol>
			</c:if>
			
			<c:if test="${userClickCategoryProducts == true }">
				<ol  class="breadcrumb">
					<li class="breadcrumb-item"><a href="${contextRoot}/home">Home </a></li> 
					<li class="breadcrumb-item active" aria-current="page"> Category</li>
					<li class="breadcrumb-item active" aria-current="page"> ${cat.name} </li>
				</ol>
			</c:if>
			
			</div>
			
			
			
			
		</div>




	</div>



</div>
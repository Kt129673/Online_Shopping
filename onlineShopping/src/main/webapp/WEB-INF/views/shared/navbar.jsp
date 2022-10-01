<%@page import="com.ecom.shoppingBackend.dto.Category"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container px-4 px-lg-5">
		<a class="navbar-brand" href="">BUGA.COM</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
				<li class="nav-item"><a class="nav-link active" aria-current="page" href="${contextRoot}/home">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="${contextRoot}/aboutUs">About Us</a></li>
				<li class="nav-item"><a class="nav-link" href="${contextRoot}/contactUs">Contact Us</a></li>
				<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a class="dropdown-item" href="${contextRoot}/show/all/products">All Products</a></li>
						<li><hr class="dropdown-divider" /></li>
						<li><a class="dropdown-item" href="#!">Popular Items</a></li>
						<li><a class="dropdown-item" href="#!">New Arrivals</a></li>
						<li><a class="dropdown-item" href="${contextRoot}/listProducts">View Products</a></li>
					</ul></li>

				<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" id="navbarDropdown1" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop With Category</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<c:forEach items="${categories}" var="cat">
							<li><a class="dropdown-item" href="${contextRoot}/show/category/${cat.id}/products"> ${cat.name}</a></li>
						</c:forEach>
					</ul></li>
			</ul>
			<form class="d-flex">
				<button class="btn btn-outline-dark" type="submit">
					<i class="bi-cart-fill me-1"></i> Cart <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
				</button>
			</form>
		</div>
	</div>
</nav>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.builder.Room" %>
<!DOCTYPE html>
<html>
<head>
<title>Room Summary</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Room Order Summary</h2>
		<p>
			<strong>Number of Beds:</strong> ${room.numberOfBeds}
		</p>
		<p>
			<strong>view:</strong> ${room.view}
		</p>
		<p>
			<strong>type:</strong> ${room.type}
		</p>
<%--		<ul>--%>
<%--			<%--%>
<%--    Pizza pizza = (Pizza) request.getAttribute("pizza");--%>
<%--    if (pizza != null && pizza.getToppings() != null) {--%>
<%--        for(String topping : pizza.getToppings()) {--%>
<%--%>--%>
<%--			<li><%= topping %></li>--%>
<%--			<%--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>
<%--		</ul>--%>
		<a href="orderRoom.jsp" class="btn btn-primary">Order Another
			Room</a>
	</div>
</body>
</html>
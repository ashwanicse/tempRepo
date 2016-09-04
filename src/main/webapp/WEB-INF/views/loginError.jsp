<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>home</title>
<c:import url="resources/htmlPages/head.html"></c:import>
<style type="text/css">
    body{
        padding-top: 70px;
    }
   <!-- slider css started -->
    .carousel{
    background: #2f4357;
    margin-top: 30px;
}
.carousel .item img{
    margin: 0 auto; /* Align slide image horizontally center */
}
.bs-example{
	margin: 30px;
}
.carousel-inner > .item > a > img {
    width: 100%;
	height:30%;
}
<!-- slider css closed-->
</style>
<!--          Header Section         -->
</head>
<body>
<!--          dropdown Section         -->
<c:import url="resources/htmlPages/headerMenu.html"></c:import>

<div class="container">
   
    <h1>login error page</h1>
	 <hr>
   <!--  footer -->
   <c:import url="resources/htmlPages/footer.html"></c:import>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Login</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <link rel="stylesheet" href="main.css">  
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  
  <!-- to be erased once css connection is fixed -->  
<style type="text/css">
body{
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover
}
.frosted {
     background:rgba(255,255,255, 0.75);
    padding: 20;
}
</style>  
</head>





<body style = "background-image: url(https://cdn.pixabay.com/photo/2017/06/27/11/48/team-spirit-2447163_960_720.jpg);">
<div class = " frosted text-right">
   <a href = "/employeeLogin" >Employee Login</a>
</div>
<div class="jumbotron text-center banner frosted " >
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0" class="logo img-circle col-md-4 " alt="hands holding a family">
  <h1>Assure Insurance </h1>
  <p>You're In Good Hands with Assure Insurance</p> 
</div>
    <div class="container frosted" >
        
 <sf:form action= "employeeOverview" class = "form-group" modelAttribute = "employee" >
 	<div class="row">
 <label class="control-label col-sm-2 col-lg-offset-4" for="email">Employee Email:</label><sf:input path="email" />
 		</div>
 		<div class = "row">
   	<label class="control-label col-sm-2 col-lg-offset-4" for="password">Password:</label><sf:input type="password" path="password"/>
   	</div>
   	<div class = "row">
   		<input class=" col-sm-2 col-lg-offset-4" type=submit value = "login"/> 
   		<input class=" col-sm-2 " type="reset" value = "clear"/>
   		</div>
   		<div class = "row">
   		<button class="control-label col-sm-2 col-lg-offset-5" >Go Back</button>
   		</div>
    </sf:form>
    
    </div>
    
   
   
    
</body>
</html>
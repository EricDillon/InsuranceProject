<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>
<%@ taglib prefix = "jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Overview</title>
    
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



<body style = "background-image: url(https://cdn.pixabay.com/photo/2017/05/18/11/04/key-2323278_960_720.jpg);">
<div class = " frosted text-center">
    <div class="container">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdyH1-62h85KJb2mQ9ui8lG_4Jn4iw_UaEHSx16P5BaO6D2tU0" class="logo img-circle col-md-4 " alt="hands holding a family">
        <div class="col-sm-12 col-md-4  col-lg-6">
   <h1 >Assure Insurance </h1>
  <p  class = "hidden-lg-down">You're In Good Hands with Assure Insurance</p>
        </div>
    </div>
</div>
<div class="container frosted" >
        

<sf:form action = "editClaim" modelAttribute = "claim">
			Claim Id:<sf:input path="id"/>
	 		<input type="Submit" value="Update Claim"/>
 </sf:form>
</div>
 <div class="container frosted mainCenter" >
        <div class="row ">
            
            <table class="col-sm-10 col-md-6  col-lg-10 align-items-center text-center">
            <tr><th>Claim ID</th><th>Polocy Number</th> <th>Incident Date</th><th>Incident Description</th><th>Status</th></tr>
           
            <jstl:forEach items="${claims}" var="claim" >
            
            <tr><td>${claim.id}</td>
           	<td>${claim.policyNum}</td>
            <td>${claim.claimDate}</td>
            <td><textarea rows="5" cols="30">${claim.claimDescription}</textarea></td>
            <td>${claim.getTextStatus()}</td>
                <td><a href= "editClaim/?id=${claim.id}">View Claim</a></td></tr>
          </jstl:forEach>
		    </table>     
     </div>
    </div>
</body>
</html>
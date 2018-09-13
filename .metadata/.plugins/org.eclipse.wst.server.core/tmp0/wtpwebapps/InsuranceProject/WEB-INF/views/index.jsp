<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
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
<body style = "background-image: url(images/hands.jpg);">
<div class = " frosted text-right">
   <a href = "employeeLogin" >Employee Login</a>
</div>
<div class="jumbotron text-center banner frosted " >
  <h1>Assure Insurance </h1>
  <p>You're In Good Hands with Assure Insurance</p> 
</div>
    <div class="container frosted" >
        <div class="row">
        
 <!--  col #1   -->       
            <div class="col-sm-12 col-md-4  col-lg-6">
               <form action = "makeclaim">
                   <button type="Submit"  class="btn btn-danger btn-block"> <h1>Make A Claim</h1></button>
                </form><br><br>
                 <form action = "register">
                   <button type="Submit"  class="btn btn-info btn-block"> <h2>Register</h2></button>
                </form>
           </div><!-- out col #1 -->
           
<!--  col #2   -->
            <div class="col-sm-12 col-md-4  col-lg-6 text-center align-middle">  
				 <sf:form action= "clientLogin" modelAttribute = "customer" >
   					<table>
   						<tr><th>Email:</th> <td><sf:input path="email" /></td></tr>
   						<tr><th>Password:</th><td><sf:input type="password" path="password"/></td></tr>
   						<tr><td><input type=submit value = "login"/> </td><td><input type="reset" value = "clear"/></td>
   					</table>
    			</sf:form>
    		</div> <!-- out col #2 -->
    	</div> <!-- out row -->
    </div> <!-- out container -->
    
</body>
</html>
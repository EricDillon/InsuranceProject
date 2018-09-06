<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix ="sf" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>makeClaim</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
<sf:form action= "submitClaim" modelAttribute ="claim" method = "post">
		<%-- <sf:input path="claimId" placeholder = "Claim id"/><br> --%>
		<sf:input path="policyNum" placeholder = "Policy Number"/><br>
		<%-- <sf:select path="status">
                <sf:option value="open">Open</sf:option>
                <sf:option value="processing">Processing</sf:option>
                <sf:option value="approved">Approved</sf:option>
                <sf:option value="rejected">Rejected</sf:option>
                <sf:option value="closed">closed</sf:option>
            </sf:select> --%>
		<%-- <sf:input type= "date" path="inspectionDate" placeholder = "Inspection Date"/><br> --%>
		<sf:input type= "date" path="claimDate"/><br>
		<%-- <sf:input path="assessor"/><br> --%>
		<sf:input path="claimDescription"/><br>
		<input type=Submit value="Submit Claim">
		<input type = "reset" value = "Clear">
		

</sf:form>

</body>
</html>
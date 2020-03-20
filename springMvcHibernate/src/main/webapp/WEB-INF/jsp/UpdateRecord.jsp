<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>  
<body>  

<form:form action="RecordUpdated" modelAttribute="ipojo">  
       ID: <form:input path="identification" />         
         <br> <br> <br> 
       
       Name: <form:input path="name" />     
    <br> <br> <br> 
       
     Salary: <form:input path="sal" />
  <br> <br> <br> 
       
    <input type="submit" value="Submit" /> 
    </form:form> 




</body>  
</html>  
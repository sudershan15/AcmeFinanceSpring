<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String radiovalue=request.getParameter("radio1");
if(radiovalue==null)
{
	%>
<jsp:forward page="error.jsp" />
<%
}
else if(radiovalue.equalsIgnoreCase("historical")){
%>
<jsp:forward page="historicaldata.jsp" />
<%}else if(radiovalue.equalsIgnoreCase("snapshot")){ %>
<jsp:forward page="snapshotdata.jsp" />
<%}else if(radiovalue.equalsIgnoreCase("analyzed")){ %>
<jsp:forward page="analyzeddata.jsp" />
<%}  
else if(radiovalue.equalsIgnoreCase("Temporal"))
{
%>
<jsp:forward page="Sector.jsp"></jsp:forward>
<%} 
else if(radiovalue.equalsIgnoreCase("Spatial")){%>
<jsp:forward page="Countries.jsp"></jsp:forward>
<%
} 
%>
</body>
</html>
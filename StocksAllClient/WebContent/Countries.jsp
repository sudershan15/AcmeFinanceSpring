<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ page import="frontend.historical.*" %> 
<%@ taglib prefix="s" uri="/struts-tags"%>
  
 <%@ page language="java" import="java.sql.*" %>
    <%@ page language="java" import="java.lang.*" %>
    <%@ page language="java" import="java.math.*" %>
     
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
<title>Hello World</title>
</head>
<body>
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
 <tr>
    	<td width="50%"><img src="img/topleft.jpg" border="0" width="372" height="106" /></td>
      <td><img src="img/Untitled.png" width="445" height="107" /></td>
      <td width="50%"><p align="right" /></td>
   </tr>
  </table>
</div>
  
 
  
 
   
   <form method="post"  action="SpatialData.jsp"  >
     <center> <label for="name"><h2>Select a country</h2></label> <br/>
      <select name="Country">
         
        <%
       String driver = "org.gjt.mm.mysql.Driver";
		Class.forName(driver).newInstance();
		Connection con=null;
		ResultSet rst=null;
		 
		Statement stmt=null;
		
		try{
			 
			String url="jdbc:mysql://localhost:3306/mydatabase?user=root&password=0989";
            con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			 
			rst=stmt.executeQuery("select countries from countries");
			 
			while(rst.next())
		{
		 
    	  
    	
    	  
		
     
		
    	%>
    	  <option value="<%=rst.getString(1) %>" onclick="populate()"> <%=rst.getString(1)%></option>
    	
    	 
    	 
		
		<% 
		}
			  
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
  	  
    	 
		   
    %> 
    </select>
    
    
  	  
  
      
    
      
      
    
    
        <br><br><br><br>
         <input type="submit" value="Submit" ></center>
        <div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
    <tr>
      <td width="100%"><font size="1">&nbsp;</font></td>
    </tr>
    <tr>
</td>
    <td width="1%" valign="top">
      <p align="right">	<img src= "img/but-top.jpg" border="0" width="136" height="22"/><br/>
      					<img src= "img/button1.jpg" border="0" width="136" height="43"/><br/>
      					<img src=" img/button2.jpg" border="0" width="136" height="50"/><br/>
      					<img src=" img/button3.jpg" border="0"  width="136" height="49"/><br/>
      					<img src=" img/button4.jpg" border="0" width="136" height="52"/><br/>
      					<img src=" img/butbot.jpg" border="0" width="136" height="40"/>
      </p>
    </td>
  </tr>
  </table>
</div>
<div align="center">
   <table border="0" width="90%" cellspacing="0" cellpadding="0">
    <tr>
      <td width="100%"><font size="1">&nbsp;</font></td>
    </tr>
  </table>
</div>
        
   </form>
   
</body>
</html>
<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">

   
 <%@ page language="java" import="java.sql.*" %>
    <%@ page language="java" import="java.lang.*" %>
    <%@ page language="java" import="java.math.*" %>

<head>
 
 
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body bgcolor="#FFFFFF">
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
 <tr>
      <td width="50%"><img src="img/topleft.jpg" border="0" width="372" height="106" /></td>
      <td><img src="img/Untitled.png" width="445" height="107" /></td>
      <td width="50%"><p align="right" /></td>
   </tr>
  </table>
</div>
 
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
    <tr>
      <td width="100%"><font size="1">&nbsp;</font></td>
    </tr>
    <tr>
<marquee bgcolor="black"> <font color="white"> 
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
			rst=stmt.executeQuery("select * from stocks");	
		while(rst.next()){
   		
    	int cntr=0;
    	cntr--; 
    	float str1=rst.getFloat("open"); 
    	float str2=rst.getFloat("close");
    	String str3=rst.getString("symbol");
    	float F1=(str2-str1)/100;
    	//float F2=(Float.valueOf(str2.trim()).floatValue());
      
    	out.println(str3+"%"+F1);
    	
    	out.println("||");
        }
		} 
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
    %>  
    </font> </marquee> 
    </tr>
  </table>
</div>
    		<form name="form1" id="form1" method="post" action="redirect.jsp" >
			 
  			<p>Select type of data you want to retrieve  </p>
  			<p>	<input type="radio" name="radio1"   id="historical" value="historical" )"/> Historical
    			<input type="radio" name="radio1"   id="snapshot" value="snapshot"  />Snapshot
   				<input type="radio" name="radio1"   id="analyzed" value="analyzed"   />Analyzed(Get Top 5 Stock Trades of the company )  </p>
   				<input type="radio" name="radio1"   id="Temporal" value="Temporal"   />Temporal
   				<input type="radio" name="radio1"   id="Spatial" value="Spatial"   />Spatial
 			 
  			<p><input name="Submit" type="submit" value="Submit" "/>
  			<a href="upload.jsp">Click here to upload file</a>
  			</p>
			</form>
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


</body>
</html>
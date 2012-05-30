<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function validate()
{
	var x=document.forms["xml"]["text"].value;
	if (x==null || x=="")
	  {
	  alert("enter a date!");
	  return false;
	  }
	else 
		{
		return true;
		}
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Analyzed Data</title>
</head>

<body bgcolor="#FFFFFF">
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
 <tr>
      <td width="50%"><img src="img/topleft.jpg" border="0" width="372" height="106" /></td>
      <td><img src="img/Untitled.png" width="445" height="107" /></td>
      <td width="50%"><p align="right" />  </td>
   </tr>
  </table>
</div>
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
    <tr>
      <td width="100%"><font size="1">&nbsp;</font></td>
    </tr>
    <tr>
	 
  </table>
</div>
<div align="center">
  <table border="0" width="90%" cellspacing="0" cellpadding="0">
    <tr>
      <td width="99%" valign="top"><br/>
    	<form name="xml" id="xml" method="post" action="analyzedxml" onsubmit="return validate()">
    	<p>Enter Date: <input type="text" name="text"  />
  			<p>Select type of data you want to retrieve  </p>
  			 <input type="submit" value="xml" name="submit"/>
  			 <input type="submit" value="csv" name="submit" />
  			 <input type="submit" value="json" name="submit"/>
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
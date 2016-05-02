<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Hello struts2</title>
	
  </head>
  
  <body>
  	Hello struts2
  	s会出现吗：<s:property value="#parameters.s"/>
  	q会出现吗：<s:property value="#parameters.q"/>
  	<s:debug></s:debug>
  </body>
</html>
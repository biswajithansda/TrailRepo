<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int a=50; %>
<%Student stu=(Student)session.getAttribute("student");
out.println(stu);
//response.sendRedirect("display2.jsp");
%>
<%=a %>
<a href="display2.jsp">to display2</a>
</body>

</html>
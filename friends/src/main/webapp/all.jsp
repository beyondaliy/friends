<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>person list</title>
    </head>
    <body>
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
            </tr>
            
            <c:forEach items="${persons}" var="person">
                <tr>
                    <td>${person.id }</td>
                    <td>${person.name }</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
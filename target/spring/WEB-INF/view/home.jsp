<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <body>
<form action="index" method="post">
    <input type="text" id="cusname" name="customername" placeholder="CustomerName">
    <input type="text" id="cuscar" name="carname" placeholder="CarName">
    <input type="number" id="tnno" name="tnno"placeholder="TnNo">
    <input type="text" id="ranking"  name="ranking"placeholder="Ranking">
    <input type="submit" name="submit" value="Submit">
</form>
</body>
</html>
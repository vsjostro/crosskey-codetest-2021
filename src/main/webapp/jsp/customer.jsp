<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>


<div class="container">


    <h1>Customer monthly payments</h1>
        <table class="table table-hover table-bordered">
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Total Loan</th>
                <th scope="col">Interest</th>
                <th scope="col">Years</th>
                <th scope="col">Monthly payment</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${customerList}" var="customer">
                <tr>
                    <td>${customer.name} </td>
                    <td>${customer.loanTotal} </td>
                    <td>${customer.interest} %</td>
                    <td>${customer.years} </td>
                    <td>${customer.monthlyPayment} €</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    <a href="/" class="btn btn-primary" >Mortgage calculator</a>

</div>

</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>


<div class="container">
    <ul class="p-3 nav nav-pills">
        <li class="nav-item">
            <a class="nav-link" href="/">Mortgage calculator</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/customer">Customer database</a>
        </li>
    </ul>

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


        <%--        --%>
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

</div>

</body>
</html>

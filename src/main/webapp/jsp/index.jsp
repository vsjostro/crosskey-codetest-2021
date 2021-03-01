<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mortgage calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">

</head>
<body>


<div class="container">
    <ul class="p-3 nav nav-pills">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/">Mortgage calculator</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/customer">Customer database</a>
        </li>
    </ul>
    <h1>Mortgage calculator</h1>
    <div class="card d-flex justify-content-center">
        <div class="card-body">
            <form action="/" method="post">
                <label for="customerName" class="form-label">Name</label>
                <div class="input-group mb-3">
                    <input type="text" class="form-control" id="customerName" name="customerName"  value="${customerName}" maxlength="50">
                </div>
                <label for="loanTotal" class="form-label">Total loan</label>
                <div class="input-group mb-3">
                    <input type="number" class="form-control" id="loanTotal" name="loanTotal"  value="${loanTotal}" min="1" maxlength="20" step="0.01"
                           required>
                    <span class="input-group-text">€</span>
                </div>
                <label for="interest" class="form-label">Interest</label>
                <div class="input-group mb-3">
                    <input type="number" class="form-control" id="interest" name="interest" value="${interest}" min="0" maxlength="3" step="0.01"
                           required>
                    <span class="input-group-text">%</span>
                </div>
                <label for="years" class="form-label">Years to pay loan</label>
                <div class="mb-3">
                    <input type="number" class="form-control" id="years" name="years" value="${years}" min="1" maxlength="3" required>
                </div>

                <div class="form-check">

                    <label for="addCustomer" class="form-check-label">Add to database?</label>
                    <input class="form-check-input" type="checkbox" id="addCustomer" name="addCustomer" value="true">

                </div>
                <button type="submit" class="btn btn-primary">Calculate</button>

                <p class="lead">${monthlyPayment}</p>


            </form>
        </div>
    </div>

</div>

</body>
</html>
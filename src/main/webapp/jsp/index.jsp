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
    <h1>Mortgage calculator</h1>
    <div class="card d-flex justify-content-center" >
        <div class="card-body">
            <form action="/" method="post">
                <div class="mb-3">
                    <label for="loanTotal" class="form-label">Total loan</label>
                    <input type="number" class="form-control" id="loanTotal" name="loanTotal" value="${loanTotal}" required>
                </div>
                <div class="mb-3">
                    <label for="interest" class="form-label">Interest</label>
                    <input type="number" class="form-control" id="interest" name="interest" value="${interest}" required>
                </div>
                <div class="mb-3">
                    <label for="years" class="form-label">Years to pay loan</label>
                    <input type="number" class="form-control" id="years" name="years" value="${years}" required>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>

                <p class="lead">${monthlyPayment}</p>

                <a class="btn btn-primary" href="customer">Customer database</a>

            </form>
        </div>
    </div>

</div>

</body>
</html>
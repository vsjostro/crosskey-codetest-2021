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
    <div class="card">
        <div class="card-body">
            <form action="/" method="post">
                <div class="mb-3">
                    <label for="loanTotal" class="form-label">Total loan</label>
                    <input type="text" class="form-control" id="loanTotal" name="loanTotal" value="${loanTotal}">
                </div>
                <div class="mb-3">
                    <label for="interest" class="form-label">Interest</label>
                    <input type="text" class="form-control" id="interest" name="interest" value="${interest}">
                </div>
                <div class="mb-3">
                    <label for="years" class="form-label">Years to pay loan</label>
                    <input type="text" class="form-control" id="years" name="years" value="${years}">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>

                <p class="lead">${monthlyPayment}</p>

            </form>
        </div>
    </div>

</div>

</body>
</html>
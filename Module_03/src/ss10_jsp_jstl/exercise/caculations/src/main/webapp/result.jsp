<%--
  Created by IntelliJ IDEA.
  User: Test
  Date: 02/10/2023
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Simple Calculation</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="home bg-success">
    <div class="d-flex justify-content-center">
        <h1>Simple Calculator</h1>
    </div>
    <div class="d-flex justify-content-center">
        <form action="/CalculationServlet" method="post">
            <fieldset>
                <div class="mb-3">
                    <label class="form-label">First operand</label><br>
                    <label>
                        <input type="text" class="form-control" value="${first_operand}">
                    </label>
                </div>
                <div class="mb-3">
                    <label class="form-label">Operator </label><br>
                    <label>
                        <input type="text" class="form-control" value="${operator}">
                    </label>
                </div>
                <div class="mb-3">
                    <label class="form-label">Second operand</label><br>
                    <label>
                        <input type="text" class="form-control" value="${second_operand}">
                    </label>
                </div>
                <div class="mb-3">
                    <label class="form-label">Result</label><br>
                    <label>
                        <input type="text" class="form-control" value="${result}">
                    </label>
                </div>
            </fieldset>
        </form>
    </div>
    <h1 style="text-align: center; color: red">${stringException}</h1>
</div>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>

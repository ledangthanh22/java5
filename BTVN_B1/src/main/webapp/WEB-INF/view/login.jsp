<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="col-md-6 offset-3">
        <form action="/login" method="post">
            <div class="row mt-4">
                <label>Username</label>
                <input type="text" name="username" class="form-control">
                <span style="color:red;">${messUser}</span>
            </div>

            <div class="row mt-4">
                <label>Password</label>
                <input type="password" name="password" class="form-control">
                <span style="color:red;">${messPass}</span>
            </div>
            <span style="color:red;">${mess}</span>
            <div class="row mt-4">
                <div class="col-md-4">
                    <button class="btn btn-primary" type="submit">Login</button>
                </div>
                <div class="col-md-4"></div>
            </div>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>
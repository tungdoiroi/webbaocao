<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!--Favicon-->
    <link rel="icon" type="image/png" href="image/faviconLogo.png" />
    <title>Shop H&T&G</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <style>
        body {
            color: #566787;
            background: #f5f5f5;
            font-family: 'Varela Round', sans-serif;
            /*font-size: 13px;*/
            font-size: 12px;
        }
        .table-responsive {
            margin: 30px 0;
        }
        .table-wrapper {
            min-width: 1000px;
            background: #fff;
            padding: 20px 25px;
            border-radius: 3px;
            box-shadow: 0 1px 1px rgba(0,0,0,.05);
        }
        .table-title {
            padding-bottom: 15px;
            background: #299be4;
            color: #fff;
            padding: 16px 30px;
            margin: -20px -25px 10px;
            border-radius: 3px 3px 0 0;
        }
        .table-title h2 {
            margin: 5px 0 0;
            font-size: 24px;
        }
        .table-title .btn {
            color: #566787;
            float: right;
            font-size: 13px;
            background: #fff;
            border: none;
            min-width: 50px;
            border-radius: 2px;
            border: none;
            outline: none !important;
            margin-left: 10px;
        }
        .table-title .btn:hover, .table-title .btn:focus {
            color: #566787;
            background: #f2f2f2;
        }
        .table-title .btn i {
            float: left;
            font-size: 21px;
            margin-right: 5px;
        }
        .table-title .btn span {
            float: left;
            margin-top: 2px;
        }
        table.table tr th, table.table tr td {
            border-color: #e9e9e9;
            padding: 12px 15px;
            vertical-align: middle;
        }
        table.table tr th:first-child {
            width: 60px;
        }
        table.table tr th:last-child {
            width: 100px;
        }
        table.table-striped tbody tr:nth-of-type(odd) {
            background-color: #fcfcfc;
        }
        table.table-striped.table-hover tbody tr:hover {
            background: #f5f5f5;
        }
        table.table th i {
            font-size: 13px;
            margin: 0 5px;
            cursor: pointer;
        }
        table.table td:last-child i {
            opacity: 0.9;
            font-size: 22px;
            margin: 0 5px;
        }
        table.table td a {
            font-weight: bold;
            color: #566787;
            display: inline-block;
            text-decoration: none;
        }
        table.table td a:hover {
            color: #2196F3;
        }
        table.table td a.settings {
            color: #2196F3;
        }
        table.table td a.delete {
            color: #F44336;
        }
        table.table td i {
            font-size: 19px;
        }
        table.table .avatar {
            border-radius: 50%;
            vertical-align: middle;
            margin-right: 10px;
        }
        .status {
            font-size: 30px;
            margin: 2px 2px 0 0;
            display: inline-block;
            vertical-align: middle;
            line-height: 10px;
        }
        .text-success {
            color: #10c469;
        }
        .text-info {
            color: #62c9e8;
        }
        .text-warning {
            color: #FFC107;
        }
        .text-danger {
            color: #ff5b5b;
        }
        .pagination {
            float: right;
            margin: 0 0 5px;
        }
        .pagination li a {
            border: none;
            font-size: 13px;
            min-width: 30px;
            min-height: 30px;
            color: #999;
            margin: 0 2px;
            line-height: 30px;
            border-radius: 2px !important;
            text-align: center;
            padding: 0 6px;
        }
        .pagination li a:hover {
            color: #666;
        }
        .pagination li.active a, .pagination li.active a.page-link {
            background: #03A9F4;
        }
        .pagination li.active a:hover {
            background: #0397d6;
        }
        .pagination li.disabled i {
            color: #ccc;
        }
        .pagination li i {
            font-size: 16px;
            padding-top: 6px
        }
        .hint-text {
            float: left;
            margin-top: 10px;
            font-size: 13px;
        }
    </style>
    <script>
        $(document).ready(function () {
            $('[data-toggle="tooltip"]').tooltip();
        });
    </script>
</head>
<body>
<style>
    table {
        table-layout: fixed;
        width: 200px;
    }

    th,
    td {
        width: 200px;
        overflow: hidden;
    }
</style>
<nav class="navbar navbar-expand-lg navbar-light bg-light flex-column" style="position: fixed; left: 20px;">
    <a class="navbar-brand" href="dashBoard"><img src="img/logo.PNG" width="200px" height="40px">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <ul class="nav flex-column">
            <li class="nav-item">
                <a class="nav-link" href="home">Home</a>
            </li>
            <ul class="nav flex-column">
                <li class="list-group-item active">
                    <a class="text-light" href="MenuManager.jsp">Manager</a>
                </li>
                <li class="list-group-item">
                    <a href="managerProduct">Manager Product</a>
                </li>
                <li class="list-group-item">
                    <a href="accountManager">Manager Account</a>
                </li>
                <li class="list-group-item">
                    <a href="managerCustomer">Manager Customer</a>
                </li>
                <li class="list-group-item">
                    <a href="bill">Manager Bill</a>
                </li>

                <li class="nav-item">&nbsp;
                </li>
            </ul>
        </ul>
    </a>
</nav>


<div class="album py-5 bg-light">
    <div class="container">
        <div class="row">

            <%--                <jsp:include page="MenuManager.jsp"/>--%>
            <div class="col-sm-8 row row-cols-1 row-cols-sm-2 row-cols-md-3">
                <table class="table table-striped">
                    <thead>
                    <tr>

                        <th scope="col">ID</th>
                        <th scope="col">Tên</th>
                        <th scope="col">Giới tính</th>
                        <th scope="col">Địa chỉ</th>
                        <th scope="col">Điện Thoại</th>
                        <th scope="col">email</th>
                        <th scope="col">cmnd</th>


                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="o" items="${listA}">
                        <tr>
                            <td>
                                    ${o.id}
                            </td>

                            <td>
                                    ${o.name}
                            </td>
                            <td>
                                    ${o.gioitinh}
                            </td>
                            <td>${o.diachi}</td>
                            <td>${o.dienthoai}</td>
                            <td>${o.email}</td>
                            <td>${o.cmnd}</td>



                        </tr>
                    </c:forEach>
                    </tbody>
                </table>


            </div>
        </div>

    </div>
</div>
</body>
</html>
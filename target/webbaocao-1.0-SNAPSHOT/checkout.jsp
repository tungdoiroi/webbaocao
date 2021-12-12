<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="vi" class="h-100">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Clothes</title>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../vendor/bootstrap/css/bootstrap.min.css" type="text/css">
    <!-- Font awesome -->
    <link rel="stylesheet" href="../vendor/font-awesome/css/font-awesome.min.css" type="text/css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- Custom css - Các file css do chúng ta tự viết -->
    <link rel="stylesheet" href="../assets/css/app.css" type="text/css">
    <link rel="stylesheet" href="../css/app.css" type="text/css">
    <link  rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link  rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link href="/your-path-to-fontawesome/css/fontawesome.css" rel="stylesheet">
    <link href="/your-path-to-fontawesome/css/brands.css" rel="stylesheet">
    <link href="/your-path-to-fontawesome/css/solid.css" rel="stylesheet">



    <%--    giang--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <link type="text/css" rel="stylesheet" href="https://www.gstatic.com/firebasejs/ui/4.8.1/firebase-ui-auth.css" />

    <%--    giang--%>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" rel="stylesheet">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        body {
            background-image: url("https://www.mechatronicsart.com/wp-content/uploads/2016/06/Vilarpac_website_background.jpg");
            background-attachment: fixed;
        }
        .modal-confirm {
            color: #636363;
            width: 325px;
            margin: 30px auto;
        }
        .modal-confirm .modal-content {
            padding: 20px;
            border-radius: 5px;
            border: none;
        }
        .modal-confirm .modal-header {
            border-bottom: none;
            position: relative;
        }
        .modal-confirm h4 {
            text-align: center;
            font-size: 40px;
            margin: 30px 0 -15px;
        }
        .modal-confirm .form-control, .modal-confirm .btn {
            min-height: 40px;
            border-radius: 3px;
        }
        .modal-confirm .close {
            position: absolute;
            top: -5px;
            right: -5px;
        }
        .modal-confirm .modal-footer {
            border: none;
            text-align: center;
            border-radius: 5px;
            font-size: 13px;
        }
        .modal-confirm .icon-box {
            color: #fff;
            position: absolute;
            margin: 0 auto;
            left: 0;
            right: 0;
            top: -70px;
            width: 95px;
            height: 95px;
            border-radius: 50%;
            z-index: 9;
            background: #82ce34;
            padding: 15px;
            text-align: center;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);
        }
        .modal-confirm .icon-box i {
            font-size: 58px;
            position: relative;
            top: 3px;
        }
        .modal-confirm.modal-dialog {
            margin-top: 80px;
        }
        .modal-confirm .btn {
            color: #fff;
            border-radius: 4px;
            background: #82ce34;
            text-decoration: none;
            transition: all 0.4s;
            line-height: normal;
            border: none;
        }
        .modal-confirm .btn:hover, .modal-confirm .btn:focus {
            background: #6fb32b;
            outline: none;
        }
        .trigger-btn {
            display: inline-block;
            margin: 100px auto;
        }
    </style>


</head>

<body>
<header>
    <jsp:include page="menu.jsp"></jsp:include>

</header>

<main>
    <!-- Block content - Đục lỗ trên giao diện bố cục chung, đặt tên là `content` -->
    <div class="container mt-4" style="background-color: #dae5e2;width: 800px;font-size: 10px;">
        <form class="needs-validation" name="frmthanhtoan" method="post"
              action="checkout">
            <input type="hidden" name="kh_tendangnhap" value="dnpcuong">

            <div class="py-5 text-center">
                <i class="fa fa-credit-card fa-4x" aria-hidden="true"></i>
                <h2 style="font-size: 30px;font-weight: bold;">Thanh toán</h2>
                <p class="lead" style="font-size: 15px;">Vui lòng kiểm tra thông tin Khách hàng, thông tin Giỏ hàng trước khi Đặt hàng.</p>
            </div>
            <div class="">
                <h4 class="mb-3" style="font-size: 25px;font-weight: bold;">Thông tin khách hàng</h4>

                <div class="row">
                    <div class="col-md-12">
                        <label for="kh_ten" style="font-size: 20px;font-weight: normal;">Họ tên</label>
                        <input name="name" type="text"  id="kh_ten" class="form-control" placeholder="VD: Nguyễn Thành Công"
                               required="" autofocus="" style="font-size: 15px">
                        <%--                            <input name="user" type="text" id="user-name" class="form-control" placeholder="User name" required="" autofocus="">--%>
                    </div>
                    <div class="col-md-12">
                        <label for="kh_gioitinh" style="font-size: 20px;font-weight: normal;">Giới tính</label>
                        <input  name="gioitinh" type="text" id="kh_gioitinh" class="form-control" placeholder="VD:Nam"
                                required="" autofocus="" style="font-size: 15px" >

                    </div>
                    <div class="col-md-12">
                        <label for="kh_diachi"  style="font-size: 20px;font-weight: normal;">Địa chỉ</label>
                        <input name="diachi" type="text" id="kh_diachi" class="form-control" placeholder="VD:130 Xô Viết Nghệ Tỉnh"
                               required="" autofocus="" style="font-size: 15px">
                    </div>
                    <div class="col-md-12">
                        <label for="kh_dienthoai"  style="font-size: 20px;font-weight: normal;">Điện thoại</label>
                        <input name="dienthoai" type="text" id="kh_dienthoai" class="form-control" placeholder="VD:0915659223"
                               required="" autofocus="" style="font-size: 15px">
                    </div>
                    <div class="col-md-12">
                        <label for="kh_email"  style="font-size: 20px;font-weight: normal;">Email</label>
                        <input name="email" type="text" id="kh_email" class="form-control" placeholder="VD:phucuong@ctu.edu.vn"
                               required="" autofocus="" style="font-size: 15px">
                    </div>
                    <%--                        <div class="col-md-12">--%>
                    <%--                            <label for="kh_ngaysinh">Ngày sinh</label>--%>
                    <%--                            <input name="kh_ngaysinh" type="text" id="kh_ngaysinh" class="form-control" placeholder="VD:09-05-1999"--%>
                    <%--                                   required="" autofocus="">--%>
                    <%--                        </div>--%>
                    <div class="col-md-12">
                        <label for="kh_cmnd"  style="font-size: 20px;font-weight: normal;">CMND</label>
                        <input name="cmnd" type="text" id="kh_cmnd" class="form-control" placeholder="VD:362209685"
                               required="" autofocus="" style="font-size: 15px">
                    </div>
                </div>

                <h4 class="mb-3" style="font-size: 20px;font-weight: bold;">Hình thức thanh toán</h4>

                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">
                    <label class="form-check-label" for="flexRadioDefault1"  style="font-size: 15px;font-weight: normal;">
                        Tiền mặt
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                    <label class="form-check-label" for="flexRadioDefault2" style="font-size: 15px;font-weight: normal;">
                        Chuyển khoản
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>
                    <label class="form-check-label" for="flexRadioDefault2"  style="font-size: 15px;font-weight: normal;"">
                    Ship COD
                    </label>
                </div>
                <hr class="mb-4">
                <%--                <button class="btn btn-primary btn-lg btn-block" type="submit" name="btnDatHang" style="margin-bottom: 10px;">Đặt hàng</button>--%>
                <!-- Modal HTML -->
                <div id="myModal" class="modal fade">
                    <div class=a"modal-dialog modal-confirm">
                        <div class="modal-content">
                            <div class="modal-header">
                                <div class="icon-box">
                                    <i class="material-icons">&#xE876;</i>
                                </div>
                                <h4 class="modal-title">Bạn đã đặt hàng thành công!</h4>
                            </div>
                            <div class="modal-body">
                                <p class="text-center" style="font-size: 15px;">Đơn hàng của bạn đã được xác nhận và sẽ được giao đến bạn trong thời gian sớm nhất</p>
                            </div>
                            <div class="modal-footer">
                                <button class="btn btn-success btn-block" type="submit" name="btnDatHang" style="font-size: 15px;" >Xem chi tiết đơn hàng >>></button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <div style="margin-bottom: 5px;">
            <!-- Button HTML (to Trigger Modal) -->
            <button data-target="#myModal" class="btn btn-primary btn-lg btn-block" data-toggle="modal">Đặt hàng </button>
        </div>
    </div>
    <!-- End block content -->
</main>
<footer class="page-footer text-center font-small mt-4 wow fadeIn" style="background-color: #096363">
    <jsp:include page="footer.jsp"></jsp:include>
</footer>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="../vendor/jquery/jquery.min.js"></script>
<script src="../vendor/popperjs/popper.min.js"></script>
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>
<!-- Custom script - Các file js do mình tự viết -->
<script src="../assets/js/app.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/jquery.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/popper.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/mdb.min.js"></script>
<script>
    function showModel() {
        const elem = document.getElementById("myModel")
        elem.style.display = "block"
        setTimeout(() => elem.style.display = "none", 8000)
    }
</script>
</body>
</html>

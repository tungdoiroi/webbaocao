
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="entity.Product" %>
<%@ page import="entity.Category" %>

<%@ page import="java.util.List" %>
<%@ page import="dao.DAO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="dao.DAO" %>
<!------ Include the above in your HEAD tag ---------->
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css">
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




    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">




    <style>
        .pd-wrap {
            padding: 40px 0;
            font-family: 'Poppins', sans-serif;
        }
        .heading-section {
            text-align: center;
            margin-bottom: 20px;
        }
        .sub-heading {
            font-family: 'Poppins', sans-serif;
            font-size: 12px;
            display: block;
            font-weight: 600;
            color: #2e9ca1;
            text-transform: uppercase;
            letter-spacing: 2px;
        }
        .heading-section h2 {
            font-size: 32px;
            font-weight: 500;
            padding-top: 10px;
            padding-bottom: 15px;
            font-family: 'Poppins', sans-serif;
        }
        .user-img {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            position: relative;
            min-width: 80px;
            background-size: 100%;
        }
        .carousel-testimonial .item {
            padding: 30px 10px;
        }
        .quote {
            position: absolute;
            top: -23px;
            color: #2e9da1;
            font-size: 27px;
        }
        .name {
            margin-bottom: 0;
            line-height: 14px;
            font-size: 17px;
            font-weight: 500;
        }
        .position {
            color: #adadad;
            font-size: 14px;
        }
        .owl-nav button {
            position: absolute;
            top: 50%;
            transform: translate(0, -50%);
            outline: none;
            height: 25px;
        }
        .owl-nav button svg {
            width: 25px;
            height: 25px;
        }
        .owl-nav button.owl-prev {
            left: 25px;
        }
        .owl-nav button.owl-next {
            right: 25px;
        }
        .owl-nav button span {
            font-size: 45px;
        }
        .product-thumb .item img {
            height: 100px;
        }
        .product-name {
            font-size: 22px;
            font-weight: 500;
            line-height: 22px;
            margin-bottom: 4px;
        }
        .product-price-discount {
            font-size: 22px;
            font-weight: 400;
            padding: 10px 0;
            clear: both;
        }
        .product-price-discount span.line-through {
            text-decoration: line-through;
            margin-left: 10px;
            font-size: 14px;
            vertical-align: middle;
            color: #a5a5a5;
        }
        .display-flex {
            display: flex;
        }
        .align-center {
            align-items: center;
        }
        .product-info {
            width: 100%;
        }
        .reviews-counter {
            font-size: 13px;
        }
        .reviews-counter span {
            vertical-align: -2px;
        }
        .rate {
            float: left;
            padding: 0 10px 0 0;
        }
        .rate:not(:checked) > input {
            position:absolute;
            top:-9999px;
        }
        .rate:not(:checked) > label {
            float: right;
            width: 15px;
            overflow: hidden;
            white-space: nowrap;
            cursor: pointer;
            font-size: 21px;
            color:#ccc;
            margin-bottom: 0;
            line-height: 21px;
        }
        .rate:not(:checked) > label:before {
            content: '\2605';
        }
        .rate > input:checked ~ label {
            color: #ffc700;
        }
        .rate:not(:checked) > label:hover,
        .rate:not(:checked) > label:hover ~ label {
            color: #deb217;
        }
        .rate > input:checked + label:hover,
        .rate > input:checked + label:hover ~ label,
        .rate > input:checked ~ label:hover,
        .rate > input:checked ~ label:hover ~ label,
        .rate > label:hover ~ input:checked ~ label {
            color: #c59b08;
        }
        .product-dtl p {
            font-size: 14px;
            line-height: 24px;
            color: #7a7a7a;
        }
        .product-dtl .form-control {
            font-size: 15px;
        }
        .product-dtl label {
            line-height: 16px;
            font-size: 15px;
        }
        .form-control:focus {
            outline: none;
            box-shadow: none;
        }
        .product-count {
            margin-top: 15px;
        }
        .product-count .qtyminus,
        .product-count .qtyplus {
            width: 34px;
            height: 34px;
            background: #1364f3;
            text-align: center;
            font-size: 19px;
            line-height: 36px;
            color: #fff;
            cursor: pointer;
        }
        .product-count .qtyminus {
            border-radius: 3px 0 0 3px;
        }
        .product-count .qtyplus {
            border-radius: 0 3px 3px 0;
        }
        .product-count .qty {
            width: 60px;
            text-align: center;
        }
        .round-black-btn {
            border-radius: 4px;
            background: #1364f3;
            color: #fff;
            padding: 7px 45px;
            display: inline-block;
            margin-top: 20px;
            border: solid 2px #0b4c86;
            transition: all 0.5s ease-in-out 0s;
        }
        .round-black-btn:hover,
        .round-black-btn:focus {
            background: transparent;
            color: #164e86;
            text-decoration: none;
        }

        .product-info-tabs {
            margin-top: 25px;
        }
        .product-info-tabs .nav-tabs {
            border-bottom: 2px solid #1364f3;
        }
        .product-info-tabs .nav-tabs .nav-item {
            margin-bottom: 0;
        }
        .product-info-tabs .nav-tabs .nav-link {
            border: none;
            border-bottom: 2px solid transparent;
            color: #323232;
        }
        .product-info-tabs .nav-tabs .nav-item .nav-link:hover {
            border: none;
        }
        .product-info-tabs .nav-tabs .nav-item.show .nav-link,
        .product-info-tabs .nav-tabs .nav-link.active,
        .product-info-tabs .nav-tabs .nav-link.active:hover {
            border: none;
            border-bottom: 2px solid #1364f3;
            font-weight: bold;
        }
        .product-info-tabs .tab-content .tab-pane {
            padding: 30px 20px;
            font-size: 15px;
            line-height: 24px;
            color: #7a7a7a;
        }
        .review-form .form-group {
            clear: both;
        }
        .mb-20 {
            margin-bottom: 20px;
        }

        .review-form .rate {
            float: none;
            display: inline-block;
        }
        .review-heading {
            font-size: 24px;
            font-weight: 600;
            line-height: 24px;
            margin-bottom: 6px;
            text-transform: uppercase;
            color: #1364f3;
        }
        .review-form .form-control {
            font-size: 14px;
        }
        .review-form input.form-control {
            height: 40px;
        }
        .review-form textarea.form-control {
            resize: none;
        }
        .review-form .round-black-btn {
            text-transform: uppercase;
            cursor: pointer;
        }
        [class*='mdl-shadow']{
            box-shadow: none;
        }
        /*giang*/
        .mau{
            height:800px;
            width: 200px;
        }
        body{
            background-image: url("https://www.mechatronicsart.com/wp-content/uploads/2016/06/Vilarpac_website_background.jpg");
            background-attachment: fixed;
        }




        body {
            background-color: #D32F2F;
            font-family: 'Calibri', sans-serif !important
        }

        .mt-100 {
            margin-top: 100px
        }

        .mb-100 {
            margin-bottom: 100px
        }

        .card {
            position: relative;
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-orient: vertical;
            -webkit-box-direction: normal;
            -ms-flex-direction: column;
            flex-direction: column;
            min-width: 0;
            word-wrap: break-word;
            background-color: #fff;
            background-clip: border-box;
            border: 0px solid transparent;
            border-radius: 0px
        }

        .card-body {
            -webkit-box-flex: 1;
            -ms-flex: 1 1 auto;
            flex: 1 1 auto;
            padding: 1.25rem
        }

        .card .card-title {
            position: relative;
            font-weight: 600;
            margin-bottom: 10px
        }

        .comment-widgets {
            position: relative;
            margin-bottom: 10px
        }

        .comment-widgets .comment-row {
            border-bottom: 1px solid transparent;
            padding: 14px;
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            margin: 10px 0
        }

        .p-2 {
            padding: 0.5rem !important
        }

        .comment-text {
            padding-left: 15px
        }

        .w-100 {
            width: 100% !important
        }

        .m-b-15 {
            margin-bottom: 15px
        }

        .btn-sm {
            padding: 0.25rem 0.5rem;
            font-size: 0.76563rem;
            line-height: 1.5;
            border-radius: 1px
        }

        .btn-cyan {
            color: #fff;
            background-color: #27a9e3;
            border-color: #27a9e3
        }

        .btn-cyan:hover {
            color: #fff;
            background-color: #1a93ca;
            border-color: #198bbe
        }

        .comment-widgets .comment-row:hover {
            background: rgba(0, 0, 0, 0.05)
        }
        .product-grid{
            font-family: 'Poppins', sans-serif;
            text-align: center;
        }
        .product-grid .product-image{
            overflow: hidden;
            position: relative;
            z-index: 1;
        }
        .product-grid .product-image a.image{display: block; }
        .product-grid .product-image img{
            width: 100%;
            height: auto;
        }
        .product-grid .product-discount-label{
            color: #fff;
            background: #A5BA8D;
            font-size: 13px;
            font-weight: 600;
            line-height: 25px;
            padding: 0 20px;
            position: absolute;
            top: 10px;
            left: 0;
        }
        .product-grid .product-links{
            padding: 0;
            margin: 0;
            list-style: none;
            position: absolute;
            top: 10px;
            right: -50px;
            transition: all .5s ease 0s;
        }
        .product-grid:hover .product-links{ right: 10px; }
        .product-grid .product-links li a{
            color: #333;
            background: transparent;
            font-size: 17px;
            line-height: 38px;
            width: 38px;
            height: 38px;
            border: 1px solid #333;
            border-bottom: none;
            display: block;
            transition: all 0.3s;
        }
        .product-grid .product-links li:last-child a{ border-bottom: 1px solid #333; }
        .product-grid .product-links li a:hover{
            color: #fff;
            background: #333;
        }
        .product-grid .add-to-cart{
            background: #A5BA8D;
            color: #fff;
            font-size: 16px;
            text-transform: uppercase;
            letter-spacing: 2px;
            width: 100%;
            padding: 10px 26px;
            position: absolute;
            left: 0;
            bottom: -60px;
            transition: all 0.3s ease 0s;
        }
        .product-grid:hover .add-to-cart{ bottom: 0; }
        .product-grid .add-to-cart:hover{ text-shadow: 4px 4px rgba(0,0,0,0.2); }
        .product-grid .product-content{
            background: #fff;
            padding: 15px;
            box-shadow: 0 0 0 5px rgba(0,0,0,0.1) inset;
        }
        .product-grid .title{
            font-size: 16px;
            font-weight: 600;
            text-transform: capitalize;
            margin: 0 0 7px;
        }
        .product-grid .title a{
            color: #777;
            transition: all 0.3s ease 0s;
        }
        .product-grid .title a:hover{ color: #a5ba8d; }
        .product-grid .price{
            color: #0d0d0d;
            font-size: 14px;
            font-weight: 600;
        }
        .product-grid .price span{
            color: #888;
            font-size: 13px;
            font-weight: 400;
            text-decoration: line-through;
        }
        @media screen and (max-width: 990px){
            .product-grid{ margin-bottom: 30px; }
        }
    </style>
</head>
<body>
<header>
    <jsp:include page="menu.jsp"></jsp:include>
    <jsp:include page="navsub.jsp"></jsp:include>
</header>
<main>
    <div class="container mt-5" style="border-color:red">

        <div class="row">
            <div class="col-md-6" style="width:40%">
                <div id="slider" class="owl-carousel product-slider">
                    <div class="item">
                        <img class="mau" src="${detail.image} " style="height:700px;width:550px;" />
                    </div>


                </div>

            </div>
            <div class="col-md-6">
                <div class="product-dtl">
                    <div class="product-info">
                        <div class="product-name">${detail.name}</div>
                        <div class="reviews-counter">
                            <div class="rate">
                                <input type="radio" id="star5" name="rate" value="5" checked />
                                <label for="star5" title="text">5 stars</label>
                                <input type="radio" id="star4" name="rate" value="4" checked />
                                <label for="star4" title="text">4 stars</label>
                                <input type="radio" id="star3" name="rate" value="3" checked />
                                <label for="star3" title="text">3 stars</label>
                                <input type="radio" id="star2" name="rate" value="2" />
                                <label for="star2" title="text">2 stars</label>
                                <input type="radio" id="star1" name="rate" value="1" />
                                <label for="star1" title="text">1 star</label>
                            </div>
                            <span>3 Reviews</span>
                        </div>
                        <div class="product-price-discount"><span>$${detail.price}</span><span class="line-through">$29.00</span></div>
                    </div>
                    <p>${detail.description}</p>
                    <div class="row">
                        <div class="col-md-6">
                            <label for="size">Size</label>
                            <select id="size" name="size" class="form-control">
                                <option>S</option>
                                <option>M</option>
                                <option>L</option>
                                <option>XL</option>
                            </select>
                        </div>
                        <div class="col-md-6">
                            <label for="color">Color</label>
                            <select id="color" name="color" class="form-control">
                                <option>Blue</option>
                                <option>Green</option>
                                <option>Red</option>
                            </select>
                        </div>
                    </div>
                    <!-- Button trigger modal -->
                    <div>
                        <a class="btn btn-primary" style="color:blue;background-color:#cfcccc;font-size:15px;border-color:white;margin-top: 6px;" data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Hướng dẫn chọn size
                        </a>

                    </div>

                    <!-- Modal -->
                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog modal-lg modal-dialog-centered modal-dialog-scrollable">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Hướng dẫn chọn kích cỡ</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    <p style="color:blue;">*Bảng kích thước này chỉ dành cho mục đích tham khảo</p>
                                    <img src="${detail.size}" style="height:590px;width:750px;"alt="...">

                                </div>

                            </div>
                        </div>
                    </div>
                    <div class="product-count">
<%--                        <label for="size">Quantity</label>--%>
<%--                        <form action="#" class="display-flex">--%>
<%--                            <div class="qtyminus">-</div>--%>
<%--                            <input type="text" name="quantity" value="1" class="qty">--%>
<%--                            <div class="qtyplus">+</div>--%>
<%--                        </form>--%>
                        <%--                        <a href="print" class="round-black-btn">Add to Cart</a>--%>
                        <a href="addtocart?pid=${detail.id}" class="round-black-btn">Add to Cart </a>
                    </div>

                </div>
            </div>
            <span>Similar items:</span>
            <div class="row">
                <c:forEach items="${listPP}" var="i">
                <div class="col-md-3 col-sm-6" style="">
                    <div class="product-grid">
                        <div class="product-image">
                    <a href="detail?pid=${i.id}&cateID=${i.cateID}">
                    <img src="${i.image}" class="card-img-top"  alt="...">
                    </a>
                            <span class="product-discount-label">-23%</span>
                            <ul class="product-links">
                                <li><a href="#"><i class="fa fa-search"></i></a></li>
                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                <li><a href="#"><i class="fa fa-random"></i></a></li>
                            </ul>
                            <a href="addtocart?pid=${i.id}" class="add-to-cart">Add to Cart</a>
                        </div>
                        <div class="product-content">
                            <h3 class="title"><a href="#">${i.name}</a></h3>
                            <div class="price">$${i.price} <span>$68.88</span></div>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>

        </div>
        <div class="product-info-tabs">
            <ul class="nav nav-tabs" id="myTab" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" id="description-tab" data-toggle="tab" href="#description" role="tab" aria-controls="description" aria-selected="true">Description</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="review-tab" data-toggle="tab" href="#review" role="tab" aria-controls="review" aria-selected="false">Reviews (0)</a>
                </li>
            </ul>
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade show active" id="description" role="tabpanel" aria-labelledby="description-tab">
                    ${detail.description}
                </div>

                <%--                review--%>
                <div class="tab-pane fade" id="review" role="tabpanel" aria-labelledby="review-tab">
                    <div class="review-heading">REVIEWS</div>


                    <div class="row d-flex justify-content-center">
                        <div class="">
                            <div class="card shadow-0 border" style="background-color: #f0f2f5;">
                                <div class="card-body p-4">


                                    <c:forEach items="${listCmt}" var="o">
                                        <div class="card mb-4">
                                            <div class="card-body">
                                                <p>${o.cmt}</p>

                                                <div class="d-flex justify-content-between">
                                                    <div class="d-flex flex-row align-items-center">
                                                        <img
                                                                src="https://www.nicepng.com/png/detail/128-1280406_view-user-icon-png-user-circle-icon-png.png"
                                                                alt="avatar"
                                                                width="30"
                                                                height="30"
                                                        />
                                                        <p class="small mb-0 ms-2" style=""><b> ${o.ten}</b></p>
                                                    </div>
                                                    <div class="d-flex flex-row align-items-center">
                                                        <p class="small text-muted mb-0">Upvote?</p>
                                                        <i
                                                                class="far fa-thumbs-up mx-2 fa-xs text-black"
                                                                style="margin-top: -0.16rem;"
                                                        ></i>
                                                        <p class="small text-muted mb-0">3</p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>


                                </div>
                            </div>
                        </div>
                    </div>



<c:if test = "${sessionScope.acc != null}">
                    <p class="mb-20">Add your reviews.</p>
                    <form class="review-form" action="comment" method="post">
                        <div class="form-group">
                            <label>Your message</label>
                            <label class="ui-helper-hidden-accessible"></label>
                            <textarea name="cmt" class="form-control" rows="10"></textarea>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
<%--                                    <input type="text" name="ten" class="form-control" placeholder="Name*">--%>
                     ${sessionScope.acc.user}
                                </div>
                            </div>
<%--                            <div class="col-md-6">--%>
<%--                                <div class="form-group">--%>
<%--                                    <input type="text" name="gmail" class="form-control" placeholder="Email Id*">--%>
<%--                                </div>--%>
<%--                            </div>--%>
                        </div>
<%--                        </c:forEach>--%>
                        </c:if>
                        <button type="submit" class="round-black-btn">Submit Review</button>

                    </form>
                </div>
                <%--                review--%>
            </div>
        </div>
    </div>
    </div>
</main>
<footer>
    <jsp:include page="footer.jsp"></jsp:include>

</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

<%--footer--%>
<script type="text/javascript" src="node_modules/mdbootstrap/js/jquery.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/popper.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="node_modules/mdbootstrap/js/mdb.min.js"></script>
<script src="https://kit.fontawesome.com/cb0487757c.js" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="	sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script>
    $(document).ready(function() {
        var slider = $("#slider");
        var thumb = $("#thumb");
        var slidesPerPage = 4; //globaly define number of elements per page
        var syncedSecondary = true;
        slider.owlCarousel({
            items: 1,
            slideSpeed: 2000,
            nav: false,
            autoplay: false,
            dots: false,
            loop: true,
            responsiveRefreshRate: 200
        }).on('changed.owl.carousel', syncPosition);
        thumb
            .on('initialized.owl.carousel', function() {
                thumb.find(".owl-item").eq(0).addClass("current");
            })
            .owlCarousel({
                items: slidesPerPage,
                dots: false,
                nav: true,
                item: 4,
                smartSpeed: 200,
                slideSpeed: 500,
                slideBy: slidesPerPage,
                navText: ['<svg width="18px" height="18px" viewBox="0 0 11 20"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M9.554,1.001l-8.607,8.607l8.607,8.606"/></svg>', '<svg width="25px" height="25px" viewBox="0 0 11 20" version="1.1"><path style="fill:none;stroke-width: 1px;stroke: #000;" d="M1.054,18.214l8.606,-8.606l-8.606,-8.607"/></svg>'],
                responsiveRefreshRate: 100
            }).on('changed.owl.carousel', syncPosition2);
        function syncPosition(el) {
            var count = el.item.count - 1;
            var current = Math.round(el.item.index - (el.item.count / 2) - .5);
            if (current < 0) {
                current = count;
            }
            if (current > count) {
                current = 0;
            }
            thumb
                .find(".owl-item")
                .removeClass("current")
                .eq(current)
                .addClass("current");
            var onscreen = thumb.find('.owl-item.active').length - 1;
            var start = thumb.find('.owl-item.active').first().index();
            var end = thumb.find('.owl-item.active').last().index();
            if (current > end) {
                thumb.data('owl.carousel').to(current, 100, true);
            }
            if (current < start) {
                thumb.data('owl.carousel').to(current - onscreen, 100, true);
            }
        }
        function syncPosition2(el) {
            if (syncedSecondary) {
                var number = el.item.index;
                slider.data('owl.carousel').to(number, 100, true);
            }
        }
        thumb.on("click", ".owl-item", function(e) {
            e.preventDefault();
            var number = $(this).index();
            slider.data('owl.carousel').to(number, 300, true);
        });


        $(".qtyminus").on("click",function(){
            var now = $(".qty").val();
            if ($.isNumeric(now)){
                if (parseInt(now) -1> 0)
                { now--;}
                $(".qty").val(now);
            }
        })
        $(".qtyplus").on("click",function(){
            var now = $(".qty").val();
            if ($.isNumeric(now)){
                $(".qty").val(parseInt(now)+1);
            }
        });
    });
</script>
<script src="https://www.gstatic.com/firebasejs/8.8.1/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/8.8.1/firebase-auth.js"></script>
<script src="https://www.gstatic.com/firebasejs/ui/4.8.1/firebase-ui-auth.js"></script>
<script type="module">

    const firebaseConfig = {
        apiKey: "AIzaSyCCDuXhP2pXyKcS5s5JJE6fApDlKHoUZEI",
        authDomain: "clothes-12f8a.firebaseapp.com",
        projectId: "clothes-12f8a",
        storageBucket: "clothes-12f8a.appspot.com",
        messagingSenderId: "1068860917688",
        appId: "1:1068860917688:web:3890226b6a54ea4b94f14d",
        measurementId: "G-Y5LB0WWXV0"
    };

    // $(function () {
    //     firebase.initializeApp(firebaseConfig);
    //     alert(firebase.SDK_VERSION)
    // });

    // Initialize Firebase



    var uiConfig = {
        signInFlow: 'popup',
        signInOptions: [
            firebase.auth.EmailAuthProvider.PROVIDER_ID,
            {
                provider: firebase.auth.PhoneAuthProvider.PROVIDER_ID,
                recaptchaParameters: {
                    type: 'image',
                    size: 'normal',
                    badge: 'bottomleft'
                },
                defaultCountry: 'VN'
            },
            firebase.auth.FacebookAuthProvider.PROVIDER_ID
        ],

        callbacks: {
            signInSuccessWithAuthResult: function (authResult) {
                if (authResult.user) {
                    handleSignedInUser(authResult.user);
                }
                return false;
            },
            signInFailure: function (error) {

            }
        },
        autoUpgradeAnonymousUsers: true

    };

    //--------------


    var ui

    $(function () {
        firebase.initializeApp(firebaseConfig);
        ui = new firebaseui.auth.AuthUI(firebase.auth());
        ui.start('#firebaseui-auth-container', uiConfig);
        firebase.auth().onAuthStateChanged(function (user) {
            user ? handleSignedInUser(user) : handleSignedOutUser();
            $("#login-spinner").addClass("d-none")
        });
    });

    function handleSignedInUser(user) {
        $(".user").removeClass("d-none")
        $(".guest").addClass("d-none")

        $("#name").text(user.displayName);
        $("#email").text(user.email);
        $("#phone").text(user.phoneNumber);
        if (user.photoURL) {
            $(".avatar").attr("src",user.photoURL);
        } else {
            $(".avatar").attr("src","/assets/avatar.jpg");
        }
        $('#modal-login').modal('hide');
    }

    function handleSignedOutUser() {
        ui.start("#firebaseui-auth-container", uiConfig);
        $(".user").addClass("d-none")
        $(".guest").removeClass("d-none")
    }

    // function handleSignedInUser(user) {
    //     document.write("<pre>" + JSON.stringify(user, undefined, 2) + "</pre>")
    // }



</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: THU HUONG
  Date: 9/15/2021
  Time: 12:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%--giang--%>
<fmt:setLocale value="${sessionScope.LANG}"/>
<fmt:setBundle basename="mlang"/>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
    <style>
        .active{
            display: inline;
            border-bottom: 3px solid #f9dd94;
        }
        .btn:hover {
            background-color: #666;
            color: white;
        }
    </style>
</head>
<nav class="navbar navbar-expand-lg navbar-dark "  style="background-color: #169090;height:70px;" >
    <div class="container" >
        <a class="navbar-brand " style="color:#f802c2 ;font-size:35px;font-family: Florence, cursive;" href="home">ShopT</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent" >
            <ul id="myDiv" class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class=" nav-item ">
                    <a class="btn active nav-link" style="color:#afafd0 ;font-size:20px;" aria-current="page" href="#"><fmt:message key="a.home" /></a>
                </li>
                <%--                <li class=" nav-item">--%>
                <%--                    <a class="btn nav-link" style="color:#afafd0 ;font-size:20px;" href="/hotproduct"><fmt:message key="a.hot" /></a>--%>
                <%--                </li>--%>
                <%--                <li class=" nav-item ">--%>
                <%--                    <a class="btn nav-link" style="color:#afafd0 ;font-size:20px;" href="/goodprice"  role="button"  aria-expanded="false">--%>
                <%--                        Sản phẩm giá tốt--%>
                <%--                    </a>--%>

                </li>
                <li class=" nav-item ">
                    <a class="btn nav-link" style="color:#afafd0 ;font-size:20px;" href="/hotproduct" role="button" aria-expanded="false">
                        Sản phẩm mới
                    </a>

                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" style="color:#afafd0 ;font-size:20px;" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Genres
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <c:forEach items="${listCC}" var="o">
                            <li class="list-group-item ${tag == o.cid ? "active":""}">
                                <a class="${tag == o.cid ? "text-light":""}" href="category?cid=${o.cid}">${o.cname}</a>
                            </li>
                        </c:forEach>
                        <%--                        <li><a class="dropdown-item" href="#">Action</a></li>--%>
                        <%--                        <li><a class="dropdown-item" href="#">Another action</a></li>--%>
                        <%--                        <li><hr class="dropdown-divider"></li>--%>
                        <%--                        <li><a class="dropdown-item" href="#">Something else here</a></li>--%>
                    </ul>
                </li>
                <%--                <c:forEach items="${listCC}" var="o">--%>
                <%--                    <li class="list-group-item ${tag == o.cid ? "active":""}">--%>
                <%--                        <a class="${tag == o.cid ? "text-light":""}" href="category?cid=${o.cid}">${o.cname}</a>--%>
                <%--                    </li>--%>
                <%--                </c:forEach>--%>
                <c:if test="${sessionScope.acc == null}">
                    <li class="nav-item">
                        <a class="nav-link" href="login">Login</a>
                    </li>
                </c:if>

                <!--Nếu acc khác null -> login rồi -> hiển thị cả 3 menu dưới-->
                <c:if test = "${sessionScope.acc != null}">
                    <li class="nav-item">
                        <!--Sửa ở đây: Sửa phần Hello MrA → Hello [user]-->
                        <a class="nav-link text-info" href="login">Hello ${sessionScope.acc.user}</a>
                    </li>
                    <c:if test="${sessionScope.acc.isSell == 1}">
                        <li class="nav-item active">
                                <%--                    <a class="nav-link" href="managerProduct">Manager</a>--%>
                            <a class="nav-link" href="MenuManager.jsp">Manager</a>
                        </li>
                    </c:if>
                    <li class="nav-item">
                        <!--Sửa: khi ấn logout: dẫn -> servlet-->
                        <a class="nav-link" href="logout">LogOut</a>
                    </li>
                </c:if>
            </ul>
            <form class="d-flex" style="margin-top: 1px; margin-bottom: 1px;" >
                <span><a class="nav-link" href="show"><img style="height:35px;" src="https://cdn-icons-png.flaticon.com/512/3144/3144456.png" ></a></span>

            </form>


            <div class="btn-group ms-3">
                <button style="height:45px;margin-top:5px;" type="button" class="btn btn-warning dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    <fmt:message key="a.language"/>
                </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="?lang=vi"><fmt:message key="a.Vietnamese"/></a></li>
                    <li><a class="dropdown-item" href="?lang=en"><fmt:message key="a.English"/></a></li>
                </ul>
            </div>
            <%--                    giang--%>
            <%--                    <button class="b.n btn-outline-success" type="submit" id="login" formaction="/login.jsp">Login</button>--%>
            <%--                <button id="login" style="height:45px;margin-top:5px;" type="button" class="guest btn btn-primary ms-3 d-none" data-bs-toggle="modal" data-bs-target="#modal-login"><span><fmt:message key="a.login"/></span></button>--%>
            <%--                <div id="login-spinner" class="spinner-border text-light ms-3" role="status"></div>--%>
            <%--                <div class="dropdown">--%>
            <%--                    <img id="avatar"  src="./assets/avatar.jpg" data-bs-toggle="dropdown" style="margin-top: 7px" width="38x" height="38x"--%>
            <%--                         class="user avatar rounded-circle ms-3 d-none dropdown-toggle">--%>
            <%--                    <ul class="dropdown-menu dropdown-menu-center text-small" aria-labelledby="dropdownUser1">--%>
            <%--                        <li><a class="dropdown-item" href="#">Settings</a></li>--%>
            <%--                        <li><a class="dropdown-item" href="#" data-bs-toggle="modal" data-bs-target="#modal-login">Profile</a></li>--%>
            <%--                        <li>--%>
            <%--                            <hr class="dropdown-divider">--%>
            <%--                        </li>--%>
            <%--                        <li><a class="dropdown-item" href="#" onclick="firebase.auth().signOut();">Sign out</a></li>--%>
            <%--                    </ul>--%>
            <%--                </div>--%>
            <%--                <div class="modal d-block1" id="modal-login" tabindex="-1" aria-hidden="true">--%>
            <%--                    <div class="modal-dialog">--%>
            <%--                        <div class="modal-content shadow">--%>
            <%--                            <div class="modal-header">--%>
            <%--                                <h5 class="modal-title"><span >Login</span></h5>--%>
            <%--                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
            <%--                            </div>--%>
            <%--                            <div class="modal-body">--%>
            <%--                                <div id="firebaseui-auth-container" class="guest"></div>--%>
            <%--                                <div id="user-signed-in" class="d-none d-flex user">--%>
            <%--                                    <div class="flex-grow-1 d-flex justify-content-center">--%>
            <%--                                        <img th:src="@{/assets/avatar.jpg}" src="./assets/avatar.jpg" width="110px" height="110px" class="avatar rounded-circle">--%>
            <%--                                    </div>--%>
            <%--                                    <div class="flex-grow-1  d-flex flex-column align-self-center me-4">--%>
            <%--                                        <div id="name" class="align-self-center text-primary fs-5">Name</div>--%>
            <%--                                        <div id="email" class="align-self-center ">Email</div>--%>
            <%--                                        <div id="phone">Phone</div>--%>
            <%--                                    </div>--%>
            <%--                                </div>--%>
            <%--                            </div>--%>
            <%--                            <div class="modal-footer d-none user">--%>
            <%--                                <button id="sign-out" type="button" class="btn btn-danger" onclick="firebase.auth().signOut();">Sign out</button>--%>
            <%--                            </div>--%>
            <%--                        </div>--%>
            <%--                    </div>--%>
            <%--                </div>--%>
            <%--                    giang--%>
            </form>
        </div>
    </div>
</nav>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<%--giang--%>
<script th:src="@{/js/main.js}" src="./js/main.js"></script>

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
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
            $(".avatar").attr("src","https://www.nicepng.com/png/detail/128-1280406_view-user-icon-png-user-circle-icon-png.png");
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

<script>
    // Add active class to the current button (highlight it)
    var header = document.getElementById("myDiv");
    var btns = header.getElementsByClassName("btn");
    for (var i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function() {
            var current = document.getElementsByClassName("active");
            current[0].className = current[0].className.replace(" active", "");
            this.className += " active";
        });
    }
</script>
<%--giang--%>
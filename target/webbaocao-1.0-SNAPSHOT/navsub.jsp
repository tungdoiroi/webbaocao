
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%--giang--%>
<fmt:setLocale value="${sessionScope.LANG}"/>
<fmt:setBundle basename="mlang"/>
<%--giang--%>

<div class="container">

    <!--Navbar-->
    <nav class="navbar navbar-expand-lg navbar-light lighten-3 mt-3 mb-5 " style="background-color: #aef6f6">


        <!-- Navbar brand -->
        <span class="navbar-brand" style="color:#0209f3 ;font-size:28px; "><fmt:message key="b.category" />:</span>

        <!-- Collapse button -->
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
                aria-controls="basicExampleNav"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Collapsible content -->
        <div class="collapse navbar-collapse" id="basicExampleNav">

            <!-- Links -->
            <ul class="navbar-nav mr-auto">

                <c:forEach items="${listCCC}" var="o">
                    <li class="nav-item ">
                        <a class="nav-link ${tag == o.cid ? "active":""} " style="color:#3333ee;font-size: 20px; " href="category?cid=${o.cid}">${o.cname}</a>
                    </li>
                </c:forEach>




            </ul>
            <!-- Links -->

            <form class="form-inline" style="margin-top: 1px; margin-bottom: 1px;weight:70px;" action="search" method="get">
                <div class="md-form my-0">
                    <input class="form-control mr-sm-2" value="${txtS}" name="txt" type="text" placeholder="Search" aria-label="Search">
<%--                    <button class="btn btn-lg btn-success" type="submit">Search</button>--%>
                </div>

            </form>

            <div class="dropdown">
                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Filter
                </button>
                <div class="dropdown-menu" aria-labelledby="dropdownMenu2">
                    <button class="dropdown-item" formaction="descending" formmethod="get" type="button"><a href="descending">Price Descending</a></button>
                    <button class="dropdown-item" formaction="ascending" formmethod="get" type="button"><a href="ascending">Price Ascending</a></button>
                </div>
            </div>
        </div>
        <!-- Collapsible content -->

    </nav>
</div>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Fellow travellers</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
    <style>
        .card-panel {margin-top: 25px;
            margin-right: 500px;
            margin-left: 500px;
        }
        .header{
            background-color: #fec700;
            height: 150px;
        }
    </style>
</head>

<body background="bckg.jpg">

<div class="header">
    <img src="Expedia-Logo-EPS-vector-image.png" alt="Italian Trulli" style="width:150px;height:100px; margin-left: 250px ;margin-right: 250px;">
    <nav style="background-color: #fec700; ">
        <div class="nav-wrapper"  style=" margin-left: 250px ;margin-right: 250px;  ">
            <ul id="nav-mobile" class="left hide-on-med-and-down">
                <li><a href="sass.html"><font color="black">Home</font></a></li>
                <li><a href="badges.html"><font color="black">Flights</font></a></li>
                <li><a href="collapsible.html"><font color="black">Hotels</font></a></li>
                <li><a href="collapsible.html"><font color="black">Discover</font></a></li>
                <li><a href="collapsible.html"><font color="black">Flight+Hotel</font></a></li>
                <li><a href="collapsible.html"><font color="black">Car Hire</font></a></li>
                <li><a href="collapsible.html"><font color="black">Holiday Activities</font></a></li>
                <li><a href="collapsible.html"><font color="black">Last Minute Deals</font></a></li>
                <li><a href="collapsible.html"><font color="black">Deals</font></a></li>
                <li><a href="collapsible.html"><font color="black">Rewards</font></a></li>
                <li><a href="collapsible.html"><font color="black">Mobile</font></a></li>
                <li><a href="collapsible.html"><font color="black">Travel Blog</font></a></li>
            </ul>
        </div>
    </nav>

</div>

<div class="card-panel" >
    <%--<c:out value="${isEmpty}"/>--%>
    <c:choose>
        <c:when test="${isEmpty}">
            <div class="collection">
                <span class="collection-item">Sorry, We didn't find a match for you. We will notify you once we get it.</span>
            </div>
        </c:when>
        <c:when test="${!isEmpty}">
            <ol>
            <c:forEach var="list2data" items="${cotravellersLinks}" >
                <li class="blue-text text-darken-2"><c:out value="${list2data}"/></li>

            </c:forEach>
            </ol>
        </c:when>
    </c:choose>

</div>

</body>
</html>
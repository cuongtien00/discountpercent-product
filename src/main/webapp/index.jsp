<%--
  Created by IntelliJ IDEA.
  User: Phong Vu
  Date: 11/8/2021
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/discountServlet" method="post">
    <input type="text" name="des" placeholder="mo ta san pham">
    <input type="text" name="price" placeholder="gia niem yet">
    <input type="text" name="discount" placeholder="discount percent">
    <input type="submit" id="submit">
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: nguyenthanhlinh
  Date: 4/27/18
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:280px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form method="post" action="/calculate-interest-bank">
  <div class="login">
    <h2>Calculate Interest On Deposit To Bank</h2>
    Amount Of Loan:
    <input type="text" name="money" size="30"  placeholder="Amount of Loan" />
    Monthly Interest Rate:
    <input type="text" name="rate" size="30"  placeholder="Monthly Interest Rate" />
    Months of Loan:
    <input type="text" name="months" size="30" placeholder="Months of Loan" />
    <input type="submit" value="Calculate"/>
  </div>
</form>
</body>
</html>

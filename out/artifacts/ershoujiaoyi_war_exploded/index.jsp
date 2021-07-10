<%--
  Created by IntelliJ IDEA.
  User: Sinny Lang
  Date: 2021/7/10
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>$Title$</title>
</head>
<body>
<a href="register"> 注册链接 </a>
<form method="get">
    name:<input type="text" id="t1"/>
    phone:<input type="text" id="t2"/>
    <input type="button" value="OK"
           onClick="var t1=document.getElementById('t1').value;var t2=document.getElementById('t2').value;window.location.href = 'register?name='+t1+'&phone='+t2;"/>
</form>
<br>href="register?name=小明&phone=1253245908509"
<br><br>
<hr>
<a href="querySelf"> 查看个人信息 </a>
<form method="get">
    id:<input type="text" id="t3"/>
    name:<input type="text" id="t4"/>
    <input type="button" value="OK"
           onClick="var t3=document.getElementById('t3').value;var t4=document.getElementById('t4').value;window.location.href = 'querySelf?id='+t3+'&name='+t4;"/>
</form>
<br>href="querySelf?id=6&name=abc"
<br><br>
<hr>
<a href="addWuPin"> 添加物品 </a>
<form method="get">
    type:<input type="text" id="t5"/>
    description:<input type="text" id="t6"/>
    price:<input type="text" id="t7"/>
    info:<input type="text" id="t8"/>
    mid:<input type="text" id="t9"/>
    num:<input type="text" id="t10"/>
    <input type="button" value="OK"
           onClick="var t5=document.getElementById('t5').value;var t6=document.getElementById('t6').value;var t7=document.getElementById('t7').value;var t8=document.getElementById('t8').value;var t9=document.getElementById('t9').value;var t10=document.getElementById('t10').value;window.location.href = 'addWuPin?type='+t5+'&description='+t6+'&price='+t7+'&info='+t8+'&mid='+t9+'&num='+t10;"/>
</form>
<br>href="addWuPin?type=二手书&description=与母猪的产后护理相关&price=59.9&info=多人想要&mid=1&num=15"
<br><br>
<hr>
<a href="setStats"> 更新物品状态 </a>
<form method="get">
    stats:<input type="text" id="t11"/>
    adminId:<input type="text" id="t12"/>
    wuId:<input type="text" id="t13"/>
    <input type="button" value="OK"
           onClick="var t11=document.getElementById('t11').value;var t12=document.getElementById('t12').value;var t13=document.getElementById('t13').value;window.location.href = 'setStats?stats='+t11+'&adminId='+t12+'&wuId='+t13;"/>
</form>
<br>href="setStats?stats=已下架&adminId=101&wuId=4"
<br><br>
<hr>
<a href="setInformation"> 重设数量 </a>
<form method="get">
    num:<input type="text" id="t14"/>
    info:<input type="text" id="t15"/>
    wuId:<input type="text" id="t16"/>
    memId:<input type="text" id="t17"/>
    <input type="button" value="OK"
           onClick="var t14=document.getElementById('t14').value;var t15=document.getElementById('t15').value;var t16=document.getElementById('t16').value;var t17=document.getElementById('t17').value;window.location.href = 'setInformation?num='+t14+'&info='+t15+'&wuId='+t16+'&memId='+t17;"/>
</form>
<br>href="setInformation?num=33&info=ddjnaeinv&wuId=2&memId=1"
<br><br>
<hr>
<a href="adminWuPin"> 查看管理员管理过的物品 </a>
<form method="get">
    adminId:<input type="text" id="t18"/>
    <input type="button" value="OK"
           onClick="var t18=document.getElementById('t18').value;window.location.href = 'adminWuPin?adminId='+t18;"/>
</form>
<br>href="adminWuPin?adminId=101"
<br><br>
<hr>
<a href="myWuPin"> 查看我的物品 </a>
<form method="get">
    memId:<input type="text" id="t19"/>
    <input type="button" value="OK"
           onClick="var t19=document.getElementById('t19').value;window.location.href = 'myWuPin?memId='+t19;"/>
</form>
<br>href="myWuPin?memId=1"
<br><br>
<hr>
<a href="wuPin"> 查看物品信息 </a>
<form method="get">
    wuPinId:<input type="text" id="t20"/>
    <input type="button" value="OK"
           onClick="var t20=document.getElementById('t20').value;window.location.href = 'wuPin?wuPinId='+t20;"/>
</form>
<br>href="wuPin?wuPinId=4"
<br><br>
<hr>
<a href="creatOrder"> 创建订单 </a>
<form method="get">
    num:<input type="text" id="t21"/>
    wuId:<input type="text" id="t22"/>
    memId:<input type="text" id="t23"/>
    buyerId:<input type="text" id="t24"/>
    <input type="button" value="OK"
           onClick="var t21=document.getElementById('t21').value;var t22=document.getElementById('t22').value;var t23=document.getElementById('t23').value;var t24=document.getElementById('t24').value;window.location.href = 'creatOrder?num='+t21+'&wuId='+t22+'&memId='+t23+'&buyerId='+t24;"/>
</form>
<br>href="creatOrder?num=16&wuId=3&memId=1&buyerId=3"
<br><br>
<hr>
<a href="refreshOrder"> 更新订单数量 </a>
<form method="get">
    buyerId:<input type="text" id="t25"/>
    num:<input type="text" id="t26"/>
    orderId:<input type="text" id="t27"/>
    <input type="button" value="OK"
           onClick="var t25=document.getElementById('t25').value;var t26=document.getElementById('t26').value;var t27=document.getElementById('t27').value;window.location.href = 'refreshOrder?buyerId='+t25+'&num='+t26+'&orderId='+t27;"/>
</form>
<br>href="refreshOrder?buyerId=3&num=6&orderId=1"
<br><br>
<hr>
<a href="buyerOrder"> 买家订单 </a>
<form method="get">
    buyerId:<input type="text" id="t28"/>
    orderId:<input type="text" id="t29"/>
    <input type="button" value="OK"
           onClick="var t28=document.getElementById('t28').value;var t29=document.getElementById('t29').value;window.location.href = 'buyerOrder?buyerId='+t28+'&orderId='+t29;"/>
</form>
<br>href="buyerOrder?buyerId=3&orderId=1"
</body>
</html>

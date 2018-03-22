<%@ page import="com.demo.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: changduo
  Date: 17-11-9
  Time: 上午1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>简介</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<style type="text/css">
    .center-block{
        width:200px;
        height:200px;
    }
    .h1{
        text-align:center;
        font-size:50px;
    }
    .h2{
        text-align:center;
        font-size:30px;
    }
    .content_1{
        font-size: 20px;
    }
    .row{
        align: center;
    }
</style>
<body>
<%
    User user= (User) request.getSession().getAttribute("user");
%>
<div class="img_1">
    <img src="./img/news-1.jpg" alt="..." class="center-block" >
</div>

<div class="h1">
    Hello World!<br>
    <h2>您好：
        <% if (user != null) {%>
        <%=user.getUsername()%>
        <%=user.getId()%>
        <%=user.getPassword()%>
        <% }else{
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }%>
    </h2>
    <div>
        <input type="button" value="修改个人信息" onclick="">
        <a href="info.jsp">修改个人信息</a>
        <input type="button" onclick="toUserList()" value="所有用户">
    </div>
</div>
<div class="h2">

    我是一枚水瓶座的女生,请多关照！
</div>
<div class="row">
    <div class="col-md-3 col-md-offset-2">
        <dt class="content_1">//About me</dt>
        <dd>hywegehdgydghdmkmmfddsgggggggvdfgrrbvfevvrew<br />
            fghhjhfhhdffgsfhdsgdsgdgdgdgfggheff<br />
            sdfggvhjbkncgbnm6tyfyuvbnkk<br />
        </dd>
    </div>
    <div  class="col-md-3 col-md-offset-2">
        <dt class="content_1">//Contact</dt>
        <ul>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>

        </ul>
    </div>

    <div class="col-md-3 col-md-offset-2">

        <div class="row">
            <div class="col-md-3 col-md-offset-2">
                <dt class="content_1">//Education</dt>

                <dd>
                    ********<br>
                    ********<br>
                    ********<br>
                    ********<br>
                </dd>
            </div>
            <div class="col-md-3 col-md-offset-2">
                <dt class="content_1"> &nbsp;</dt>

                <ul>
                    <li>********************<br />
                        *******************************<br /></li>
                    <li>*******************************<br />
                        ************************<br />
                    </li>
                    <li>*****************<br />
                        ****************************<br />
                    </li>
                    <li>******************************<br />
                        ******************<br />
                    </li>

                </ul>
            </div>
        </div>
    </div>
    <div  class="col-md-3 col-md-offset-2">
        <dt class="content_1">//Skills</dt>
        <ul>
            <li>qqq</li>
            <li>www</li>
            <li>rrr</li>
            <li>ttt</li>
            <li>yyy</li>
            <li>yyy</li>
            <li>yyy</li>
            <li>yyy</li>
            <li>yyy</li>

        </ul>
    </div>

    <div  class="col-md-3 col-md-offset-2">
        <dt class="content_1">//Experience</dt>
        <ul>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>
            <li>---------------------------------------</li>
        </ul>
    </div>
    <div class="col-md-3 col-md-offset-2">
        <dt class="content_1">//About all</dt>

        <ul>
            <li>********************<br />
                *******************************<br /></li>
            <li>*******************************<br />
                ************************<br />
            </li>
            <li>*****************<br />
                ****************************<br />
            </li>
            <li>******************************<br />
                ******************<br />
            </li>

        </ul>
    </div>
</div>

<script>
    function toUserList() {
        window.location.href = "/ListUserServlet";
    }
</script>
</body>
</html>

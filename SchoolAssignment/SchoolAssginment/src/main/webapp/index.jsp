<html>

<body>
<h2>Hello World!</h2>
<a href="/helloworld">Hello World!</a>
<h2></h2>
<a href="/mvc/test">MVC Test sdfdssdfsdfsdf</a>
<h2></h2>
<a href="redirect/login.jsp">redirect sample</a>
<h2></h2>
<%--@PathVariable实例--%>
<a href="/requestannotation/getpathvariable/ZhangSan/time/yesterday">@PathVariable Instance: /requestannotation/getpathvariable/ZhangSan/time/yesterday</a><hr/>
<h2></h2> 
<%--@RequestHeader实例--%>
<a href="/requestannotation/requestheader">@RequestHeader Instance</a><hr/>
<hr/>
<%--@RequestParam实例--%>
<a href="/requestannotation/getrequestparam?getname=JuneGuo">@RequestParam[GET]Instantce : /requestannotation/getrequestparam?getname=JuneGuo</a><br>
<form action="/requestannotation/postrequestparam" method="post">
    <input value="Guoxxx" name="postname">
    <input type="submit" value="@RequestParam[POST]Instance"/>
</form><hr/>

<%--@RequestBody实例--%>
<input type="button" onclick="requestbody()" value="Request Body"/>
<input type="text" id="requestbody" class="text"/>
<hr/>
<script type="text/javascript" src="static/jquery-3.3.1.min.js"></script>

<script type="text/javascript">
    //@RequestBody实例：必须指定contentType:application/json
    function requestbody() {
        $.ajax({
            type:"POST",
            url:"/requestannotation/requestbody",
            data:JSON.stringify(
                {username:"ZhangSan",password:"Male"}
            ),
            contentType:"application/json; charset=utf-8",
            success:function (data) {
                console.log(data);
                $("#requestbody").val(data.username + " is " + data.password + ".");
            },
            error:function(){//失败的函数
            	console.log("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            },
            complete:function(){//不管成功还是失败 都会进这个函数
            	console.log("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
            }
        });
    }
</script>

<%--@SessionAttribute实例--%>
<a href="/requestannotation/setsession">@SessionAttribute实例[set]</a><br>
<a href="/requestannotation/getsession">@SessionAttribute实例[get]</a><br>
<a href="/requestannotation/delsession">@SessionAttribute实例[del]</a><br><hr/>

<%--@ModelAttribute实例--%>
<a href="/requestannotation/getmodelattribute?name=ZhangSan&password=input parameter will covered the previous one">@ModelAttribute[GET]Sample</a><br>

</body>
</html>

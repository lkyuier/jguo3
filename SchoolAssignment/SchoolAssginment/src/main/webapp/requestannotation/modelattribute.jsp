<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@ModelAttribute</title>
</head>
<body>
    <h3>@ModelAttribute     在void f(): ${voidmethod}</h3>
    <h3>@ModelAttribute     在Object f(): ${user.password}</h3>
    <h3>@ModelAttribute(...)在Object f(): ${methoduser.password}</h3>
    <h3>@ModelAttribute     method paramter:  ${parammeteruser.password}</h3>
    <h3>@ModelAttribute     method parameter: ${parammeteruser2.password}</h3>
</body>
</html>
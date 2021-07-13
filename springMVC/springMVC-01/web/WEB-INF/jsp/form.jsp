<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!--建议使用相对路径 -->
<form action="${pageContext.request.contextPath}/hello" method="post">
    <label>
        <input type="text" name="method">
    </label>
    <input type="submit">
</form>

</body>
</html>

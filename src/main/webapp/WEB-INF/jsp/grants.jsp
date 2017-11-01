<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sec:authorize access="hasRole('Admin')">
    This content will only be visible to users who have
    the "supervisor" authority in their list of GrantedAuthoritys.
</sec:authorize>
</body>
</html>

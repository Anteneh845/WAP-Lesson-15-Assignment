<%@ taglib prefix="F" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
    <p>
        <F:forEach var="style" items="${styles}">
            <div>
                ${style}
            </div>
        </F:forEach>
    </p>
</body>
</html>
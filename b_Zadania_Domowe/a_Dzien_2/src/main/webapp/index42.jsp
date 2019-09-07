<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:forEach begin="2" step="2" end="10" varStatus="loop">
    ${loop.index}
    <br/>
</c:forEach>
</body>
</html
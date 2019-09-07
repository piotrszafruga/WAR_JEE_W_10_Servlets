<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <p>Wybrany autor ${param.author == null ? "nie istnieje" : "istnieje"}</p>
    <p>Wybrany autor ${empty param.author ? "pusty" : "niepusty"}</p>
</body>
</html>

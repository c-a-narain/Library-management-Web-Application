<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Choose the Program</title>

    <style>
        body {
          background-image: url('book.png');
          background-position: center;
        }

        a{
            font-size: large;
            color: black;
        }
    </style>


</head>

<body>
    <%
        if(session.getAttribute("usname")==null){
            response.sendRedirect("index.jsp");
        }
    %>
    <h1>Welcome</h1>
    <h2>Choose your program</h2>
    <ul>
        <li><a href="ViewAll">Books</a></li>
        <li><a href="update.jsp">Update</a></li>
        <li><a href="add.jsp">Add</a></li>
        <li><a href="delete.jsp">Delete</a></li>
        <li><a href="Logout">Logout</a></li>
    </ul>
</body>

</html>
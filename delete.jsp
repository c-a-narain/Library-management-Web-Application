<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Delete Books</title>
    <script type="text/javascript">
        function func(){
        alert("Book Deleted");
        } 
        </script> 
    <style>
        form{
            font-size:larger;
            color: black;
            text-align: center;
            padding: 10%;
            border: black;
            border-width: 5px;
        }

        body {
          background-image: url('book.png');
          background-position: center;
        }

        h1{
            background-color: aliceblue;
            padding-left: 45%;
        }
    </style>
</head>

<body>
    <%
        if(session.getAttribute("usname")==null){
            response.sendRedirect("index.jsp");
        }
    %>
    <h1>Delete Books</h1>
    <form action="Delete" method="post">
        Enter Book id: <input type="text" name="bid"><br><br>
        <button onclick="func()">Delete</button>
    </form>
</body>

</html>
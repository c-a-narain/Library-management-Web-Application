<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Library Management - Login</title>

    <script type="text/javascript">
        function func(){
        alert("Books Updated");
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
          background-position:center;
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
    <h1>Update Books</h1>
    <form action="Update" method="post">
        Enter Book id: <input type="text" name="bid"><br><br>
        Enter Quantity: <input type="text" name="q"><br><br>
        <button onclick="func()">Update</button>
    </form>
</body>

</html>
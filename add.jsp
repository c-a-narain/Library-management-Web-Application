<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add Books</title>

    <script type="text/javascript">
        function func(){
        alert("Books Added");
        } 
    </script> 

<style>
    form{
        font-size: larger;
        text-align: left;
        padding-top: 10%;
        padding-left: 40%;
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
    <h1>Add Books</h1>
    <%
        if(session.getAttribute("usname")==null){
            response.sendRedirect("index.jsp");
        }
    %>

    <form action="Add" method="post">
        Enter Book id: <input type="text" name="bid"><br><br>
        Enter Book Name: <input type="text" name="name"><br><br>
        Enter Author : <input type="text" name="author"><br><br>
        Enter Edition: <input type="text" name="edd"><br><br>
        Enter Publisher: <input type="text" name="pub"><br><br>
        Enter Quantity: <input type="text" name="q"><br><br>
        <button onclick="func()">Add</button>
    </form>
</body>

</html>
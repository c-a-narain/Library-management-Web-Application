<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Library Management - Login</title>
</head>

<body>
    <form action="Search" method="get">
        Enter Book Name:<input type = "text" name="search">
        <br><br>
        <input type="submit" value="Search">        
    </form>

    <%
        if(session.getAttribute("usname")==null){
            response.sendRedirect("index.jsp");
        }

        String table = (String)session.getAttribute("searchbook");
        String[] table1 = table.split(",");
        int temp = 0;
        String[][] table2 = new String[table1.length/6][6];
        for(int i=0;i<table1.length/6;i++){
            for(int j=0;j<6;j++){
                table2[i][j]=table1[temp];
                temp++;
            }
        }
        out.println("<table border =1>");
            out.print("<tr>");
                out.print("<td><b>Book id</b></td>");
                out.print("<td><b>Book Name</b></td>");
                out.print("<td><b>Book Author</b></td>");
                out.print("<td><b>Book Edition</b></td>");
                out.print("<td><b>Book Publisher</b></td>");
                out.print("<td><b>Book Quantity</b></td>");
            out.println("</tr>");

            for(int i=0;i<(table2.length);i++){
                out.print("<tr>");
                for(int j=0;j<6;j++){
                    out.print("<td>"+table2[i][j]+"</td>");
                }
                out.print("</tr>");
            }
        out.println("</table>");
    %>
    <br>
    <form action="ViewAll.jsp">
        <input type="submit" value="Close" />
    </form>
</body>

</html>
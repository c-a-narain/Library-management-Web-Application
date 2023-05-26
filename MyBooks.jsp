<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>My Books</title>
</head>

<body>
    <%
        if(session.getAttribute("usname")==null){
            response.sendRedirect("index.jsp");
        }
    %>
    
    <%
        String table = (String)session.getAttribute("table");
        //out.print(table);
        String[] table1 = table.split(",");
        int temp = 0;
        String[][] table2 = new String[table1.length/7][7];
        for(int i=0;i<table1.length/7;i++){
            for(int j=0;j<7;j++){
                table2[i][j]=table1[temp];
                temp++;
            }
        }
        out.println("<table border =1>");
            out.print("<tr>");
                out.print("<td>Book id</td>");
                out.print("<td>Book Name</td>");
                out.print("<td>Book Author</td>");
                out.print("<td>Book Edition</td>");
                out.print("<td>Book Publisher</td>");
                out.print("<td>Borrow Date</td>");
                out.print("<td>Return date</td>");
            out.println("</tr>");

            for(int i=0;i<(table2.length);i++){
                out.print("<tr>");
                for(int j=0;j<7;j++){
                    out.print("<td>"+table2[i][j]+"</td>");
                }
                out.print("</tr>");
            }
        out.println("</table>");
    %>
</body>

</html>
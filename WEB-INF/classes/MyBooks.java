import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyBooks extends HttpServlet {
    static {
            System.loadLibrary("task5");
    }

    private native String BorrowedBooks(String username);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("usname");
        
        String table = BorrowedBooks(username);
        
        session.setAttribute("table",table);

        response.sendRedirect("MyBooks.jsp");
    }
}

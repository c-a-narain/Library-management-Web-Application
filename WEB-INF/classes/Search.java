import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Search extends HttpServlet {
    static {
        System.loadLibrary("task5");
    }

    private native String searchBook(String bname);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String bookname = request.getParameter("search");

        String search = searchBook(bookname);

        HttpSession session = request.getSession();
        
        session.setAttribute("searchbook",search);

        response.sendRedirect("search.jsp");
    }
}
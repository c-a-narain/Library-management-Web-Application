import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewAll extends HttpServlet {
    static {
            System.loadLibrary("task5");
    }

    private native String viewBooks();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String table = viewBooks();

        HttpSession session = request.getSession();
        
        session.setAttribute("table",table);

        response.sendRedirect("ViewAll.jsp");
    }
}

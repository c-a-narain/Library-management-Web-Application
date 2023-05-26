import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Return extends HttpServlet {
        static {
                System.loadLibrary("task5");
        }

        private native void returnBook(int bid, String username);

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                        throws ServletException, IOException {
                int bid = Integer.parseInt(request.getParameter("bid"));
                HttpSession session = request.getSession();
                String username = (String) session.getAttribute("usname");
                returnBook(bid, username);

                response.sendRedirect("userlist.jsp");
        }

}

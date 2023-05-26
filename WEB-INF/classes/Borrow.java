
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Borrow extends HttpServlet {
	static{
        System.loadLibrary("task5");
    }

    private native void borrowBook(int bid,String username);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bid = Integer.parseInt(request.getParameter("bid"));
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("usname");
        borrowBook(bid,username);		

        response.sendRedirect("userlist.jsp");
	}
}
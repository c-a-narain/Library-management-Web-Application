
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet {
	static{
        System.loadLibrary("task5");
    }

    private native void deleteBook(int bid);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bid = Integer.parseInt(request.getParameter("bid"));
        deleteBook(bid);	

		response.sendRedirect("adminlist.jsp");
	}
}

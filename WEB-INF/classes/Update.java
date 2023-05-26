import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update extends HttpServlet {
	static{
        System.loadLibrary("task5");
    }

    private native void updateBook(int bid,int q);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bid = Integer.parseInt(request.getParameter("bid"));
        int q = Integer.parseInt(request.getParameter("q"));
        updateBook(bid, q);
        
        response.sendRedirect("adminlist.jsp");
	}

}

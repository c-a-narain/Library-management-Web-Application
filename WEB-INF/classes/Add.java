import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	static{
        System.loadLibrary("task5");
    }

    private native void addBook(int bid,String name,String author, String edd, String pub,int q);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bid = Integer.parseInt(request.getParameter("bid"));
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String edd = request.getParameter("edd");
        String pub = request.getParameter("pub");
        int q = Integer.parseInt(request.getParameter("q"));

        addBook(bid, name, author, edd, pub, q);
		
        response.sendRedirect("adminlist.jsp");
	}

}

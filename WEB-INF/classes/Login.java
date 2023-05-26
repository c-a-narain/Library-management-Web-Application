import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	static{
        System.loadLibrary("task5");
    }

    private native boolean checkadmin(String username, String password);
    private native boolean checkuser(String username, String password);

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usname = request.getParameter("usname");
		String pswd = request.getParameter("pswd");

		// if(usname.equals("admin1@gmail.com") && (pswd.equals("admin1")))
		if(checkadmin(usname, pswd))
        {
            System.out.println("Welcome admin");
            response.sendRedirect("adminlist.jsp");
        }
        // else if (usname.equals("user1@gmail.com") && pswd.equals("user1"))
        else if(checkuser(usname, pswd))
        {
            System.out.println("Welcome user");
            response.sendRedirect("userlist.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }
		
        HttpSession session = request.getSession();
        session.setAttribute("usname",usname);
	}

}

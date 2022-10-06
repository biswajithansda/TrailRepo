import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adding")
public class Addings extends HttpServlet{
   
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer numb1 =Integer.parseInt(req.getParameter("numb1"));
		Integer numb2 =Integer.parseInt(req.getParameter("numb2"));
		
		int sum=numb1+numb2;
		
		resp.sendRedirect("package?sum="+sum);
	}
}

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/add")
public class Adding extends HttpServlet{
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer num1 =Integer.parseInt(req.getParameter("num1"));
		Integer num2 =Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		req.setAttribute("sum", sum);
		
		RequestDispatcher rd=req.getRequestDispatcher("/print");
		rd.include(req, resp);
		
	}
}

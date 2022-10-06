import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/print")
public class Adding2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int sum= (Integer)req.getAttribute("sum");
		
		PrintWriter out=resp.getWriter();
		out.println("sum of the number is ="+sum);
		out.println("square of the sum is ="+sum*sum);
	}

}

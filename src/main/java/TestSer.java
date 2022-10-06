import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestSer extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	RequestDispatcher dispatcher = req.getRequestDispatcher("/test2");
	
	int num1 = Integer.parseInt(req.getParameter("num1"));
	int num2 = Integer.parseInt(req.getParameter("num2"));
	
	int num3 = num1+num2;
	Cookie cookie = new Cookie("num3",num3+"");
	resp.addCookie(cookie);
	dispatcher.forward(req, resp);
	}

}

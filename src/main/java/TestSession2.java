import java.io.IOException;
import java.io.PrintWriter;

import javax.management.ValueExp;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/perform2")
public class TestSession2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		HttpSession session= req.getSession();
		session.getAttribute("student");
		
		Object stu=session.getAttribute("student");
		Object stu2=session.getAttribute("student2");
		
		PrintWriter out = resp.getWriter();
		out.println(stu);
		out.println(stu2);
		
		String value=null;
		String value2=null;
		
		Cookie []arr=req.getCookies();
		for(Cookie ele:arr)
		{
			if(ele.getName().equals("user"))
			{
				value=ele.getValue();
				
			}

			if(ele.getName().equals("password"))
			{
				value2=ele.getValue();
				break;
			}
		}
		System.out.println("user name is = "+value);
		System.out.println("user password is = "+value2);
		
		resp.sendRedirect("perform3");
	}

}

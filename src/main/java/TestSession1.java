import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/perform")
public class TestSession1 extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Student student = new Student(1, "legain");
		Student student2= new Student(2, "biswajit");
		HttpSession session = req.getSession();
		
		session.setAttribute("student", student);
		session.setAttribute("student2", student2);
		
		Cookie cookie=new Cookie("user", "admin");
		Cookie cookie2=new Cookie("password", "123456");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		resp.sendRedirect("perform2");
	}

}
class Student
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

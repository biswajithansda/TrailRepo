package com.jsp.dto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class TestSer2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("this is second servlet class");
		
		String numb = null;
		Cookie[] coo=req.getCookies();
		
		for(Cookie ele:coo)	
		{
			if(ele.equals("num3"))
			{
				numb =ele.getValue();
			}
		}
		
	}
}

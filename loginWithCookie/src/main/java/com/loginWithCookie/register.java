package com.loginWithCookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")

public class register extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		
		Cookie cookie = new Cookie("c-name", name);
		res.addCookie(cookie);
		
		res.sendRedirect(req.getContextPath() + "/index.jsp");
	}
}

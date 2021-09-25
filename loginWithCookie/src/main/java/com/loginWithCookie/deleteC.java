package com.loginWithCookie;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")

public class deleteC extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Cookie cookie = new Cookie("c-name", "");
		cookie.setMaxAge(0);
		res.addCookie(cookie);
		res.sendRedirect(req.getContextPath() + "/index.jsp");
	}
}

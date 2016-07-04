package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class MultiplyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		int n1 = Integer.parseInt(req.getParameter("num1"));
		int n2 = Integer.parseInt(req.getParameter("num2"));
		int mul = n1 * n2;

		resp.setContentType("text/plain");
		resp.getWriter().println(mul);
	}
}

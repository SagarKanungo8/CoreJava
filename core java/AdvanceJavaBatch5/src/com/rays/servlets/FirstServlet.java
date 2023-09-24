package com.rays.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class FirstServlet extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	res.setContentType("text/html");
	//outputstream
	PrintWriter out= res.getWriter();
	out.println("<h1>HelloWorld</h1>");
     out.close();
}
}

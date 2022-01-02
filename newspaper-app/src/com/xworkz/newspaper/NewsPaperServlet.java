package com.xworkz.newspaper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class NewsPaperServlet implements Servlet {

	public NewsPaperServlet() {
		System.out.println(this.getClass().getSimpleName() + " is created");
	}

	@Override
	public void destroy() {
		System.out.println(this.getClass().getSimpleName() + " destroyed");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter printWriter = res.getWriter();
		printWriter.write("<html><body>");
		printWriter.write("<h1>how are you doing</h1>");
		printWriter.write("</body></html>");
		
		printWriter.close();
	
	
	}

}

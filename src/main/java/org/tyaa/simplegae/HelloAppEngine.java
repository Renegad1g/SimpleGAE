package org.tyaa.simplegae;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/Index"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    //response.setContentType("text/plain");
    //response.setCharacterEncoding("UTF-8");

    //response.getWriter().print("Hello App Engine!\r\n");
	  	response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("Hello World!");
  }
}
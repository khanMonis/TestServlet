package com.mmk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloMk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    public HelloMk(HttpServletRequest req,HttpServletResponse res)throws IOException {
    	
    	
    	int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1 + num2;
		PrintWriter out = res.getWriter();
		out.println("result is" +sum);
		
    }
}
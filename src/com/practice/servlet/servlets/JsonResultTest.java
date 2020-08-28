package com.practice.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import json.object.JsonObject;
import json.object.JsonString;

@WebServlet("/JsonTest")
public class JsonResultTest extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		
		PrintWriter out = response.getWriter();
		
		JsonObject obj = new JsonObject();
		
		Enumeration<String> en = request.getParameterNames();
		
		while (en.hasMoreElements()) {
			String name = en.nextElement();
			obj.put(new JsonString(name), new JsonString(request.getParameter(name)));
		}
		
		obj.writeToStream(out);
		
	}
	
}

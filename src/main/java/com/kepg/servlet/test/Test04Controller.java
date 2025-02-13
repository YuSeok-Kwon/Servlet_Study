package com.kepg.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class Test04Controller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		List<Integer> list = new ArrayList<>();
		
		out.println(""
				+ "<html>"
				+ 		"<header><title>test04</title></header>"
				+ 		"<body>"
				+ 			"<ul>"
				);
		
		for(int i = 1; i <= 30; i++) {
			list.add(i);
			out.print(""
					+ 			"<li>" + i + "번째 리스트</li>"
					);
		};
		out.println(""
				+ 			"</ul>"
				+ 		"</body>"
				+ "</html>");
		
		
	}
}

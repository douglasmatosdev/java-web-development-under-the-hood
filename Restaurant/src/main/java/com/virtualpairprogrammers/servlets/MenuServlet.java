package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.data.MenuDataService;
import com.virtualpairprogrammers.domain.MenuItem;

public class MenuServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		MenuDataService menuDataService = new MenuDataService();
		List<MenuItem> menuItens = menuDataService.getFullMenu();
		
		out.println("<html><body>");
		out.println("<h1>Ricky's Restaurant</h1>");
		out.println("<h2>Menu</h2><ul>");
		for(MenuItem menuItem : menuItens) {
			out.println("<li>" + menuItem.toString() + "</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}
}

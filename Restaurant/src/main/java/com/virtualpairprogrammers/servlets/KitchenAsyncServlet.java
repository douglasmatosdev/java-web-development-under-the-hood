package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtualpairprogrammers.data.MenuDao;
import com.virtualpairprogrammers.data.MenuDaoFactory;
import com.virtualpairprogrammers.domain.Order;

@WebServlet(value="/kitchenAsyncServlet", asyncSupported = true)
public class KitchenAsyncServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
//		AsyncContext asyncContext = request.startAsync(request, response);
//		KitchenAsyncTask task = new KitchenAsyncTask();
//		task.setAsyncContext(asyncContext);
//		asyncContext.start(task);

		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Long size = Long.parseLong(request.getParameter("size"));
		MenuDao dao = MenuDaoFactory.getMenuDao();
		
		while(dao.getAllOrders().size() < size) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		
		Order order = dao.getOrder(size);
		out.println("<p><strong>Next order:</strog><br />" + order.toString()+ "</p>");
		out.close();
	}
	
}

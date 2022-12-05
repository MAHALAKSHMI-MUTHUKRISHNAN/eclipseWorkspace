package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class tracking
 */
@WebServlet("/tracking")
public class tracking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tracking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String message ="";
		HttpSession x = request.getSession();
		Integer cnt = (Integer)x.getAttribute("count");
		if(x.isNew())
		{
			message = "Welcome to maha's page for the first time";
			cnt =new Integer(0);
		}
		else
		{
			cnt = new Integer(cnt.intValue()+1) ;
			message = "Welcome to maha's page  for the"+cnt +"th time";
					
		}
		x.setAttribute("count",cnt);
		out.println("<body style='background-color:#F5A9F2; text-align:center'><h2 style='color:#8A0886'>Session tracking using servlets</h2><br><h3>"+message+"</h3><br><p>Previous visit count :"+cnt+"</p></body>");		
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.sa.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sa.demo.Calculator;
/**
 * Servlet implementation class webtestServlet
 */
@WebServlet("/webtestServlet")
public class webtestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public webtestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Calculator mycal=new Calculator();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
         String n1 = request.getParameter("txt1");
         String n2 = request.getParameter("txt2");
         String op = request.getParameter("op");                
 switch (op) {
     case "Addition":
       out.println("The Answer is = "+(Integer.parseInt(n1) + Integer.parseInt(n2)));
    	//out.println("The Answer is = "+ mycal.add(Integer.parseInt(n1),Integer.parseInt(n2)));
         break;
     case "Subtraction":
         out.println("Answer = "+(Integer.parseInt(n1) - Integer.parseInt(n2)));
         break;
     case "multiplication":
         out.println("Answer = "+(Integer.parseInt(n1) * Integer.parseInt(n2)));
         break;
     default:
         out.println("Answer = "+(Integer.parseInt(n1) / Integer.parseInt(n2)));
         break;
 } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

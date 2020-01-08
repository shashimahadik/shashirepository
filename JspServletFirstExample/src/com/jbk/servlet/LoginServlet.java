package com.jbk.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.annotation.processing.SupportedSourceVersion;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jbk.model.StudentModel;
import com.jbk.validation.ValidationService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
       System.out.println("I am in constructor");
    }
@Override
public void init() throws ServletException{
	//destroy();
	System.out.println("I am in init");
}
@Override
public void destroy(){
	System.out.println("destroy");
}
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println("i am in servlet");
	int visitor = 0;
	visitor++;
	System.out.println("visitor >>"+visitor);
	//GET DATA
	String uname=request.getParameter("uname");
    String passwd=request.getParameter("passwd");
    HttpSession session = request.getSession();
    System.out.println(session.getId());
    if(!session.isNew()){
    	session.invalidate();
    	session = request.getSession();
    }
    System.out.println(session.getId());
    System.out.println(session.isNew());
    //session.invalidate();
    //System.out.println(uname);
    //System.out.println(passwd);
    //PROCESS DATA
    //DATABASE CODE.
    System.out.println(1);
    boolean gotoErrorPage = true;
    boolean correct = false;
    gotoErrorPage = ValidationService.isBlankorEmpty(uname);
    if(gotoErrorPage == false){
    StudentModel sm  = new StudentModel();
    correct = sm.checkUsernameIfExistInDb(uname);
    }
   // if(uname.equals("jbk")){ ///old code without database
	   if(correct){
    	//System.out.println("Inside if");
		   ArrayList<String> al = new ArrayList<>();
		   al.add("gokul");
		   al.add("sanjay");
		   al.add("anil");
		   al.add("ravi");
		   al.add("anand");
		   al.add("ajit");
		   request.setAttribute("data", al);
    	//NAVIGATION TO NEXT PAGE
    	RequestDispatcher rd = request.getRequestDispatcher("inbox.jsp");
    	rd.forward(request, response);
    } else {
    	//System.out.println("Inside else");
    	request.setAttribute("msg", "password is wrong...");
    	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    	rd.forward(request, response);
    	// NAVIGATE TO NEXT PAGE
    	
    }
 }

}

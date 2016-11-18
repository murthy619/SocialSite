package com.controller.LoginController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validator.LoginValidator;

public class LoginController extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 4949903184370299849L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        if(LoginValidator.checkUser(email, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("MessagePrinter");
            rs.forward(request, response);
        }
        else
        {
        	request.setAttribute("email","Username or Password incorrect");
          // out.println("Username or Password incorrect");
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }
}
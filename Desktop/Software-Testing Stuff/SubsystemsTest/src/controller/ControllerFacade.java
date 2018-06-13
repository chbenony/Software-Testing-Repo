package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
public class ControllerFacade extends HttpServlet {
	
	/*
	 * Facade for the Controller package
	 * 
	 * */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String caller = request.getParameter("caller");
		//String caller = ((ServletRequest) response).getParameter("caller");
		switch(caller) {
		case("add_emp"):
			request.getRequestDispatcher("Registration").forward(request, response);
			break;
		case("add_timesheet"):
			request.getRequestDispatcher("Timesheet_Control").forward(request, response);
			break;
		case("delete_emp"):
			request.getRequestDispatcher("deleteempcontroller").forward(request, response);
			break;
		case("emplogin"):
			request.getRequestDispatcher("Login").forward(request, response);
			break;
		case("emplrlogin"):
			request.getRequestDispatcher("emplrlogincontroller").forward(request, response);
			break;
		case("forgotpassword"):
			request.getRequestDispatcher("forgotpasswordcontroller").forward(request, response);
			break;
		case("paymode"):
			request.getRequestDispatcher("Paycheck_Generator").forward(request, response);
			break;
		case("registration.jsp"):
			request.getRequestDispatcher("empregistrationcontroller").forward(request, response);
			break;
		case("update_emp_rec"):
			request.getRequestDispatcher("Get_Profile").forward(request, response);
			break;
		case("view_timesheet"):
			request.getRequestDispatcher("Edit_Timesheet_Control").forward(request, response);
			break;
		default:
			System.out.println("Controller does not exist.");
		
		}
		
	}

}

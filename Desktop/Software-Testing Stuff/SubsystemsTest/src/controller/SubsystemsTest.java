package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

class SubsystemsTest {
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}*/
	HttpServletRequest request;
	HttpServletResponse response;
	RequestDispatcher dispatcher;
	HttpSession session;
	
	@Before
	public void setUp() {
		request = mock(HttpServletRequest.class);
		response = mock(HttpServletResponse.class);
		dispatcher = mock(RequestDispatcher.class);
		session = mock(HttpSession.class);
	}
	
	@After
	public void tearDown() {
		request = null;
		response = null;
		dispatcher = null;
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_001() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should forward to the delete_emp.jsp page
		 * and output message "Employee Details deleted"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		//when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_002() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should forward to the delete_emp.jsp page
		 * and output message "Employee Details deleted"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_003() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should forward to the delete_emp.jsp page
		 * and output message "Employee Details deleted"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		//when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_004() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the delete_emp.jsp page
		 * and output message "Empid not found"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		//when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_005() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the delete_emp.jsp page
		 * and output message "Empid not found"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		//when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_01_DeleteEmp_006() throws Exception {
		//Test Setup
		/**
		 * Testing the deleteempcontroller feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the delete_emp.jsp page
		 * and output message "Empid not found"
		 */
		
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		//when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}
	

	@Test
	public void Sys_Test_PMS_02_Login_001() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Sunny Day)
		 * If successful, then the page should forward to the employeehome.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("Login")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("employeehome.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_02_Login_002() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Sunny Day)
		 * If successful, then the page should forward to the employeehome.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("Login")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("employeehome.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_02_Login_003() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Sunny Day)
		 * If successful, then the page should forward to the employeehome.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("employeehome.jsp");
	}
	

	@Test
	public void Sys_Test_PMS_02_Login_004() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the error.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("Login")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_02_Login_005() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the error.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("Login")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	

	@Test
	public void Sys_Test_PMS_02_Login_006() throws Exception {
		//Test Setup
		/**
		 * Testing the Login feature (Rainy Day)
		 * If unsuccessful, then the page should forward to the error.jsp page
		 * 
		 */
		
		when(request.getParameter("caller")).thenReturn("emplogin");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uname")).thenReturn("somePassword");
		when(request.getParameter("pwd")).thenReturn("password");
		when(request.getRequestDispatcher("Login")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_13_AddEmployee_001() throws Exception {
		/*
		 * Tests the Registration module (Sunny day scenario)
		 * If successful, then the page should go to the emplrhome.jsp page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("Registration")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("emplrhome.jsp");

	}	

	@Test
	public void Sys_Test_PMS_13_AddEmployee_002() throws Exception {
		/*
		 * Tests the Registration module (Sunny day scenario)
		 * If successful, then the page should go to the emplrhome.jsp page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("Registration")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("emplrhome.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_13_AddEmployee_003() throws Exception{
		/*
		 * Tests the Registration module (Sunny day scenario)
		 * If successful, then the page should go to the emplrhome.jsp page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("Registration")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("emplrhome.jsp");
	}
	
	
	@Test
	public void Sys_Test_PMS_13_AddEmployee_004() throws Exception{
		/*
		 * Tests the Registration module (Rainy day scenario)
		 * If unsuccessful, then the page should go to the error page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("error.jsp")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_13_AddEmployee_005() throws Exception{
		/*
		 * Tests the Registration module (Rainy day scenario)
		 * If unsuccessful, then the page should go to the error page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("Registration")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_13_AddEmployee_006() throws Exception{
		/*
		 * Tests the Registration module (Rainy day scenario)
		 * If unsuccessful, then the page should go to the error page
		 */
		//Test Setup
		when(request.getParameter("caller")).thenReturn("add_emp");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("fname")).thenReturn("someFname");
		when(request.getParameter("lname")).thenReturn("someLname");
		when(request.getParameter("gen")).thenReturn("F");
		when(request.getParameter("dob")).thenReturn("01/01/2001");
		when(request.getParameter("job")).thenReturn("SomeJob");
		when(request.getParameter("contact")).thenReturn("000-000-0000");
		when(request.getParameter("email")).thenReturn("someuser@someemail.com");
		when(request.getParameter("addr")).thenReturn("SomeAddress");
		when(request.getParameter("accno")).thenReturn("someAccountNumber");
		when(request.getParameter("bname")).thenReturn("someBankName");
		when(request.getRequestDispatcher("Registration")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new Registration().doGet(request, response);
		verify(response).sendRedirect("error.jsp");
	}
	

	@Test
	public void Sys_Test_PMS_15_RemoveEmployee_001() throws Exception {
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should outupt message: "Employee Details Deleted"
		 * 
		 */
		
		//Test Setup
		when(request.getParameter("caller")).thenReturn("emplrlogin");
		when(request.getParameter("eid")).thenReturn("someUser");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
				
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplrhome.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_15_RemoveEmployee_002() throws Exception {
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should outupt message: "Employee Details Deleted"
		 * 
		 */
		
		//Test Setup
		when(request.getParameter("caller")).thenReturn("emplrlogin");
		when(request.getParameter("eid")).thenReturn("someUser");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplrhome.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_15_RemoveEmployee_003() throws Exception {
		/**
		 * Testing the deleteempcontroller feature (Sunny Day)
		 * If successful, then the page should outupt message: "Employee Details Deleted"
		 * 
		 */
		
		//Test Setup
		when(request.getParameter("caller")).thenReturn("emplrlogin");
		when(request.getParameter("eid")).thenReturn("someUser");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_15_RemoveEmployee_004() throws Exception {
			/**
			 * Testing the deleteempcontroller feature (Rainy Day)
			 * If unsuccessful, then the page should output message: "Empid not found"
			 * 
			 */
			
			//Test Setup
			when(request.getParameter("caller")).thenReturn("delete_emp");
			when(request.getParameter("eid")).thenReturn("someUser");
			when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
					
			//Test
			new ControllerFacade().doPost(request, response);
			verify(dispatcher).forward(request, response);
			new deleteempcontroller().doGet(request, response);
			verify(response).sendRedirect("delete_emp.jsp");
		
	}	
	
	public void Sys_Test_PMS_15_RemoveEmployee_005() throws Exception {
		/**
		 * Testing the deleteempcontroller feature (Rainy Day)
		 * If unsuccessful, then the page should output message: "Empid not found"
		 * 
		 */
		
		//Test Setup
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someUser");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
				
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	
	}
	
	public void Sys_Test_PMS_15_RemoveEmployee_006() throws Exception {
		/**
		 * Testing the deleteempcontroller feature (Rainy Day)
		 * If unsuccessful, then the page should output message: "Empid not found"
		 * 
		 */
		
		//Test Setup
		when(request.getParameter("caller")).thenReturn("delete_emp");
		when(request.getParameter("eid")).thenReturn("someUser");
		when(request.getRequestDispatcher("deleteempcontroller")).thenReturn(dispatcher);
				
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("delete_emp.jsp");
	
	}	
	
	
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_001() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Sunny Day)
		 * If successful, then forward to emplogin.jsp
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_002() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Sunny Day)
		 * If successful, then forward to emplogin.jsp
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_003() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Sunny Day)
		 * If successful, then forward to emplogin.jsp
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_004() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Rainy Day)
		 * If unsuccessful, then forward to emplogin.jsp
		 * and display message "user details not found"
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_005() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Rainy Day)
		 * If unsuccessful, then forward to emplogin.jsp
		 * and display message "user details not found"
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}	
	
	@Test
	public void Sys_Test_PMS_19_ForgotPwd_006() throws Exception {
		/**
		 * Testing the forgotpasswordcontroller feature (Rainy Day)
		 * If unsuccessful, then forward to emplogin.jsp
		 * and display message "user details not found"
		 * 
		 */
		//Test Setup
		
		when(request.getParameter("caller")).thenReturn("forgotpassword");
		when(request.getParameter("eid")).thenReturn("someEid");
		when(request.getParameter("uid")).thenReturn("somePassword");
		when(request.getParameter("s1")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a1")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s2")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a2")).thenReturn("someSecurityQuestionAnswer");
		when(request.getParameter("s3")).thenReturn("someSecurityQuestion");
		when(request.getParameter("a3")).thenReturn("someSecurityQuestionAnswer");
		when(request.getRequestDispatcher("forgotpasswordcontroller")).thenReturn(dispatcher);
		
		//Test
		new ControllerFacade().doPost(request, response);
		verify(dispatcher).forward(request, response);
		new deleteempcontroller().doGet(request, response);
		verify(response).sendRedirect("emplogin.jsp");
	}	
	

}

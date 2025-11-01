package com.cmd.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dao.StudentDAO;
import com.cms.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private StudentDAO studentDAO;
	
	public void init() {
		studentDAO = new StudentDAO();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
		//		showNewForm(request, response);
				break;
			case "/insert":
			insertUser(request, response);
				break;
			case "/delete":
		//		deleteUser(request, response);
				break;
			case "/edit":
		//		showEditForm(request, response);
				break;
			case "/update":
		//		updateUser(request, response);
				break;
			default:
			//	listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String Fullname = request.getParameter("Fullname");
		String student_Class = request.getParameter("Student_Class");
		String Instution_Name = request.getParameter("Instution_Name");
		String PhoneNo = request.getParameter("PhoneNo");
		String Address = request.getParameter("Address");
		String City = request.getParameter("City");
		String State = request.getParameter("State");
		String Postcode = request.getParameter("Postcode");
		String Cid = request.getParameter("Cid");
		String Student_Password = request.getParameter("Student_Password");
		
		Student newUser = new Student(Fullname ,student_Class ,Instution_Name ,PhoneNo ,Address,City ,State ,Postcode ,Cid ,Student_Password);
		studentDAO.insertUser(newUser);
		response.sendRedirect("list");
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

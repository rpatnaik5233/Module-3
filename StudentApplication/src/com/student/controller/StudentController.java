package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.bean.StudentBean;
import com.student.exception.StudentException;
import com.student.service.IStudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String path=request.getServletPath().trim();
		String targetPath="viewAll.jsp";
		String targetError="error.jsp";
		IStudentService studentService=new StudentServiceImpl();
		try {
			switch(path)
			{
			case "/viewAll.obj" :
				List<StudentBean> list=studentService.viewAllStudentDetails();
				request.setAttribute("studentList", list);
				break;
				
				
			}
		} catch (StudentException e) {
			targetPath="error.jsp";
			request.setAttribute("message", e.getMessage());
		}
		RequestDispatcher rd=request.getRequestDispatcher(targetPath);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

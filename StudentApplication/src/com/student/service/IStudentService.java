package com.student.service;

import java.util.List;

import com.student.bean.StudentBean;
import com.student.exception.StudentException;

public interface IStudentService {

	public List<StudentBean> viewAllStudentDetails() throws StudentException;
	
}

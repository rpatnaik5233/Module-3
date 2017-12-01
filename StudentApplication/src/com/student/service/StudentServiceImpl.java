package com.student.service;

import java.util.List;

import com.student.bean.StudentBean;
import com.student.dao.IStudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.exception.StudentException;

public class StudentServiceImpl implements IStudentService {
private IStudentDao studentDao=new StudentDaoImpl();
	@Override
	public List<StudentBean> viewAllStudentDetails() throws StudentException {
		return studentDao.viewAllStudentDetails();
	}

}

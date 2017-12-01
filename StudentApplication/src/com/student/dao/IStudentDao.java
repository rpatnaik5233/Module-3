package com.student.dao;

import java.util.List;

import com.student.bean.StudentBean;
import com.student.exception.StudentException;

public interface IStudentDao {

	List<StudentBean> viewAllStudentDetails()throws StudentException;
}

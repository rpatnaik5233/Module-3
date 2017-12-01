package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.bean.StudentBean;
import com.student.exception.StudentException;
import com.student.util.DbConnection;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public List<StudentBean> viewAllStudentDetails() throws StudentException{
		
		List<StudentBean> list=new ArrayList<StudentBean>();
		Connection con=null;
		try {
			
			con=DbConnection.getConnection();
			PreparedStatement pst=con.prepareStatement(QueryMapper.viewAll);
			ResultSet rst=pst.executeQuery();
			
			while(rst.next())
			{
				StudentBean bean=new StudentBean();
				bean.setStudentId(rst.getInt(1));
				bean.setStudentName(rst.getString(2));
				bean.setStudentDob(rst.getDate(3).toLocalDate());
				list.add(bean);
			}
			con.close();
		} catch (StudentException e) {
			throw new StudentException("In DAO LAYER VIEW METHOD"+e.getMessage());
		} catch (SQLException e) {
			throw new StudentException("In DAO LAYER VIEW METHOD"+e.getMessage());
		}
		return list;
	}

}

package com.student.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.student.exception.StudentException;




/**
 * Author 		: CAPGEMINI 
 * Class Name 	: DbConnection
 * Package 		: com.capgemini.donorapplication.utility
 * Date 		: Nov 21, 2016
 */

public class DbConnection {
	public static Connection getConnection() throws StudentException {
		Connection conn = null;

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:/OracleDS");
			conn = ds.getConnection();
		}

		catch (SQLException e) {
			throw new StudentException("SQL Error:"+e.getMessage());
		} catch (NamingException e) {
			throw new StudentException("message from DB/NamingExc:"
					+ e.getMessage());
		}
		return conn;
	}
}

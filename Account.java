package com;

import java.sql.*;
import java.util.Date;

public class Account {
	String dbname="insurance ";
	String user="root";
	String pass="";
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/insurance";
	
	java.sql.Connection con;
	

	public void insertaccount(String username,String email,String password) throws Exception{
		dbConnect();
		Date date=new Date();
		String sql="insert into registerdb(username,email,password,details) values (?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, username);
		pstmt.setString(2, email);
		pstmt.setString(3, password);
		pstmt.setString(4, date.toString());
        pstmt.executeUpdate();
		pstmt.close();
		dbClose();
	}
	

	public void insertaccount1(String ownership,String area,String cost,String total,String salary,String gender,String mobile) throws Exception{
		dbConnect();
		Date date=new Date();
		String sql="insert into homeinsurance(ownership,area,cost,total,salary,gender,mobile,details) values (?,?,?,?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sql);
		pstm.setString(1, ownership);
		pstm.setString(2, area);
		pstm.setString(3, cost);
		pstm.setString(4, total);
		pstm.setString(5, salary);
		pstm.setString(6, gender);
		pstm.setString(7, mobile);
		pstm.setString(8, date.toString());
        pstm.executeUpdate();
		pstm.close();
		dbClose();
	}
	
	public void insertaccount2(String genderl,String agel,String salaryl,String smoke) throws Exception{
		dbConnect();
		Date date=new Date();
		String sql="insert into lifeinsurance(genderl,agel,salaryl,smoke,details) values (?,?,?,?,?)";
		PreparedStatement pstm=con.prepareStatement(sql);
		pstm.setString(1, genderl);
		pstm.setString(2, agel);
		pstm.setString(3, salaryl);
		pstm.setString(4, smoke);
		pstm.setString(5, date.toString());
        pstm.executeUpdate();
		pstm.close();
		dbClose();
	}
	
	
	public boolean acc_validate(String username,String password) throws Exception{
	
		boolean st=false;
	    dbConnect();
	
	    String sql="Select username,password from registerdb where username=? and password=?";
	    PreparedStatement ps =con.prepareStatement(sql);
	    ps.setString(1, username);
	    ps.setString(2, password);
	    ResultSet rs =ps.executeQuery();
        st = rs.next();
      
		return st;
		}
	
	public void homecompare() throws Exception{
		dbConnect();
		
		
		
		
	}
	
	private void dbConnect() throws Exception{

		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pass);
		
		
		}
	
	private void dbClose() throws Exception{
		con.close();
	}
}

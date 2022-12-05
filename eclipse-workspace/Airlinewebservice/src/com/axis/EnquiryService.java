package com.axis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnquiryService implements Enquiry{

	@Override
	public String getDetails(String from, String to) {
		// TODO Auto-generated method stub
		String  s1="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from flights.details where startingpt=? and endingpt=?");
			stmt.setString(1, from);
			stmt.setString(2, to);
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				s1 = s1+"Flight Id:"+rs.getInt(1)+"\nFlightName:"+rs.getString(2);
			else
				s1 = "no flight";
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return s1;
	}

	@Override
	public String getName(int flightNum,int seatNum) {
		// TODO Auto-generated method stub
		String  s1="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flights","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM flights.`?` where pseat = ?" );
			stmt.setInt(1, flightNum);
			stmt.setInt(2, seatNum);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
				s1 = s1+"Passengers Name:"+rs.getString(2)+"\nFlightId:"+rs.getInt(3);
			else
				s1 = "no passenger";
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return s1;
	}
}



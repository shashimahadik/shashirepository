package com.jbk.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtil {
	public static Connection createConnection(){
		Connection connection = null;
	try {
		        Class.forName("com.mysql.jdbc.Driver");
				System.out.println(2);
			    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate" ,"root","root");
				System.out.println(3);
		}catch (Exception e){
		e.printStackTrace();}
    return connection;
	}

public static Statement createStatement(){
	Statement stmt = null;
	try {
	    stmt = createConnection().createStatement();
        } catch (Exception e) {
        	e.printStackTrace();
        }
	    return stmt;
	}  	
}      	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        

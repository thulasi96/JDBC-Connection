package com.jdbc.connection;

import java.sql.*; 
/**
 * @author thulasi
 *
 */
public class JdbcConnection {
	public static void main(String[] args) {
		
		try{  
			//loading oracle driver to establish database connection.
			Class.forName("com.mysql.jdbc.Driver"); 
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/thulasi","root","1234");  

			Statement statement = connect.createStatement();

			//Adding Values in Table
			statement.executeUpdate("insert into user(UserID,LastName,FirstName)VALUES('2','thulasi','raman');");
			//executeQuery() method of Statement interface is used to execute queries to the database.
			ResultSet result = statement.executeQuery("select * from user");
			
			while(result.next()) 
			
			System.out.println(result.getInt(1)+"  "+ " "+result.getString(3)+"  "+result.getString(2));  
			
			connect.close();  
			
			}catch(Exception e)
				{ 
				System.out.println(e);
				}  
			}  

}

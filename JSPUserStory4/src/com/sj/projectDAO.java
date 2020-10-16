package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class projectDAO {

	  public int insertProject(Project project) throws ClassNotFoundException {
		  String INSERT_USERS_SQL = "INSERT INTO project"+"(id,title,descrp,domain) VALUES " +"(?, ?, ?, ?);";
		  
		  int result = 0;
		  
		  Class.forName("com.mysql.jdbc.Driver");
		  
  try(Connection con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/schemaproject", "root" ,"Mau#1234");
	
		  PreparedStatement preparedStatement = con.prepareStatement(INSERT_USERS_SQL)){
		  preparedStatement.setInt(1, 1);
		  preparedStatement.setString(2, project.getTitle());
		  preparedStatement.setString(3, project.getDecrp());
		  preparedStatement.setString(4, project.getDomain());
		  
		  System.out.println(preparedStatement);
		  
		  result = preparedStatement.executeUpdate();
	  }catch(SQLException e) {
		  
		  e.printStackTrace();
	  }
	  return result;
	  }
}
	


package hi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Employees {

	public  void addDynamically(Employee employee) {
    String url="jdbc:mysql://localhost:3306/college";
    String username="root";
    String password="root";
	String 	sql="insert into employee values(?,?)" ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			Connection connection=DriverManager.getConnection(url,username,password);
			
			
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			
			preparedStatement.execute();
			
			//Statement statement=connection.createStatement();
			
			//statement.execute(sql);
			
			
			connection.close();
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("data saved");
		
		System.out.println(employee.getName());
		System.out.println(employee.getId());
	}
     
}

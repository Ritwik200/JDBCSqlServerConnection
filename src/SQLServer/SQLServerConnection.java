package SQLServer;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class SQLServerConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			String connectionUrl = "jdbc:sqlserver://WIN2019; databaseName = ComputerStorageSolution; integratedSecurity=true;encrypt=false";
			Connection conn=DriverManager.getConnection(connectionUrl);
			System.out.println("The connection has been successfully created ");
					
		} catch (SQLException e) {
			System.out.println("vvvvv");
			e.printStackTrace();
		}
	}

}

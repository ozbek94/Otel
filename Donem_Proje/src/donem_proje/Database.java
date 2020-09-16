/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donem_proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
	public Connection connection = null;

	
	public Database() {
		String url = "jdbc:mysql://localhost:3306/otel" +"?useUnicode=true&characterEncoding=utf8";
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("Driver is loaded.");
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver is not found.");
			System.exit(0);
		}
		
		try {
			connection = DriverManager.getConnection(url, "root","root");
			System.out.println("Connection is successful.");
		} catch (SQLException ex) {
			System.out.println("Connection is failed.");
			System.exit(0);
		}
	}
	public Connection getConnection() {
		return this.connection;
	}
        
        
}
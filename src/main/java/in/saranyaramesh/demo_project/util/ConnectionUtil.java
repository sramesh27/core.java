package in.saranyaramesh.demo_project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionUtil {
	Dotenv env = Dotenv.load();
	
	String url = env.get("DATABASE_HOST");
	String username = env.get("DATABASE_USERNAME");
	String password = env.get("DATABASE_PASSWORD");
	
	Connection connection = null;
	
	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String userName = null;
		String password = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection(url,userName,password);
			 
//			  "jdbc:mysql://aws.connect.psdb.cloud/core_java_db?sslMode=VERIFY_IDENTITY",
//			  "p1sa13420z5bu9400cbs",
//			  "pscale_pw_BEwuhpic2rduwE8CuLvbMUtERWGPTkNCRCodXxL8MAa");
		}
		catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return connection;
	}
	
	public static void close(Connection connection , PreparedStatement  ps) {
		try {
			if(ps !=null) {
				ps.close();
			}
			if(connection!= null) {
				connection.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Connection connection , PreparedStatement  ps , ResultSet  rs) {
		
		try {
			if(rs != null) {
				rs.close();
			}
			if(ps !=null) {
				ps.close();
			}
			if(connection!= null) {
				connection.close();
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


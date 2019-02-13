package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("");
		
				
		
	}

}

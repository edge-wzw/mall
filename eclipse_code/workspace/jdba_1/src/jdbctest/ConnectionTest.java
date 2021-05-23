package jdbctest;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;


public class ConnectionTest {
	@Test
	public void testConnection1() throws SQLException{
		Driver driver = new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/myemployees";
		
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "root");
		

		Connection conn = driver.connect(url, info);
		
		System.out.println(conn);
		
	}
}

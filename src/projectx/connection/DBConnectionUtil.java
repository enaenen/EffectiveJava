package projectx.connection;

import static projectx.connection.ConnectionConst.PASSWORD;
import static projectx.connection.ConnectionConst.URL;
import static projectx.connection.ConnectionConst.USERNAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {


	public static Connection getConnection() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return connection;
		} catch (SQLException e) {
			throw new IllegalArgumentException(e);
		}
	}
}

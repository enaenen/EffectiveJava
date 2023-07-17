package projectx.repository;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projectx.connection.DBConnectionUtil;
import projectx.domain.Item;

/**
 * JDBC - DriverManager 사용
 */

public class ItemRepositoryV0 {

	private Connection getConnection() {
		return DBConnectionUtil.getConnection();
	}

	public Item save(Item item) throws SQLException {

		String sql = "insert into item (name, price, stock) values (?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, item.getName());
			pstmt.setInt(2, item.getPrice());
			pstmt.setInt(3, item.getStock());
			pstmt.executeUpdate();
			return item;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			close(con, pstmt, null);
		}
	}

	private void close(Connection con, Statement stmt, ResultSet rs) {

		if (rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("error = " + e);
			}
		}

		if (stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("stmt close error=" + e);
			}
		}

		if (con != null){
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("con close error= " + e);
			}
		}
	}

}

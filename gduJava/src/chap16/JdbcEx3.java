package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx3 {
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("[연결] MariaDB 연결 완료");
			
			String sql = "create table jdbctemp ("
									+"id varchar(10),"
									+" password varchar(10))";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "");
			int result = pstmt.executeUpdate();
			System.out.println("결과 : " + result);
			pstmt.close();
			
			sql = "insert into jdbctemp (id, password) values (?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "hong");
			pstmt.setString(2, "1111");
			result = pstmt.executeUpdate();
			System.out.println("결과 : " + result);
			pstmt.setString(1, "kim");
			pstmt.setString(2, "2222");
			result = pstmt.executeUpdate();
			System.out.println("결과 : " + result);
			pstmt.setString(1, "lee");
			pstmt.setString(2, "333");
			result = pstmt.executeUpdate();
			System.out.println("결과 : " + result);
			pstmt.close();
			
			sql = "update jdbctemp set password=? where id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "1234");
			pstmt.setString(2, "lee");
			result = pstmt.executeUpdate();
			System.out.println("결과 : " + result+"행 수정완료");
			
			sql = "select * from jdbctemp";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getString("password"));
			}
			pstmt.close();
			
			
			sql = "drop table jdbctemp";
			pstmt = con.prepareStatement(sql);
			result = pstmt.executeUpdate();
			System.out.println("결과 : " + result);
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
					System.out.println("[해제] MariaDB 연결 해제");
				} catch (SQLException e) {
				}
			}
		}

	}

}

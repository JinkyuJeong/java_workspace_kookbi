package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam1 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("MariaDB 연결 완료");
			
			PreparedStatement pstmt = con.prepareStatement("select * from professor");
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("no") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.println(rs.getString("deptno"));
			}
			
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

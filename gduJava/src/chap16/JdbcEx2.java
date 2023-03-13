package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JdbcEx2 {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("MariaDB 연결 완료");
			
			PreparedStatement pstmt = con.prepareStatement("select p.no, p.name, p.hiredate, p.deptno, m.name as \"mname\" "
																												+"from professor p, major m "
																												+"where p.deptno = m.code order by p.deptno");
			
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getInt("no") + "\t");
				System.out.print(rs.getString("p.name") + "\t");
				System.out.print(rs.getDate(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.println(rs.getString("mname"));
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

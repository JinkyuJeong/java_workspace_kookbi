package test20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

/*
[결과]  
sql 문장을 입력하세요
select * from dept
조회된 컬럼 수:3
deptno	dname	loc	
10	대표이사	서울	
20	기획부	서울	
30	기술부	서울	
40	영업부	서울	
50	운용팀	울산	
 */
public class Test2 {

	public static void main(String[] args) {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("[연결] MariaDB 연결 완료");
			
			System.out.println("sql 문장을 입력하세요.");
			String sql = sc.nextLine();
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("조회된 컬럼 수 : " + rsmd.getColumnCount());
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc"));
			}
			rs.close();
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
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

package test20;
/*
 * 문제 :
 * 1. dept 테이블을 복사하여 deptcopy 테이블을 생성
 * 2. deptcopy 테이블에 
 *   deptno :9001  dname:특판1팀 loc : '서울지사' 추가
 *   deptno :9002  dname:특판2팀 loc : '서울지사' 추가
 * 3. dcode 9002인 부서코드의 loc 컬럼의 값을 울산지사 변경
 * 4. 각각의 스텝에   모든 레코드 조회 기능 추가    
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Test1 {
	private static PreparedStatement pstmt = null;
	private static Connection con = null;
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("[연결] MariaDB 연결 완료");
			// step1
			String sql = "Create table deptcopy as select * from dept";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("======== "+"테이블 생성 완료");
			pstmt.close();
			select();

			// step2
			sql = "insert into deptcopy (deptno, dname, loc) values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			pstmt.setString(2, "특판1팀");
			pstmt.setString(3, "서울지사");
			int result = pstmt.executeUpdate();
			System.out.println("======== "+result+"행 추가완료");
			pstmt.setInt(1, 9002);
			pstmt.setString(2, "특판2팀");
			pstmt.setString(3, "서울지사");
			result = pstmt.executeUpdate();
			System.out.println("======== "+result+"행 추가완료");
			pstmt.close();
			select();
			
			//step3
			sql = "update deptcopy set loc = ? where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "울산지사");
			pstmt.setInt(2, 9002);
			result = pstmt.executeUpdate();
			System.out.println("======== "+result+"행 변경완료");
			pstmt.close();
			select();
			
		}catch (ClassNotFoundException e) {
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
	
	private static void select() throws SQLException{
		String sql = "select * from deptcopy";
		pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
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
	}

}

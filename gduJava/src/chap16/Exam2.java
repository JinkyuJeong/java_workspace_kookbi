package chap16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Exam2 {
	private static Connection con = null;
	private static ResultSet rs = null;
	private static PreparedStatement pstmt = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdudb","gdu","1234");
			System.out.println("[연결] MariaDB 연결 완료");
			
			while(true) {
				System.out.println("메뉴를 선택하세요");
				System.out.println("1 : 테이블 생성");
				System.out.println("2 : 테이블에 id, pass 내용 등록");
				System.out.println("3 : 테이블 내용 조회");
				System.out.println("4 : 테이블 제거");
				int menu = sc.nextInt();
				if(menu == 9 ) break;

				switch(menu) {
				case 1: create(); break;
				case 2: 
					System.out.print("id를 입력하세요 : ");
					String id = sc.next();
					System.out.print("pass를 입력하세요 : ");
					String pass = sc.next();
					insert(id,pass); break;
				case 3: select(); break;
				case 4: drop(); break;
				}
			}
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

	private static void create() {
		try {
			String sql = "create table member ("
					+"id varchar(10),"
					+" pass varchar(10))";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("테이블 생성완료");
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	private static void insert(String id, String pass) {
		try {
			String sql = "insert into member (id, pass) values (?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			int result = pstmt.executeUpdate();
			System.out.println(result+"행 추가완료");
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	private static void select() {
		try {
			String sql =  "select * from member";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getString("id") + "\t");
				System.out.println(rs.getString("pass"));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

	private static void drop() {
		try {
			String sql = "drop table member";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			System.out.println("테이블 삭제 완료");
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

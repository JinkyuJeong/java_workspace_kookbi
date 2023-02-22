package exam1;
/*
 * 구동 클래스 실행시 결과가 나오도록 DataAccessObject 인터페이스와 OracleDao,MySqlDao 
 * 클래스를 구현하기.
 * 
 * Oracle DB에서 검색
 * Oracle DB에 삽입
 * Oracle DB에 수정
 * Oracle DB에서 삭제
 * Mysql DB에서 검색
 * Mysql DB에 삽입
 * Mysql DB에 수정
 * Mysql DB에서 삭제 
 */
public class Test1 {

	public static void main(String[] args) {
		dbWork(new OracleDao());
	    dbWork(new MySqlDao());
	}
	
	private static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
  }
	
}

interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("MySql DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}
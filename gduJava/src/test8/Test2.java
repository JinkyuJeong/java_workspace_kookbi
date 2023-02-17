package test8;
import java.util.Date;
/*
* 회사의 직원(Employee)은 여러 유형으로 나뉜다
* 모든 직원은 직원구분, 이름, 주소, 소속부서를 가진다.
* 1. 정규직원(FormalEmployee) : 직원번호,직급, 연봉을 가진다.
*             급여는 연봉 /12
* 2. 비정규직원(InformalEmployee) : 계약 만료일(Date),기본임금을 가진다.
*             급여는 기본임금을 지급한다
* 3. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
*             급여는 시간당 임금 * 근무시간으로 지급한다.
* 모든직원은 급여를 받아야 한다 . 각각의 클래스에 getPay() 메서드를 구현하기
* 모든 직원들은 자신의 멤버변수의 내용을 입력받아 객체로 생성한다.
* 
* [결과]
정규직=>박정규:4166666
비정규직=>유비정:1000000
임시직=>손임시:250000
전체 직원 급여합:5416666
*/


public class Test2 {

	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부",
				"001","과장",50000000);
		Date exDate = new Date(); //오늘 날짜
		exDate.setTime(exDate.getTime() 
				+ (1000L*60*60*24*365));
		emps[1] = new InformalEmployee("유비정","서울","기획부",
				exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부",
				25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":" 
		                      + e.getPay());
			total += e.getPay();
		}				
		System.out.println("전체 직원 급여:" + total);

	}

}

abstract class Employee {
	String type;
	String name;
	String address;
	String dept;

	public Employee(String type, String name, String address, String dept) {
		this.type = type;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}
	// 추상메서드
	abstract int getPay();
}

class FormalEmployee extends Employee{
	String empno;
	String position;
	int salary;

	public FormalEmployee(String name, String address, String dept, String empno, String position,int salary) {
		super("정규직", name, address, dept);
		this.empno = empno;
		this.salary = salary;
		this.position = position;
	}
	@Override
	public int getPay() {
		return this.salary/12;
	}
}

class InformalEmployee extends Employee{
	Date expireDate;
	int primaryPay;

	public InformalEmployee(String name, String address, String dept, Date d, int primaryPay) {
		super("비정규직", name, address, dept);
		this.expireDate = d;
		this.primaryPay = primaryPay;
	}
	@Override
	public int getPay() {  return primaryPay; }
}

class TempEmployee extends Employee{
	int timepay, emptime;
	
	public TempEmployee(String name, String address, String dept, int timepay, int emptime) {
		super("임시직원", name, address, dept);
		this.timepay = timepay;
		this.emptime =emptime;
	}
	@Override
	public int getPay() {  return timepay*emptime; }
}

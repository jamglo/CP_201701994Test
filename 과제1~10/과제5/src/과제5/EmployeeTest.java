package 과제5;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee Employee = new Employee();

		Employee.setName("김재인");
		Employee.setTel("010-9847-8838");
		Employee.setSal(3500);

		System.out.println("이름 : " + Employee.getName());
		System.out.println("연락처 : " + Employee.getTel());
		System.out.println("연봉 : " + Employee.getSal());

	}

}

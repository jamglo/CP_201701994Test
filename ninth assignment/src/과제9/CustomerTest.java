package 과제9;

public class CustomerTest {

	public static void main(String[] args) {
		Person p1 = new Person("김","대전","010-1111-9999");
		Customer c1 = new Customer("1번",3321);
		
		System.out.println("이름 : "+p1.getName());
		System.out.println("주소 : "+p1.getAdd());
		System.out.println("전화번호 : "+p1.getNum());
		System.out.println("고객번호 : "+c1.cus_num);
		System.out.println("마일리지 : "+c1.mile);

	}

}

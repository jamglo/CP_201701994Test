package 과제6;

import java.util.Scanner;

public class Account {

	String id1, pw1, id2, pw2;

	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오:");
		id1 = sc.nextLine();
		System.out.print("비밀번호를 입력하시오:");
		pw1 = sc.nextLine();
		System.out.println();
	}

	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<로그인>");
		System.out.print("ID:");
		id2 = sc.nextLine();
		System.out.print("PW:");
		pw2 = sc.nextLine();
		if (id1.equals(id2) && pw1.equals(pw2))
			System.out.println("로그인에 성공하였습니다.");
		else
			System.out.println("로그인에 실패하였습니다.");

	}

}

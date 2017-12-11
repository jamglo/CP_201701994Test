package 과제1;

import java.util.Scanner;

public class Kilometer {

	public static void main(String[] args) {
		int mile;
		double kilometer;
		
		Scanner input = new Scanner(System.in);
		System.out.print("마일을 입력하시오: ");
		mile = input.nextInt();
		
		kilometer = mile * 1.609;
		System.out.println(+mile+"마일은 "+kilometer+"킬로미터입니다.");
		
		

	}

}

package 과제2;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int all;

		System.out.print("500원의 개수를 입력하시오 : ");
		a = input.nextInt();
		System.out.print("100원의 개수를 입력하시오 : ");
		b = input.nextInt();
		System.out.print("50원의 개수를 입력하시오 : ");
		c = input.nextInt();
		System.out.print("10원의 개수를 입력하시오 : ");
		d = input.nextInt();

		all = 500 * a + 100 * b + 50 * c + 10 * d;
		System.out.println("총액 : " + all);

	}

}

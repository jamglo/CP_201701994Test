package 과제3;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);

		System.out.print("정수를 입력하시오: ");
		a = in.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = in.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = in.nextInt();

		if (a < b) {
			if (a < c) {
				if (b < c)
					System.out.println("정렬된 숫자: " + a + " " + b + " " + c);
				else
					System.out.println("정렬된 숫자: " + a + " " + c + " " + b);
			} else {
				if (b < a)
					System.out.println("정렬된 숫자: " + c + " " + b + " " + a);
				else
					System.out.println("정렬된 숫자: " + c + " " + a + " " + b);
			}
		} else {
			if (b < c) {

				if (a < c)
					System.out.println("정렬된 숫자: " + b + " " + a + " " + c);
				else
					System.out.println("정렬된 숫자: " + b + " " + c + " " + a);
			} else {
				if (b < a)
					System.out.println("정렬된 숫자: " + c + " " + b + " " + a);
				else
					System.out.println("정렬된 숫자: " + c + " " + a + " " + b);
			}

		}
	}

}
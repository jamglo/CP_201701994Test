package ����3;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�: ");
		a = in.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = in.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = in.nextInt();

		if (a < b) {
			if (a < c) {
				if (b < c)
					System.out.println("���ĵ� ����: " + a + " " + b + " " + c);
				else
					System.out.println("���ĵ� ����: " + a + " " + c + " " + b);
			} else {
				if (b < a)
					System.out.println("���ĵ� ����: " + c + " " + b + " " + a);
				else
					System.out.println("���ĵ� ����: " + c + " " + a + " " + b);
			}
		} else {
			if (b < c) {

				if (a < c)
					System.out.println("���ĵ� ����: " + b + " " + a + " " + c);
				else
					System.out.println("���ĵ� ����: " + b + " " + c + " " + a);
			} else {
				if (b < a)
					System.out.println("���ĵ� ����: " + c + " " + b + " " + a);
				else
					System.out.println("���ĵ� ����: " + c + " " + a + " " + b);
			}

		}
	}

}
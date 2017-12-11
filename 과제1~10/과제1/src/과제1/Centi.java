package 과제1;

import java.util.Scanner;

public class Centi {

	public static void main(String[] args) {
		int centimeter;
		int feet;
		double inch;

		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하시오: ");
		centimeter = input.nextInt();

		feet = centimeter / (int) 30.48; // 30.48에서 30만 저장된다
		inch = (centimeter - feet * 30.48) / 2.54;
		System.out.println(centimeter + "cm는 " + feet + "피트 " + inch + "인치입니다.");

	}

}

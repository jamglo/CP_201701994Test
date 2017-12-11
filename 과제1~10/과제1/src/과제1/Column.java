package 과제1;

import java.util.Scanner;

public class Column {

	public static void main(String[] args) {
		int r;
		int h;
		double vol;

		Scanner input = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = input.nextInt();

		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextInt();

		vol = r * r * 3.141592 * h;
		System.out.println("원기둥의 부피는 " + vol + "입니다.");

	}

}
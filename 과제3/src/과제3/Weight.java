package ����3;

import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		double average;
		int height, weight;
		Scanner in = new Scanner(System.in);

		System.out.print("Ű�� �Է��Ͻÿ�(cm): ");
		height = in.nextInt();
		System.out.print("�����Ը� �Է��Ͻÿ�(kg): ");
		weight = in.nextInt();

		average = (height - 100) * 0.9;
		System.out.println("ǥ�� ü���� " + average + "kg�Դϴ�.");

		if (weight < average)
			System.out.println("����� ��ü���Դϴ�.");
		else if (weight == average)
			System.out.println("����� ǥ�� ü���Դϴ�.");
		else if (weight > average)
			System.out.println("����� ��ü���Դϴ�.");

	}

}

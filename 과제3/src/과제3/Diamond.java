package ����3;

public class Diamond {

	public static void main(String[] args) {
		for (int a = 1; a <= 5; a++) {
			for (int b = 4; b >= a; b--) { // a�� �״�� 1�϶��� ���ǽ��̴�
				System.out.print(" ");
			}
			for (int c = 1; c <= a * 2 - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
			for (int d = 1; d < 5; d++) {
				for (int e = 1; e <= d; e++) { // ���� �ּ��� ��������
					System.out.print(" ");
				}
				for (int f = 7; f >= d * 2 - 1; f--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

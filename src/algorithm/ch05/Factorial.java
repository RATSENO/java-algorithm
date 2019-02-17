package algorithm.ch05;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���");
		int x = stdin.nextInt();

		System.out.println(x + "�� ���丮����" + factorial(x) + "�Դϴ�");
	}
}

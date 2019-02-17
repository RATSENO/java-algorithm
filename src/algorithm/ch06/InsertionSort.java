package algorithm.ch06;

import java.util.Scanner;

public class InsertionSort {

	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ܼ� ���� ����");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.err.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}

		// �迭 x�� �ܼ� ���� ����
		insertionSort(x, nx);

		System.out.println("������������ �����մϴ�.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
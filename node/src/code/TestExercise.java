package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestExercise {
	static int dem = 0;
	static void hanoi(int n, String A, String B, String C) {
		dem = dem+1;
		if (n == 1)
			System.out.println("Chuyen 1 dia tu " + A + " sang " + C);
		else {
			hanoi(n - 1, A, C, B);
			hanoi(1, A, B, C);
			hanoi(n - 1, B, A, C);
		}
	}
	static void nhiphan(int n)
	{
		if(n > 0)
		{
			nhiphan(n/2);
			System.out.print(n%2 + "  ");
		}
	}

	public static void main(String[] args) {
//		int n = 4;
//		hanoi(n, "A", "B", "C");
//		System.out.println("Co " + dem + " lan chuyen dia");
		int k = 139;
		System.out.println("Bieu dien nhi phan cua " + k + " la:");
		nhiphan(k);
	}

}

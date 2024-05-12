package code;

import java.util.Queue;
import java.util.LinkedList;

public class RadixSort {
	int[] a;

	void sinh(int n) {
	}

	void in() {
	}

	void Radix_Sort() {
		Queue Q = new LinkedList();
		Queue []QQ; QQ= new LinkedList[10];
		for(int i = 0 ; i <= 9; i++)
		{
			QQ[i] = new LinkedList();
		}
		int x,vt, d = 1 , max = a[0];
		for(int i = 0 ; i < a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			Q.add(a[i]);
		}
		int k = ("" + max).length();
		for(int i = 1 ; i <= k ; i++)
		{
			while(!Q.isEmpty())
			{
			  x = (int) Q.remove();
			  vt = (x/d)%10;
			  QQ[vt].add(x);
			}
			for(int j = 0 ; j <= 9; j++)
			{
				while(!QQ[j].isEmpty())
				{
					x = (int) QQ[j].remove();
					Q.add(x);
				}
			}
			d = d * 10;
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = (int) Q.remove();
		}
	}

	public static void main(String[] args) {
		RadixSort R = new RadixSort();
		R.sinh(200);
		R.in();
		R.Radix_Sort();
		R.in();
	}
}

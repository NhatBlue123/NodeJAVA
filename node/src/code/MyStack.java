package code;

import java.util.Scanner;

public class MyStack {
	Node top;
	public MyStack() {
	    this.top = null;
	}
	void CreatS()
	{
		top = null;
	}
	boolean isEmpty()
	{
		return this.top == null;
	}
	//top1 = 1,0
	//top2 = 5,top1
	//top3 = 9,top2
	void push(int x)
	{
		top = new Node(x,top);
	}
	int pop()
	{
		int x = 0;
		if(top == null)
		{
			System.out.println("Stack null!");
		}else
		{
			x = top.data;
			top = top.next;
		}
		return x;
	}
	public void displayStack()
	{
		MyStack t = new MyStack();
		System.out.println("Noi dung ngan xep!");
		while(!isEmpty())
		{
			int x = pop();
			System.out.println(x + " ");
			t.push(x);
			
		}
		while(!t.isEmpty())
		{
			int x = t.pop();
			push(x);
		}
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		int x;
		while(true)
		{
			System.out.println("Enter value in stack: ");
			x = sc.nextInt();
			if(x == 0)
			{
				break;
			}
			push(x);
		}
		System.out.println("Added Complete!");
	}
	public int sum()
	{
		MyStack t = new MyStack();
		int s = 0;
		while(!isEmpty())
		{
			int x = pop();
			s += x;
			t.push(x);
		}
		while(!t.isEmpty())
		{
			int x = t.pop();
			push(x);
		}
		return s;
	}
	public void xoaCuoi()
	{
		
	}
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.nhap();
		stack.displayStack();
		System.out.println("Sum: " + stack.sum());
	}

}

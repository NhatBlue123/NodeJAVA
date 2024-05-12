package code;

import java.util.Scanner;

public class MyQueue {
	Node head,tail;
	public MyQueue() {
		// TODO Auto-generated constructor stub
		head = tail = null;
	}
	public boolean isEmpty()
	{
		return head == null;
	}
	public void add(int x)
	{
	   Node t = new Node(x);
	   if(head == null)
	   {
		   head = tail = t;
	   }else {
		   tail.next = t;
		   tail = t;
	   }
	}
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		int x;
		while(true)
		{
			System.out.println("Nhap 1 so<>0 de them vao HD: ");
			x = sc.nextInt();
			if(x == 0)
			{
				break;
			}
			add(x);
		}
		System.out.println("Da Them Xong!!!");
	}
	public void in()
	{
		MyQueue t = new MyQueue();
		System.out.println("Noi dung hang doi");
		while(!isEmpty())
		{
			int x = remove();
			System.out.println(x + " ");
			t.add(x);
		}
		while(!t.isEmpty())
		{
			int x = t.remove();
			add(x);
		}
	}
	public int remove()
	{
		int x = 0;
		if(head == null)
		{
			System.out.println("Hang doi rong!");
		}else {
			x = head.data;
			if(head.next == null)
			{
				head = tail = null;
			}else
			{
				head = head.next;
			}
		}
		return x;
	}
	public int sum()
	{
		MyQueue t = new MyQueue();
		int sum = 0;
		while(!isEmpty())
		{
			int x = remove();
			t.add(x);
			sum += x;
		}
		while(!t.isEmpty())
		{
			int x = t.remove();
			add(x);
		}
		return sum;
	}
	public int max()
	{
		int max = 0;
		MyQueue t = new MyQueue();
		while(!isEmpty())
		{
			int x = remove();
			if(max < x)
			{
				max = x;
				t.add(x);
			}
		}
		while(!t.isEmpty())
		{
			add(t.remove());
		}
		
		return max;
	}
	public void xoaCuoi()
	{
		Node p = head;
		while(p.next.next != null)
		{
			p = p.next;
		}
		p.next = null;
	}
	public void themCuoi(int x)
	{
		Node t = new Node(x);
		Node p = head;
		while(p.next != null)
		{
			p = p.next;
		}
		p.next = t; 
	}
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.nhap();
		queue.in();
//		System.out.println("Sum: " + queue.sum());
//		System.out.println("Max: " + queue.max());
		//queue.xoaCuoi();
		queue.themCuoi(10);
		queue.in();
	}
}

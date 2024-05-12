package DSLK_DeQuy;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int x) {
		data = x;
		next = null;
	}

	Node(int x, Node t) {
		data = x;
		next = t;
	}

	public String toString() {
		return " " + data + " --->";
	}
}

public class DSLK {
	Node head;

	void nhap() {
		int n, x;
		head = null;
		Node cuoi = null;
		Scanner kb = new Scanner(System.in);
		System.out.print("So not can nhap:");
		n = kb.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap gia tri thu " + (i + 1) + ":");
			x = kb.nextInt();
			Node t = new Node(x);
			if (head == null)
				head = cuoi = t;
			else {
				cuoi.next = t;
				cuoi = t;
			}
		}
	}

	void in() {
		Node p = head;
		System.out.print("\n===>");
		while (p != null) {
			System.out.print(p);
			p = p.next;
		}
		System.out.println(" null");
	}

// them các hàm vào đây
	int dem(Node L) {
		if (L == null)
			return 0;
		else
			return 1 + dem(L.next);
	}
    int demLe(Node L)
    {
    	if(L == null)
    	{
    		return 0;
    	}
    	if(L.data % 2 == 1)
    		return 1 + demLe(L.next);
    	else
    		return demLe(L.next);
    }
	int dem_dq() {
		return dem(head);
	}
	int tong(Node L)
	{
		if(L == null)
		{
			return 0;
		}
		else 
		return L.data + tong(L.next);
	}
	int tong_dq()
	{
		return tong(head);
	}
    boolean timX(int x,Node L)
    {
    	if(L == null)
    	{
    		return false;
    	}
    	else {
    		if(L.data == x)
    		{
    			return true;
    		}else {
    			return timX(x, L.next);
    		}
    	}
    }
    void chenX(Node L,int x,int k)
    {
    	if(k == 1)
    	{
    		L = new Node(x,L);
    	}
    }
    int inCuoi(Node L)
    {
    	if(L == null)
    	{
    		return 0;
    	}
    	else {
    	   	if(L.next == null)
    	   	{
    	   		return L.data;
    	   	}
    	   	else {
    	   		return inCuoi(L.next);
    	   	}
    	}
 
    }
	public static void main(String[] args) {
		DSLK L = new DSLK();
		L.nhap();
		L.in();
		System.out.println("Co " + L.dem_dq() + " phan tu trong node");
		System.out.println("Tong node la: " + L.tong_dq());
        System.out.println("Dem le: " + L.demLe(L.head));
        System.out.println("Co so " + "10" + " trong node khong: " + L.timX(10, L.head));
		System.out.println("Node cuoi la: " + L.inCuoi(L.head));
        // chen them loi goi ham vao day
	}
}

package GiaiBaiNode;

import java.util.Random;
import java.util.Scanner;

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node(int data, Node t) {
		this.data = data;
		this.next = t;
	}

	@Override
	public String toString() {
		return "-->" + this.data + "-->";
	}
}

public class MySLL {
	Node head;

	public MySLL() {
		// TODO Auto-generated constructor stub
		this.head = null;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n, s;
		System.out.println("Nhap so luong phan tu dslk: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			s = rd.nextInt(99) + 1;
			head = new Node(s, head);
		}
		System.out.println("Da nhap xong!");
	}

	public void in() {
		if (head == null) {
			System.out.println("DSLK rong!");
		} else {
			System.out.println("Cac phan tu DSLK: ");
			Node p = head;
			while (p != null) {
				System.out.print(p);
				p = p.next;
			}
		}
		System.out.println();
	}

	public int tong() {
		int tong = 0;
		Node p = head;
		while (p != null) {
			tong += p.data;
			p = p.next;
		}
		return tong;
	}

	public int demLe() {
		int dem = 0;
		Node p = head;
		while (p != null) {
			if (p.data % 2 == 1) {
				dem++;
			}
			p = p.next;

		}
		return dem;
	}

	public int inCuoi() {
		Node p = head;
		while (p.next != null) {
			p = p.next;
		}
		return p.data;
	}

	public void hoanVi() {
		Node p = head;
		if (p.next == null) {
			System.out.println("Khong hoan vi duoc!");
		} else {
			int data = p.data;
			int dataNext = p.next.data;
			p.data = dataNext;
			p.next.data = data;
		}
	}

	public void chen() {
		int x = 100;
		int k = 4;
		Node p = head;
		int vt = 1;
		while (p != null && vt < k - 1) {
			vt++;
			p = p.next;
		}
		if(p == null)
		{
			System.out.println("Vi tri chen khong hop le");
		}else {
			Node xx = new Node(x,p.next);
			p.next = xx;
		}
	}
    public void xoa()
    {
    	int k = 3;
    	int vt = 1;
    	Node p = head;
    	while(p != null && vt < k-1)
    	{
    		vt++;
    		p = p.next;
    	}
    	if(p == null || p.next == null)
    	{
    		System.out.println("Vi tri xoa chua hop le");
    	}
    	else {
        	p.next = p.next.next;
    	}
    }
	public static void main(String[] args) {
		MySLL node = new MySLL();
		node.nhap();
		node.in();
		System.out.println("Tong node la: " + node.tong());
		System.out.println("Trong node co " + node.demLe() + " so le");
		System.out.println("So cuoi trong node la: " + node.inCuoi());
		node.hoanVi();
		System.out.println("Hoan vi node1 va node2");
		node.in();
		node.chen();
		System.out.println("Chen 100 vao vi tri 4");
		node.in();
		node.xoa();
		System.out.println("Xoa vi tri thu 3");
		node.in();
	}

}

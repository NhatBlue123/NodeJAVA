package code;

public class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;	
	}
	Node(int data,Node next)
	{
		this.data = data;
		this.next = next;
	}
	@Override
	public String toString()
	{
		return "-->" + this.data + "-->";
	}

}

class LinkedList
{
	Node head;
	static class Node
	{
		char data;
		Node next;
		Node(char data)
		{
			this.data=data;
			this.next=null;
		}
		
	
	}
	
	
	 void add(char ch)
	{
		Node newNode=new Node(ch);
		if(head==null)
		{
			head=newNode;
			return ;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			
			temp=temp.next;
		}
		temp.next=newNode;	
		
	
	}
	
	 void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	public void remove(int pos)
	{
		if(pos<0)
		{
			System.out.println("invaild position");
			return ;
		}
		if(pos==0)
		{
			head=head.next;
			return ;
		}
		
		Node temp=head;
		for(int i=0;i<pos-1;i++)
		{
			if(temp==null|| temp.next==null)
			{
				System.out.println("invalid position");
				return;
			}
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
		return ;
	}
	
	void update(int pos,char ch)
	{
		Node newNode=new Node(ch);
		if(pos<0)
		{
			System.out.println("invaild position");
			return ;
		}
		if(pos==0)
		{
			head.data=ch;
			return ;
		}
		
		Node temp=head;
		for(int i=0;i<pos;i++)
		{
			if(temp==null||temp.next==null)
			{
				System.out.println("invalid position");
				return;
			}
			temp=temp.next;
			
		}
		temp.data=ch;
		
		
	}
	
	
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.remove(0);
		ll.update(1,'X');
		ll.display();
		
		
	}
	
}
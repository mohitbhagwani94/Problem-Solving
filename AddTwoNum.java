import java.util.*;
public class AddTwoNum {

	/**
	 * @param args
	 */
	static Node head1 , head2;
	static class Node{
		int data;
		Node next;
		Node(int n){
			data = n;
			next=null;
		}
	}
	Node add(Node first, Node second){
		Node res=null;
		Node prev = null;
		Node Temp = null;
		int sum, carry = 0;
		while(first != null || second != null){	
			sum = carry + (first !=null? first.data : 0)+(second !=null ? first.data : 0);
			carry = sum>10?1:0;
			sum %=10; 
			if(first != null){
				first = first.next;
			}
			if(second != null){
				second =second.next;
			}
			 Temp = new Node(sum);
			if(res==null){
				res = Temp;
			}else{
				prev.next=Temp;
			}
			prev = Temp;
		}
		if (carry > 0){
			Temp.next = new Node(carry);
		}
		return res;
	}
	void printLinklist(Node head){
		while(head !=null){
			System.out.print(head.data);
			head = head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AddTwoNum list = new AddTwoNum();
		list.head1 = new Node(9);
		list.head1.next = new Node(2);
		list.head1.next.next= new Node(3);
		list.head1.next.next.next =new Node(9);
		
		list.head2 = new Node(9);
		list.head2.next = new Node(2);
		list.head2.next.next= new Node(3);
		list.head2.next.next.next =new Node(9);
		
		list.printLinklist(head1);
		System.out.println();
		list.printLinklist(head2);
		System.out.println();
		Node rs = list.add(head1, head2);
		list.printLinklist(rs);
		
	}

}

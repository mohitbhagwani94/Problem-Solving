/*
	Floy cycle- detection algo
 */
public class Solution {

	public ListNode detectCycle(ListNode a) {
	    ListNode fast = a;
	    ListNode slow = a;
	    boolean flag = false;
	    while(fast!=null && fast.next!=null && slow!=null && (!flag)){
	        
	        fast = fast.next.next;
	        slow = slow.next;
	        
	        if(fast==slow){
	            flag = true;
	            slow = a;
	        }
	    }
	    
	    if(!flag)
	        return null;
	    else{
	        while(fast!=slow){
	            fast = fast.next;
	            slow = slow.next;
	        }   
	        return slow;
	    }
	}
}

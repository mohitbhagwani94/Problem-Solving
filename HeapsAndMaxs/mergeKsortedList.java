import java.util.*;
import java.io.*;

public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
	    TreeMap<Integer,ArrayList<ListNode>> map = new TreeMap<>();
	    ArrayList<ListNode> newVal ;
	    ListNode node = null;
	    for(ListNode head:a){
	        node = head;
	        while(node!=null){
    	        if(map.containsKey(node.val)){
    	            newVal = map.get(node.val);
    	            newVal.add(node);
    	           // map.put(n.val,);
    	        }else{
    	            newVal = new ArrayList<>();
    	            newVal.add(node);
    	            map.put(node.val,newVal);
    	        }
    	        node = node.next;
	        }
	    }
	    
	    ListNode head =null;
	    node = null;
	    
	    for(Map.Entry<Integer,ArrayList<ListNode>> entry : map.entrySet()){
	        newVal = entry.getValue();
	        for(ListNode n:newVal){
    	        if(head==null){
    	            head = n;
    	            node = n;
    	        }else{
    	            node.next = n;
    	            node = node.next;
    	        }
	        }
	    }
	    return head;
	}
}

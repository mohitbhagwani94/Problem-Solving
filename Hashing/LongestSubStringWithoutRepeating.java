public class Solution {
	public int lengthOfLongestSubstring(String a) {
	    int max_length=0;
	    int cur_len=0;
	    HashMap<Character,Integer> hm = new HashMap<Character,Integer>(); 
	    for(int i=0;i<a.length();i++){
	        cur_len+" size = "+hm.size());
	        if(hm.containsKey(a.charAt(i))){
	            int prevIndex = hm.get(a.charAt(i));
	            cur_len = Math.min(cur_len+1,i-prevIndex);
	            
	            hm.put(a.charAt(i),i);    
	            
	        }else{
	            
	            cur_len++;
	            hm.put(a.charAt(i),i);
	        
	        }

                max_length = Math.max(max_length,cur_len);
            
            
	    }
	    return max_length;
	}
}

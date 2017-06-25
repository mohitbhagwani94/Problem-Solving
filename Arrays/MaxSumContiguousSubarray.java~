public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int sum=a.get(0);
	    int max_sum = a.get(0);
	    int size = a.size();
	    for(int i:a){
    	    if(a.get(i)>=0){
    	        sum = sum+a.get(i);
    	        sum = sum>a.get(i)?sum:a.get(i);
    	        max_sum = max_sum>sum?max_sum:sum;
    	    }else{
    	        sum=sum+a.get(i);
    	        if(max_sum<a.get(i)){
    	            max_sum = a.get(i);
    	        }
    	    }
	    }
	    return max_sum;
	}
}

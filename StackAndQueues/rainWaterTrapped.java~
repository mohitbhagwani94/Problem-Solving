public class Solution {
	// DO NOT MODIFY THE LIST
	public int trap(final List<Integer> a) {
	    int right[] = new int[a.size()];
	    int left[] = new int[a.size()];
	    
	   right[0]=a.get(0);
	    left[a.size()-1]=a.get(a.size()-1);
	    
	    for(int i=1;i<a.size();i++){
	        right[i]=Math.max(a.get(i),right[i-1]);
	    }
	    
	    for(int i=a.size()-2;i>=0;i--){
	        left[i]=Math.max(a.get(i),left[i+1]);
	    }
	    
	    int water = 0;
	    
	    for(int i=0;i<a.size();i++)
	        water += Math.min(right[i],left[i])-a.get(i);
	        
	    return water;
	    
	}
}


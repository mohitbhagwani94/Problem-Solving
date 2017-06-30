 public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int n = a.size();
	    for(int i=n-1;i>=0;i--){
	        int numb = a.get(i);
	        if(numb+1>9){
	            if(i==0){
	                a.set(i,0);
	                a.add(0,1);
	            }else{
	                a.set(i,0);
	            }
	        }else{
	            a.set(i,numb+1);
	            break;
	        }
	        
	    }
	    while(a.get(0)==0){
	       a.remove(0);
	   }
	    
	    return a;
	}
}

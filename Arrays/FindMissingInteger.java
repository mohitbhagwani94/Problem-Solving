public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    int size = a.size()+2;
	    int arr[] = new int[size];
	    for(int i=0;i<a.size();i++){
	        if(a.get(i)>0 && a.get(i)<size)
	            arr[a.get(i)]++;
	    }
	    for(int i=1;i<Integer.MAX_VALUE;i++){
	        if(arr[i]==0){
	            return i;
	        }
	    }
	   return 1; 
	}
}

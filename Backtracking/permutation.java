public class Solution {
    ArrayList<ArrayList<Integer>> results;
    int count = 0;
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    results = new ArrayList<>();
	    permutation(a,0,a.size());
	    return results;
	}
	
	public void permutation(ArrayList<Integer> a, int l,int r){
	    if(l==r){
	        results.add(new ArrayList<Integer>());
	        results.get(count).addAll(a);
	        count++;
	    }else{
	        for(int i=l;i<r;i++){
	            a = swap(a,i,l);
	            permutation(a,l+1,r);
	            a = swap(a,i,l);
	        }
	    }
	}
	
	public ArrayList<Integer> swap(ArrayList<Integer> arr,int x,int y){
	    int temp = arr.get(x);
	    arr.set(x,arr.get(y));
	    arr.set(y,temp);
	    return arr;
	}
}

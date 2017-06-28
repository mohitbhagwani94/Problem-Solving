public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	    for(int i=1;i<=a;i++){
	        int c=1;
	        ans.add(new ArrayList<Integer>());
	        for(int j=1;j<=i;j++){
	           // System.out.println(" i= "+i+" j= "+j);
	            (ans.get(i-1)).add(j-1,c);
	            c = c*(i-j)/j;
	        }
	        
	    }
	    return ans;
	}
}


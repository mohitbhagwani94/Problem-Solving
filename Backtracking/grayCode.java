public class Solution {
	public ArrayList<Integer> grayCode(int a) {
	    ArrayList res = new ArrayList<Integer>();
	    res = solve(a);
	    return res;
	}
	public ArrayList<Integer> solve(int n){
	    if(n==0){
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        temp.add(0);
	        return temp;
	    }
	    ArrayList<Integer> gray = solve(n-1);
	    int num;
	    for(int i=gray.size()-1;i>=0;i--){
	        num = gray.get(i);
	        num |=(1<<(n-1));
	        gray.add(num);
	    }
	
	    return gray;
	}
}

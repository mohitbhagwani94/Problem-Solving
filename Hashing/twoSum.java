public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    for(int i=0;i<a.size();i++){
	        int num = b-a.get(i);
	        if(map.containsKey(num)){
	            res.add(map.get(num)+1);
	            res.add(i+1);
	            break;
	        }else{
	            if(!map.containsKey(a.get(i))){
	                map.put(a.get(i),i);
	            }
	        }
	    }
	    return res;
	}
}

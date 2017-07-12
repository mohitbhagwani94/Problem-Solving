public class Solution {
	public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
	    HashMap<String,Integer> map = new HashMap<String,Integer>();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    int count=0;
	    for(int i=0;i<a.size();i++){
	        char str[] = a.get(i).toCharArray();
	        Arrays.sort(str);
	        String strSorted = new String(str);    
	       // System.out.println(strSorted);
	        if(map.containsKey(strSorted)){
	            res.get(map.get(strSorted)).add(i+1);
	        }else{
	            map.put(strSorted,count);
	            res.add(new ArrayList<Integer>());
	            res.get(count).add(i+1);
	            count++;
	        }
	    }
	    return res;
	}
}
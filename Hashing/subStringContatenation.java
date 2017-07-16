public class Solution {
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    if(a==null || b==null || a.length()==0 || b.size() == 0 )
	        return res;
	    
	    HashMap<String,Integer> words = new HashMap<String,Integer>();
	    
	    for(String str:b){
	        int val = 1;
	        if(words.containsKey(str)){
	            val = words.get(str)+1;
	        }
	        words.put(str,val);
	    }
	    int Asize = a.length();
	    int size = b.size();
	    int len = b.get(0).length();
	    
	    for(int i=0;i<=Asize-len*size;i++){
	        HashMap<String, Integer> hashmap = new HashMap<>(words);
	        for(int j=0;j<size;j++){
	            String str = a.substring(i+j*len,i+j*len+len);
	            if(hashmap.containsKey(str)){
	                int val = hashmap.get(str);
	                if(val==1){
	                    hashmap.remove(str);
	                }else{
	                    hashmap.put(str,val-1);
	                }
	            }else{
	                break;
	            }
	        }
	        if(hashmap.isEmpty()){
	        res.add(i);
	    }
	        
	    }
	    
	 return res;   
	}
}

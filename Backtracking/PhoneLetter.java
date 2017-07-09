public class Solution {
    String value[] = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> ans;
	public ArrayList<String> letterCombinations(String a) {
	    ans = new ArrayList<String>();
	    recursive(0,"",a);
	    return ans;
	}
	public void recursive(int level,String str,String a){
	    if(level == a.length()){
	        ans.add(str);
	       return;
	    }
	    int typed = Integer.parseInt(a.charAt(level)+"");
	    
	    for(int i=0;i<value[typed].length();i++){
	        recursive(level+1,str+value[typed].charAt(i),a);
	    }
	    
	}
}

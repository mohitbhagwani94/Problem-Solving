public class Solution {
	public int braces(String a) {
	    Stack<Character> st = new Stack<Character>();
	    for(int i=0;i<a.length();i++){
	        if(a.charAt(i)==')'){
	            int n=0;
	            if(st.pop()=='(')
	                return 1;
	            else{
	                while(st.pop()!='('){
	                    n++;
	                }
	                if(n==0){
	                    return 1;
	                }
	            }
	        }else{
	            st.push(a.charAt(i));
	        }
	    }
	    return 0;
	}
}

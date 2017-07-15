public class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
	    HashMap<Long,Integer> map = new HashMap<Long,Integer>();
	    long a = numerator;
	    long b = denominator;
	   
	    StringBuilder result= new StringBuilder();
	    if((a>0&&b<0)||(a<0&&b>0)){
	        result.append("-");
	    }
	   
	    a=Math.abs(a);
	    b=Math.abs(b);
	    
	    result.append((a/b)+"");
	    long rem = a%b;
	    if(rem!=0){
	        result.append("."); 
	    }
	    
	    while(rem!=0 && (!map.containsKey(rem))){
	        map.put(rem,result.length());
	        rem = rem*10;
	        long res_part = rem/b;
	        result.append(res_part+"");
	        rem = rem%b;
	    }

	    if(rem!=0)
	       result.insert(map.get(rem),"(").append(")");
	       
	    return result.toString();
	}
}

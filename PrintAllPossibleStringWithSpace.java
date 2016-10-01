
public class PrintAllPossibleStringWithSpace {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintAllPossibleStringWithSpace ps = new PrintAllPossibleStringWithSpace();
		String str= "ABCD";
		char buffer[] = new char[2*str.length()-1];
		buffer[0] = str.charAt(0); 
		ps.printAllString(str.toCharArray(),buffer,1,1,str.length());
		

	}
	public void printAllString(char str[],char buffer[],int i,int j,int len){
		if(i==len){
			System.out.println(buffer);
			return;
		}
//		System.out.println("len = 	"+len);
//		System.out.println(i);
		buffer[j]=str[i];
		printAllString(str,buffer,i+1,j+1,len);
		buffer[j]=' ';
		buffer[j+1] = str[i];
		
		printAllString(str, buffer, i+1, j+2, len);
	}

}

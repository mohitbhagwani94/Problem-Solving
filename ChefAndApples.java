//import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ChefAndApples {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		//BitSet bs = new BitSet();
		
		for (int i = 0; i < test; i++) {
			Set<Integer> s = new HashSet<Integer>();
			int trees = sc.nextInt();
			for (int j = 0; j < trees; j++) {
				int app = sc.nextInt();
				s.add(app);
			}
			System.out.println(s.size());
		}
	} 

}

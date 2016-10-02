
public class MaxSizeSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSizeSquare mss = new MaxSizeSquare();
		mss.findSquare();
	}
	int mat [][] = {{0,1,1,0,1},{1,1,0,1,0},{0,1,1,1,0},{1,1,1,1,0},{1,1,1,1,1},{0,0,0,0,0}};
	int alloc [][] = new int[6][5];
	public void findSquare(){
		for(int i = 0;i < 6;i++){
			for(int j=0;j<5;j++){
				alloc[i][j] = Math.min(alloc[i-1][j],Math.min(alloc[i][j-1],alloc[i-1][j-1]));
			}
		}
	}

}

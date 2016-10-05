
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
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<6;i++){
			alloc[i][0] = mat[i][0];
		}
		for(int i=0;i<5;i++){
			alloc[0][i] = mat[0][i];
		}
		for(int i = 1;i < 6;i++){
			for(int j=1;j<5;j++){
				if(mat[i][j]==1){
					alloc[i][j] = Math.min(alloc[i-1][j],Math.min(alloc[i][j-1],alloc[i-1][j-1]))+1;
				}
				else{
					alloc[i][j]=0;
				}
			}
		}
		int max	= 0;
		int max_i=0;
		int max_j=0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if(max<alloc[i][j]){
					max = alloc[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(alloc[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(max_i +"  "+ max_j);
		System.out.println();
//		for (int i = max_i; i > 6 - max_i - 1; i--) {
//			for (int j = max_j; j >= 5 - max_j - 1; j--) {
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//		}
		for (int i = max_i; i >= 6 - max-1 ; i--) {
			for (int j = max_j; j >= 5 - max-1; j--) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}

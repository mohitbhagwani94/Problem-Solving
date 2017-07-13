public class Solution {
	int N;
	ArrayList<ArrayList<String>> res;
	int count=0;
	public ArrayList<ArrayList<String>> solveNQueens(int a) {
	       N=a;
	       int board[][] = new int[a][a];
	       for(int i =0;i<N;i++){
	           for(int j=0;j<N;j++){
	               board[i][j]=0;
	           }
	       }
	       res = new ArrayList<>();
	       NQueenProblem(board,0);
	       return res;
	}
	public void NQueenProblem(int board[][],int col){
    	  if(col==N){
    	     res.add(new ArrayList<String>());
    	    for(int i=0;i<N;i++){
    	        String q = "";
    	        for(int j=0;j<N;j++){
    	           if(board[i][j]==1)
    	               q+="Q";
    	           else
    	                q+=".";
    	        }
    	        res.get(count).add(q);
    	    }
    	    count++;
    	    return;
    	  }
    	  
    	  for(int i=0;i<N;i++){
    	      if(isSafe(board,i,col)){
    	          board[i][col]=1;
    	          NQueenProblem(board,col+1);
    	          board[i][col]=0;;
    	      }
    	  }
	}
	public boolean isSafe(int board[][],int row,int col){
	    int i,j;
	    for(i=0;i<col;i++){
	        if(board[row][i]==1)
	            return false;
	    }
	    
	    for(i=row, j=col;i>=0 && j>=0;i--,j--){
	        if(board[i][j]==1)
	            return false;
	    }
	    
	    for( i=row,j=col;i<N && j>=0;i++,j--){
	        if(board[i][j]==1)
	            return false;
	    }
	    
	    return true;
	}
}

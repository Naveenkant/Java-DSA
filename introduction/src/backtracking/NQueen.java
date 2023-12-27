package backtracking;

public class NQueen {
	static int N = 4; 
	public static void main(String[] args) {
		solveNQ(); 

	}
	static int []ld = new int[30]; 
	  
	
	static int []rd = new int[30]; 
	
	static int []cl = new int[30]; 
	  
	
	static void printSolution(int board[][]) 
	{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	            System.out.printf(" %d ", board[i][j]); 
	        System.out.printf("\n"); 
	    } 
	} 
	  
	/* A recursive utility function to solve N 
	Queen problem */
	static boolean solveNQUtil(int board[][], int col) 
	{ 
	    /* base case: If all queens are placed 
	    then return true */
	    if (col >= N) 
	        return true; 
	  
	    /* Consider this column and try placing 
	    this queen in all rows one by one */
	    for (int i = 0; i < N; i++) 
	    { 
	    	if ((ld[i - col + N - 1] != 1 && 
	             rd[i + col] != 1) && cl[i] != 1) 
	        { 
	            board[i][col] = 1; 
	            ld[i - col + N - 1] = 
	            rd[i + col] = cl[i] = 1; 

  
	            if (solveNQUtil(board, col + 1)) 
	          board[i][col] = 0; // BACKTRACK 
	            ld[i - col + N - 1] = 
	            rd[i + col] = cl[i] = 0; 
	        } 
	    } 
	  
	  
	    return false; 
	}
	static boolean solveNQ() 
	{ 
	    int board[][] = {{ 0, 0, 0, 0 }, 
	                     { 0, 0, 0, 0 }, 
	                     { 0, 0, 0, 0 }, 
	                     { 0, 0, 0, 0 }}; 
	  
	    if (solveNQUtil(board, 0) == false)  
	    { 
	        System.out.printf("Solution does not exist"); 
	        return false; 
	    } 
	  
	    printSolution(board); 
	    return true; 
	} 
	
	} 
	  



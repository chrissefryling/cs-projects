public class Practice {

	private int nrRows;
	private int nrCols;
	private int [][] board;
	public Practice(){
		nrRows = 3;
		nrCols= 3;
		board = new int[nrRows][nrCols];
	}
	private boolean isValidChoice(int row, int col){
		for(int col1 = 0; col1 < nrRows; col1++){
			if(board[row][col1]==1) return false;
		}
		for(int row1 = row, col1 = col; row1< nrRows && col1 >=0; row1++, col1--){
			if(board[row1][col1]==1) return false;
			
		}
		for(int row1 = row, col1 = col; row1>= 0 && col1 >= 0; row1--, col1--){
			if(board[row1][col1]==1) return false;
		}
		return true;
		}
	public boolean solve(int col){
		if(col>= nrCols) return true;
		for(int row = 0; row < nrRows; row++ ){
			if(isValidChoice(row, col)){
				board[row][col]=1;
				if(solve(col+1)) return true;
				board[row][col]=0;
			}
			
		}
		return false;
	}
	public String toString(){
		String result = "";
		
		for(int row = 0; row < nrRows; row++){
			for(int col = 0; col < nrCols; col ++){
				result += board[row][col]+" ";
			}
			result += "\n";
		}
		return result;
	}
	public static void main(String [] args){
		Practice Su = new Practice();
		System.out.println(Su);
		System.out.println(Su.solve(0));
		System.out.println(Su);
	}
}

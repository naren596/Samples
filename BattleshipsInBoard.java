
public class BattleshipsInBoard {
	public static void main(String[] args) {
		char[][] board = {{'X', 'X', '.', 'X'}, {'.', '.', '.', '.'}, {'.', '.', '.', 'X'}};
		System.out.println(new BattleshipsInBoard().countBattleships(board));
	}
	
	public int countBattleships(char[][] board) {
		int count = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				if(board[i][j] == 'X' && (j-1 < 0 || board[i][j-1] != 'X') && 
						(i-1 < 0 || board[i-1][j] != 'X')) count++;
			}
		}
        return count;   
    }
}

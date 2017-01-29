import java.util.Stack;


public class IslandPerimeter {
	public static void main(String args[]) {
		IslandPerimeter islP = new IslandPerimeter();
		int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
		System.out.println(islP.islandPerimeter(grid));
	}
	
	public int islandPerimeter(int[][] grid) {
		int m = grid.length, n = grid[0].length, perimeter = 0;
		Node Node_s = null;
		boolean[][] visited =  new boolean[m][n];
		
		// Find starting point first
		outerloop:
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(grid[i][j] == 1){
					Node_s = new Node(i, j);
					break outerloop;
				}
			}
		}
		
		
		if(Node_s != null){
			//Do DFS like traversal
			Stack<Node> stack = new Stack<Node>();
			stack.push(Node_s);
			visited[Node_s.row][Node_s.col] = true;
			while(!stack.isEmpty()) {
				Node_s = stack.pop();
				perimeter += 4;
				if(Node_s.col-1 >= 0 && grid[Node_s.row][Node_s.col-1] == 1) {
					perimeter--;
					if(!visited[Node_s.row][Node_s.col-1]) {
						stack.push(new Node(Node_s.row, Node_s.col-1));
						visited[Node_s.row][Node_s.col-1] = true;
					}
				}
				
				if(Node_s.row-1 >= 0  && grid[Node_s.row-1][Node_s.col] == 1) {
					perimeter--;
					if(!visited[Node_s.row-1][Node_s.col]) {
						stack.push(new Node(Node_s.row-1, Node_s.col));
						visited[Node_s.row-1][Node_s.col] = true;
					}
				}
				
				if(Node_s.col+1 < n && grid[Node_s.row][Node_s.col+1] == 1) {
					perimeter--;
					if(!visited[Node_s.row][Node_s.col+1]) {
						stack.push(new Node(Node_s.row, Node_s.col+1));
						visited[Node_s.row][Node_s.col+1] = true;
					}
				}
				
				if(Node_s.row+1 < m && grid[Node_s.row+1][Node_s.col] == 1) {
					perimeter--;
					if(!visited[Node_s.row+1][Node_s.col]) {
						stack.push(new Node(Node_s.row+1, Node_s.col));
						visited[Node_s.row+1][Node_s.col] = true;
					}
				}
			}
			
		}
		return perimeter;
	}
	
	private class Node{
		int row;
		int col;
		
		Node(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}
}

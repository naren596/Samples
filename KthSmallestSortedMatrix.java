import java.util.Comparator;
import java.util.PriorityQueue;


public class KthSmallestSortedMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,  5,  9},{10, 11, 13},{12, 13, 15}};
		System.out.println(new KthSmallestSortedMatrix().kthSmallest(matrix, 8));
	}
	
	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
        PriorityQueue<Element> queue = new PriorityQueue<Element>(n, new Comparator<Element>() {
			@Override
			public int compare(Element o1, Element o2) {
				return o1.val - o2.val;
			}
		});
        
        Element ele = null;
        int row, col;
        for(int i = 0; i < n; i++) queue.offer(new Element(matrix[0][i], 0, i));
        
        while(k > 0) {
        	ele  = queue.poll();
        	row = ele.rowNum;
        	col = ele.colNum;
        	k--;

        	if(row+1 < n && col < n) queue.offer(new Element(matrix[row+1][col], row+1, col));
        }
        return ele.val;
    }
}

class Element {
	int val;
	int rowNum;
	int colNum;
	
	Element(int val, int rowNum, int colNum) {
		this.val = val;
		this.rowNum = rowNum;
		this.colNum = colNum;
	}
}

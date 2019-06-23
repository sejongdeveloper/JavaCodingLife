package ex01.colc;

public class Rank_Ver2 {
	public static void main(String[] args) {
		int[][] rank = { {5, 6, 8, 2, 3}, {1, 1, 1, 1, 1} };
		for(int i = 0; i < rank[0].length; i++) {
			for(int j = 0; j < rank[0].length; j++) {
				if(rank[0][i] < rank[0][j]) {
					rank[1][i]++;
				}
			} // j end
		} // i end
		
		System.out.println("score");
		for(int i = 0; i < rank[0].length; i++) {
			System.out.print(rank[0][i] + " ");
		}
		System.out.println();
		System.out.println("rank");
		for(int i = 0; i < rank[1].length; i++) {
			System.out.print(rank[1][i] + " ");
		}
	}
}

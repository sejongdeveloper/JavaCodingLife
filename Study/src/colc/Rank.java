package colc;

public class Rank {
	public static void main(String[] args) {
		int[] score = {5,5,4,2,8};
		int[] rank = {1,1,1,1,1};			
	
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) { //자기보다 큰 수가 있으면 등수 + 1
					rank[i]++;
				}
			} // j end
		} // i end

		System.out.println("원본");	
		for(int s : score) {
			System.out.print(s + " ");
		}		
		
		System.out.println("\n등수");
		for(int r : rank) {
			System.out.print(r + " ");
		}
	}
}

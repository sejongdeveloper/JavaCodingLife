package colc;

public class Rank {
	public static void main(String[] args) {
		int[] score = {5,5,4,2,8};
		int[] rank = {1,1,1,1,1};			
	
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score.length; j++) {
				if(score[i] < score[j]) { //�ڱ⺸�� ū ���� ������ ��� + 1
					rank[i]++;
				}
			} // j end
		} // i end

		System.out.println("����");	
		for(int s : score) {
			System.out.print(s + " ");
		}		
		
		System.out.println("\n���");
		for(int r : rank) {
			System.out.print(r + " ");
		}
	}
}

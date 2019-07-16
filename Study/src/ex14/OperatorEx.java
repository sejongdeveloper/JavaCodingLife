package ex14;

import java.util.function.IntBinaryOperator;

public class OperatorEx {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for(int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int max = maxOrMin( (a,b)-> (a>=b)?a:b );
		System.out.println("max:" + max);
		
		int min = maxOrMin( (a,b)-> (a<=b)?a:b );
		System.out.println("min:" + min);
	}
}

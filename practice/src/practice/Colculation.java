package practice;

public class Colculation {
	public static int sum(int...nums) {
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	public static double avg(int...nums) {
		double sum = sum(nums);
		double avg = sum / nums.length;		
		return avg;
	}
}

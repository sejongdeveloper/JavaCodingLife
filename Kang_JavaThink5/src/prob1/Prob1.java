package prob1;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		// 구현하세요.
		System.out.println(seconds /60 +" +");
		// seconds / 60 / 60 => 3시간 20분 = 60을 나누면 분을 기준으로 나오고
		//                                   다시 60을 나누면 시간을 기준으로 나옴
		// seconds / 60 % 60 => 1시간 20분 = 60(1시간)을 나누면 나머지는 20분(1분 = 60초)
		// seconds % 60 => 1시간 20분 30초 = 60으로 나머지연산을 하면 30초
		return seconds / 60 / 60 + "시" + (seconds / 60 % 60) + "분" + (seconds % 60) + "초";
	}
}
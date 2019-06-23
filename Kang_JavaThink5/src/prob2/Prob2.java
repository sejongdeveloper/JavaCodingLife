package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("생성된 정수 : " + num);
		if (primeNumber(num)) {
			System.out.println("---> 소수입니다.");
		} else {
			System.out.println("---> 소수가 아닙니다.");
		}
	}

	private static int generateRandom() {
		// 구현하세요.
		return (int)(Math.random()*100) + 1;
	}

	private static boolean primeNumber(int num) {
		// 구현하세요.
		// 소수는 1과 자기자신|을 제외해서 나머지가 0나오면 소수아님
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
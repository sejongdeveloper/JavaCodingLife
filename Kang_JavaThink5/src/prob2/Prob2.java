package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int num = generateRandom();
		System.out.println("������ ���� : " + num);
		if (primeNumber(num)) {
			System.out.println("---> �Ҽ��Դϴ�.");
		} else {
			System.out.println("---> �Ҽ��� �ƴմϴ�.");
		}
	}

	private static int generateRandom() {
		// �����ϼ���.
		return (int)(Math.random()*100) + 1;
	}

	private static boolean primeNumber(int num) {
		// �����ϼ���.
		// �Ҽ��� 1�� �ڱ��ڽ�|�� �����ؼ� �������� 0������ �Ҽ��ƴ�
		for(int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}
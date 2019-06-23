package prob1;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " �� ��ȯ �ð� >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		// �����ϼ���.
		System.out.println(seconds /60 +" +");
		// seconds / 60 / 60 => 3�ð� 20�� = 60�� ������ ���� �������� ������
		//                                   �ٽ� 60�� ������ �ð��� �������� ����
		// seconds / 60 % 60 => 1�ð� 20�� = 60(1�ð�)�� ������ �������� 20��(1�� = 60��)
		// seconds % 60 => 1�ð� 20�� 30�� = 60���� ������������ �ϸ� 30��
		return seconds / 60 / 60 + "��" + (seconds / 60 % 60) + "��" + (seconds % 60) + "��";
	}
}
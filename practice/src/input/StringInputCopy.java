package input;

import java.util.Scanner;

public class StringInputCopy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[100];
		int index = -1;
		System.out.println("[�����] : �ִ�100�� | ���� : exit");
		System.out.println("============ 100�� �޸��� ============");
		do {
			index++; // �ε����� 0���� ���� ( -1 +1)			
			str[index] = sc.nextLine();
		}while(!str[index].equals("exit")); //"exit" ��������
		sc.close();
		
		System.out.println("======================================");
		
		for(String s : str) {
			if(s != null && !s.equals("exit")) // null, "exit" ������ ��� ���ڿ� ���
			System.out.println(s);
		}
		
	}
}

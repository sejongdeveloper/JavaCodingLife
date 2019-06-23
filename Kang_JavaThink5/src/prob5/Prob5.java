package prob5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob5 {
	public static void main(String[] args) {
		String fileName = "./src/prob5/data.txt";
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) {
		// �����ϼ���.
		// try������ ������ �ڵ����� close() ȣ��
		try (Scanner sc = new Scanner(new File(fileName))) {

			while (sc.hasNextLine()) { // �������� ������ true
				String str = sc.nextLine(); // �ѹ����� �о��
				char[] ch = str.toLowerCase().toCharArray();
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] == '_')
						// '_'�̸� ������� �ʰ� ���������� �빮�ڷ� �ٲ�
						ch[i + 1] = (char) (ch[i + 1] - 32); 
					else
						System.out.print(ch[i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
	}
}

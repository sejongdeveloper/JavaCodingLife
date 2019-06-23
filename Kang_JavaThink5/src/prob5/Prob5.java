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
		// 구현하세요.
		// try구문이 끝나면 자동으로 close() 호출
		try (Scanner sc = new Scanner(new File(fileName))) {

			while (sc.hasNextLine()) { // 다음문장 있으면 true
				String str = sc.nextLine(); // 한문장을 읽어옴
				char[] ch = str.toLowerCase().toCharArray();
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] == '_')
						// '_'이면 출력하지 않고 다음문장을 대문자로 바꿈
						ch[i + 1] = (char) (ch[i + 1] - 32); 
					else
						System.out.print(ch[i]);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}

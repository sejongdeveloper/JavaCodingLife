package oneAndOne;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("10.10.10.166", 5000);
		System.out.println("���Ἲ��");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		String nick = "�ڹ�";
		while(true) {
			String str = br.readLine();
			if(str.trim().equalsIgnoreCase("exit")) break;
			bw.write("[" + nick +"] "+ str + "\r\n");
			bw.flush();
		}
		System.out.println("Ŭ���̾�Ʈ ����");
		br.close();
		bw.close();
			
	}
	
}

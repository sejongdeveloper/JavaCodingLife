package testNet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 5000);
		System.out.println("Ŭ���̾�Ʈ ����");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String msg;
		msg = sc.readLine() + "\r\n"; // Ű����κ��� �Է¹���
		bw.write(msg); // �������� ����
		bw.flush();
		System.out.println(br.readLine()); // �������� ���� ���ڿ�
		System.out.println("Ŭ���̾�Ʈ ����");
	}
}

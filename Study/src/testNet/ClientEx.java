package testNet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 5000);
		System.out.println("���ο�û");
//		OutputStream os = s.getOutputStream(); // ������� ��Ʈ��
//		OutputStreamWriter osw = new OutputStreamWriter(os); // ������ȯ
//		BufferedWriter bw = new BufferedWriter(osw); // �������
		// �� 3���� ��ħ
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bw.write("�ȴ�! \r\n"); //Thread �϶��� ���ŷ�� , readLine()�� ���� ����(\r\n)�� ����
		bw.flush(); // write�� ������ ������ flush
	}
}

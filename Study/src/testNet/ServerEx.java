package testNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ServerEx {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress("localhost", 5000));
		System.out.println("���� ����");
		
		Socket s = ss.accept();
		System.out.println("���μ���");
		/////////// Reader /////////////
		InputStream is = s.getInputStream(); // ���� �Է½�Ʈ��
		InputStreamReader isr = new InputStreamReader(is); // reader ��ȯ(��������)
		BufferedReader br = new BufferedReader(isr); // buffer ��ȯ(�������)
		
		try {
			while(true) { 
				System.out.println("aa " + br.readLine()); // \r\n�� �ɴ���� ����
			}
		} catch(SocketException e) {
			System.out.println("Ŭ���̾�Ʈ ����");
		}
	}
}

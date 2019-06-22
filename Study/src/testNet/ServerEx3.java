package testNet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx3 {
	static Socket s;

	public static void main(String[] args) {
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(5000);
			System.out.println("��������");
			s = ss.accept();
			System.out.println(s.getLocalAddress() + "Ŭ���̾�Ʈ ��û����");
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
						String msg;
						while ((msg = br.readLine()) != null) {
							System.out.println(msg); //Ŭ���̾�Ʈ�� ���� ���ڿ�
							bw.write(msg + "\r\n"); //Ŭ���̾�Ʈ���� �ٽ� ����
							bw.flush();
						}
					} catch (IOException e) {
						System.out.println(s.getLocalAddress() + "Ŭ���̾�Ʈ ����");
					}

				}
			});
			thread.start();

		} catch (IOException e) {
		}

	}
}

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
			System.out.println("서버시작");
			s = ss.accept();
			System.out.println(s.getLocalAddress() + "클라이언트 요청수락");
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
						String msg;
						while ((msg = br.readLine()) != null) {
							System.out.println(msg); //클라이언트가 보낸 문자열
							bw.write(msg + "\r\n"); //클라이언트에게 다시 보냄
							bw.flush();
						}
					} catch (IOException e) {
						System.out.println(s.getLocalAddress() + "클라이언트 종료");
					}

				}
			});
			thread.start();

		} catch (IOException e) {
		}

	}
}

package testNet;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientEx2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",5000);
		System.out.println("���� ��û����");
		OutputStream os = s.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF("��ȣ!");
		dos.flush();
		
	}
}

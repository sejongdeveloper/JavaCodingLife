package testNet;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapEx {
	public static void main(String[] args) throws IOException {
		HashMap<String, InputStream> map = new HashMap<>(); // �г�,�Է°�ü�� ���� �ڷᱸ��(map)
		InputStream is = new BufferedInputStream(System.in); //�Է°�ü
		map.put("�г�1", is);
		map.put("�г�2", is);
		map.put("�г�3", is);
		map.put("�г�4", is);
		map.put("�г�5", is);
		
		int inputData = 0; // �о�� ��
		byte[] b = new byte[100]; // ���۱��
		//map�� �Է½�Ʈ�� value�� ��������
		for(InputStream input : map.values()) {		
			try {
				inputData = input.read(b);
				System.out.println(new String(b, 0, inputData-2));
//				input.close(); // �ϳ��� �ص� �������� close()��
			} catch (IOException e) {
				System.out.println("����");
			}
		}
		
		//map�� �г� key���� �Է½�Ʈ�� value�� ��������
		Set<Map.Entry<String, InputStream>> set = map.entrySet(); 
		Iterator<Map.Entry<String, InputStream>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, InputStream> e = (Map.Entry<String, InputStream>)it.next();
			BufferedInputStream bis = (BufferedInputStream)e.getValue();
			inputData = bis.read(b); 
			if(inputData == -1) break;
			System.out.println("[" + e.getKey() + "] " + new String(b, 0, inputData-2));
		}
	}
}

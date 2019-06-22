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
		HashMap<String, InputStream> map = new HashMap<>(); // 닉넴,입력객체를 담을 자료구조(map)
		InputStream is = new BufferedInputStream(System.in); //입력객체
		map.put("닉넴1", is);
		map.put("닉넴2", is);
		map.put("닉넴3", is);
		map.put("닉넴4", is);
		map.put("닉넴5", is);
		
		int inputData = 0; // 읽어온 수
		byte[] b = new byte[100]; // 버퍼기능
		//map의 입력스트림 value값 꺼내오기
		for(InputStream input : map.values()) {		
			try {
				inputData = input.read(b);
				System.out.println(new String(b, 0, inputData-2));
//				input.close(); // 하나만 해도 나머지도 close()됨
			} catch (IOException e) {
				System.out.println("종료");
			}
		}
		
		//map의 닉넴 key값과 입력스트림 value값 꺼내오기
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

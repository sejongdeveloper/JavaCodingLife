package ex01.object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectEx {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<String>();
		list.add("일요일");
		list.add("월요일");
		list.add("화요일");
		list.add("수요일");
		list.add("목요일");
		list.add("금요일");
		list.add("토요일");
		
		OutputStream os = new FileOutputStream("oo.txt");
		
	}
}

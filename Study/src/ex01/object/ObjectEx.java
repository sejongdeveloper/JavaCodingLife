package ex01.object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectEx {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<String>();
		list.add("�Ͽ���");
		list.add("������");
		list.add("ȭ����");
		list.add("������");
		list.add("�����");
		list.add("�ݿ���");
		list.add("�����");
		
		OutputStream os = new FileOutputStream("oo.txt");
		
	}
}

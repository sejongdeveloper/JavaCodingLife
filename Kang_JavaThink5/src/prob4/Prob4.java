package prob4;

import java.util.Vector;

public class Prob4 {
	public static void main(String[] args) {
		Vector<Book> bookList = new Vector<Book>();
		bookList.add(new Book("Java Programming", "��ǻ��", 1400));
		bookList.add(new Book("SQL Programming", "��ǻ��", 1700));
		bookList.add(new Book("Servlet Programming", "��ǻ��", 2300));
		bookList.add(new Book("JDBC Programming", "��ǻ��", 700));
		bookList.add(new Book("EJB Programming", "��ǻ��", 4200));
		bookList.add(new Book("�ƹ���", "�Ҽ�", 1500));
		bookList.add(new Book("����", "�Ҽ�", 1700));
		bookList.add(new Book("���� ����", "�Ҽ�", 1700));
		bookList.add(new Book("����", "�Ҽ�", 1300));
		bookList.add(new Book("�񷹲�", "�Ҽ�", 1000));
		bookList.add(new Book("�� �� ����", "��ȭ", 2000));
		
		System.out.println("��ǻ��å �뿩����");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "��ǻ��"));
		
		System.out.println("�Ҽ�å �뿩����");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "�Ҽ�"));
		
		System.out.println("��ȭå �뿩����");
		System.out.println("---> " + BookManager.getRentalPrice(bookList, "��ȭ"));
	}
}
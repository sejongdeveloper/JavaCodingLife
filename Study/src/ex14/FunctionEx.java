package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx {
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", 90, 96),
			new Student("�ſ��", 95, 93)
	);
	
	public static void printString(Function<Student, String> func) {
		for(Student stu : list) {
			System.out.print(func.apply(stu) + " ");
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> func) {
		for(Student stu : list) {
			System.out.print(func.applyAsInt(stu) + " ");
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Student> func) {
		int sum = 0;
		for(Student stu : list) {
			sum += func.applyAsInt(stu);
		}
		return (double)sum/list.size();
	}
	
	public static void main(String[] args) {
		System.out.println("[�л� �̸�]");
		printString(t->t.getName());
		
		System.out.println("[���� ����]");
		printInt(t->t.getEng());

		System.out.println("[���� ����]");
		printInt(t->t.getMath());
		
		double eng = avg(t->t.getEng());
		System.out.println("���� �������:" + eng);

		double math = avg(t->t.getMath());
		System.out.println("���� �������:" + math);
	}
}

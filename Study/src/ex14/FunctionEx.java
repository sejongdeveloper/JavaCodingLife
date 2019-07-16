package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
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
		System.out.println("[학생 이름]");
		printString(t->t.getName());
		
		System.out.println("[영어 점수]");
		printInt(t->t.getEng());

		System.out.println("[수학 점수]");
		printInt(t->t.getMath());
		
		double eng = avg(t->t.getEng());
		System.out.println("영어 평균점수:" + eng);

		double math = avg(t->t.getMath());
		System.out.println("수학 평균점수:" + math);
	}
}

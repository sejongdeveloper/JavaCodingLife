package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student2> list = Arrays.asList(
			new Student2("ȫ�浿", "����", 90),
			new Student2("�����", "����", 90),
			new Student2("���ڹ�", "����", 95),
			new Student2("���ѳ�", "����", 92)
	);
	
	public static double avg(Predicate<Student2> pre) {
		int count = 0, sum = 0;
		for(Student2 stu : list) {
			if(pre.test(stu)) {
				count++;
				sum += stu.getEng();
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		double avg = avg(t->t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + avg);

		double avg2 = avg(t->t.getSex().equals("����"));
		System.out.println("���� ��� ����: " + avg2);
	}
}

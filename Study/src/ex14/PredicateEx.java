package ex14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student2> list = Arrays.asList(
			new Student2("홍길동", "남자", 90),
			new Student2("김순희", "여자", 90),
			new Student2("김자바", "남자", 95),
			new Student2("박한나", "여자", 92)
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
		double avg = avg(t->t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + avg);

		double avg2 = avg(t->t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + avg2);
	}
}

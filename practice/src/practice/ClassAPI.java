package practice;

public class ClassAPI {
	@AnnotationTest
	String field1 = "자바";
	
	@AnnotationTest(2)
	String field2 = "c언어";
	
	@AnnotationTest(value = 10, index = 10)
	char ch = 'j';
	
	@AnnotationTest
	public ClassAPI() {
		System.out.println("생성자");
	}
	
	@AnnotationTest
	public void test() {
		System.out.println("ffff");
	}
}

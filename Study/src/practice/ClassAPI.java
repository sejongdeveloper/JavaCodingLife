package practice;

public class ClassAPI {
	@AnnotationTest
	String field1 = "�ڹ�";
	
	@AnnotationTest(2)
	String field2 = "c���";
	
	@AnnotationTest(value = 10, index = 10)
	char ch = 'j';
	
	@AnnotationTest
	public ClassAPI() {
		System.out.println("������");
	}
	
	@AnnotationTest
	public void test() {
		System.out.println("ffff");
	}
}

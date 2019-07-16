package ex14;

public class Lamda2 {
	void method(int arg) {
		int localVar = 40;
		
//		arg = 31;
//		localVar = 41;
		
		System.out.println(arg);
		System.out.println(localVar);
		
		Emp emp = ()->{
			System.out.println(arg);
			System.out.println(localVar);
		};
		emp.method();
		
	}
	
	public static void main(String[] args) {
		Lamda2 la = new Lamda2();
		la.method(20);
	}
}

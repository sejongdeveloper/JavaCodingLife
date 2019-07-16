package ex14;

public class Lamda {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			Emp emp = ()->{
				System.out.println("outterField:" + outterField);
				System.out.println("outterField:" + Lamda.this.outterField);

				System.out.println("innerField:" + innerField);
				System.out.println("outterField:" + this.innerField);
			};
			emp.method();
		}
	}
	
	public static void main(String[] args) {
		Lamda la = new Lamda();
		Lamda.Inner in = la.new Inner();
		in.method();
	}
}

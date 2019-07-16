package ex14;

import java.util.function.IntSupplier;

public class SupplierEx {
	public static void main(String[] args) {
		IntSupplier is = ()->{
			return (int)(Math.random()*6)+1;
		};
		System.out.println(is.getAsInt());
	}
}

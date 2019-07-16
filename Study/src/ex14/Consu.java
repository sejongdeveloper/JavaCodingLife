package ex14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class Consu {
	public static void main(String[] args) {
		Consumer<String> c = t-> System.out.println(t + 8);
		c.accept("java");
		
		BiConsumer<String, String> bi = (t, u)-> System.out.println(t + u);
		bi.accept("java", "8");
		
		DoubleConsumer dc = d -> System.out.println("java" + d);
		dc.accept(8.0);
		
		ObjIntConsumer<String> oc = (t, i)-> System.out.println(t + i);
		oc.accept("java", 8);
	}
}

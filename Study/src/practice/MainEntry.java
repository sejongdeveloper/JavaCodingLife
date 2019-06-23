package practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainEntry {
	public static void main(String[] args) {
		Field[] field = ClassAPI.class.getFields();
		Method[] methods = ClassAPI.class.getDeclaredMethods();
		
		System.out.println(methods[0]);
		for(Field ff : field) {
			if(ff.isAnnotationPresent(AnnotationTest.class)) {
				AnnotationTest anno = ff.getAnnotation(AnnotationTest.class);
				
				System.out.println("[" + ff.getName() + "]");
				for(int i = 0; i < anno.index(); i++) {
					System.out.print(anno.value() + 2 + " ");
				}
				System.out.println();
			}
		}
	}
}

package usefulMethod;

public class Math_Round {
	public static void main(String[] args) {
		float f = 12.12345f; 
		int changeF = Math.round(f); //12
		int multiply = Math.round(f*100); // 1212 (*100 곱한 만큼 뒤에 숫자가 추가)
		double division = Math.round(f*1000)/100.0; // 121.23 (*100 = 12123 => /100 = 121.23
		
		System.out.println("float[12.12345] ==> (int)" + changeF);
		System.out.println("float[12.12345] * 100 ==> " + multiply);
		System.out.println("float[12.12345] / 100 ==> " + division);			
		
		double d = 13.12345;
		long changeD = Math.round(d);
		System.out.println("double[13.12345] ==> (long)" + changeD);
		int changeD2 = (int)changeD; // 강제 형변환 가능
		System.out.println("changeD2 : " + changeD2);
		
		String changeStr = String.format("%.2f", d); // 13.12 (String)
		System.out.println("double[13.12345] ==> (String)" + changeStr);
		
	}
}

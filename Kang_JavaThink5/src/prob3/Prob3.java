package prob3;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("제품 번호 : " + getParameter(url, "prdId"));
		System.out.println("제품 이름 : " + getParameter(url, "prdName"));
		System.out.println("제품 가격 : " + getParameter(url, "price"));
		System.out.println("제조 회사 : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		// 구현하세요
		// paramName을 기준으로 시작하여 "&"이 나오면 끝나는 패턴
		// 단, 마지막 maker는 "&"으로 끝나는 패턴이 아니므로 예외
		// paramName=value => paramName의 길이와 "="을 위해 + 1을 하면 value 값부터 시작
		if(paramName.equals("maker")) return url.substring(url.indexOf(paramName) + paramName.length() + 1);
		// paramName=value& => 위의 개념에 "&" 전까지 얻어오는 코드를 추가
		// A.indexOf(String str, fromIndex) => fromIndex에서 시작하여 str이 나오는 A의 위치값을 얻어옴		
		return url.substring(url.indexOf(paramName) + paramName.length() + 1, url.indexOf("&", url.indexOf(paramName)));
	}	
}

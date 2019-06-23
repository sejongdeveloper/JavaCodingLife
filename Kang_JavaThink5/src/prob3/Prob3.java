package prob3;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("��ǰ ��ȣ : " + getParameter(url, "prdId"));
		System.out.println("��ǰ �̸� : " + getParameter(url, "prdName"));
		System.out.println("��ǰ ���� : " + getParameter(url, "price"));
		System.out.println("���� ȸ�� : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		// �����ϼ���
		// paramName�� �������� �����Ͽ� "&"�� ������ ������ ����
		// ��, ������ maker�� "&"���� ������ ������ �ƴϹǷ� ����
		// paramName=value => paramName�� ���̿� "="�� ���� + 1�� �ϸ� value ������ ����
		if(paramName.equals("maker")) return url.substring(url.indexOf(paramName) + paramName.length() + 1);
		// paramName=value& => ���� ���信 "&" ������ ������ �ڵ带 �߰�
		// A.indexOf(String str, fromIndex) => fromIndex���� �����Ͽ� str�� ������ A�� ��ġ���� ����		
		return url.substring(url.indexOf(paramName) + paramName.length() + 1, url.indexOf("&", url.indexOf(paramName)));
	}	
}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AA {
	public static void main(String[] args) {
		//���
		System.out.println("Hellow Github!");
		
		//Date Ŭ���� ����ϱ�
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY�� MM�� dd�� E����");
		System.out.println(sdf.format(date));
		
		//Calendar �߻�Ŭ���� ����ϱ�
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//���ϱ��ϱ� (1:�Ͽ��� ~ 7:�����)
		String dayOfWeek = null;
		switch(week) {
			case 1: dayOfWeek = "�Ͽ���"; break;
			case 2: dayOfWeek = "������"; break;
			case 3: dayOfWeek = "ȭ����"; break;
			case 4: dayOfWeek = "������"; break;
			case 5: dayOfWeek = "�����"; break;
			case 6: dayOfWeek = "�ݿ���"; break;
			case 7: dayOfWeek = "�����";
		}
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		System.out.println("week : " + week);
		System.out.println("dayOfWeek : " + dayOfWeek);
		System.out.println("hour : " + hour);
		System.out.println("minute : " + minute);
		System.out.println("second : " + second);
	}
}

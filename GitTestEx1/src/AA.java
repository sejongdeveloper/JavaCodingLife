import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AA {
	public static void main(String[] args) {
		//출력
		System.out.println("Hellow Github!");
		
		//Date 클래스 사용하기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		
		//Calendar 추상클래스 사용하기
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); 
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일구하기 (1:일요일 ~ 7:토요일)
		String dayOfWeek = null;
		switch(week) {
			case 1: dayOfWeek = "일요일"; break;
			case 2: dayOfWeek = "월요일"; break;
			case 3: dayOfWeek = "화요일"; break;
			case 4: dayOfWeek = "수요일"; break;
			case 5: dayOfWeek = "목요일"; break;
			case 6: dayOfWeek = "금요일"; break;
			case 7: dayOfWeek = "토요일";
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

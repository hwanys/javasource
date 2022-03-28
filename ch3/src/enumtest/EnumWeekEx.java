package enumtest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;
		
		// 오늘 날짜
		LocalDate now = LocalDate.now();	//클래스.now()는 static이구나를 유추할수있음.
//		System.out.println(now);
		
		//요일에 따라서 숫자를 리턴 : 월(1) ~ 일(7)
		DayOfWeek week = now.getDayOfWeek();
		System.out.println(week.getValue());
		
		switch (week.getValue()) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.TUESDAY;
			break;
		case 3:
			today = Week.WEDNESDAY;
			break;
		case 4:
			today = Week.THURSDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATUREDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;

		default:
			break;
		}
		System.out.println("오늘 요일은 "+today);
	}

}

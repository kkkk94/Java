package java0522;

import java.util.Calendar;

public class ExDate {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();	// Calendar.getInstance(); 현재 시간
		
		//날짜구하기
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int month1 = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + "년" + month + "월" + day + "일" + " 입니다");

		//시간구하기
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(hour + "시" + minute + "분" + second + "초" + "입니다" );
		
		//요일 구하기
		//직접 배열 만들기
		String[]DAY = {"일" , "월" , "화" , "수" , "목" , "금" , "토"};	//일요일부터 시작이라 일요일 맨앞에
		String today = DAY[cal.get(Calendar.DAY_OF_WEEK)-1];
		
		System.out.println("오늘은" + today + "요일 입니다");
		
		//특정날짜 설정하기
		System.out.println("특정날짜 설정하기");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, 9, 21, 16, 50);
		
		System.out.println(cal2.getTime());
		
		//날짜변경하기
		System.out.println("===7일 후===");
		cal2.add(Calendar.DATE,7); //2020.10.28
		System.out.println(cal2.getTime());
		
		System.out.println("===6달 전===");//2020.04.28
		cal2.add(Calendar.MONTH, -5);
		cal2.add(Calendar.DATE, -27);	//2020.05.01
		System.out.println(cal2.getTime());
		
		//내생일 출력
		
		System.out.println("내생일");
		Calendar JS = Calendar.getInstance();
		JS.set(1994, 4, 27);
		System.out.println(JS.getTime());
	}

}

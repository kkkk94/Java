package java0522;

public class MyDate {
	/*
	 1.MyDate,MyDateMain 클래스 생성 O
	 
	 2.day, month, year 변수는 private로 선언 O
	 (day 메소드 - switch case : 1월~12월 n일 있는지 확인 ) 
	 private ( 본인 클래스)
	 -적용대상 : 필드, 생성자, 메소드
	 -자신이 아닌 다른 클래스에서는 접근 불가능
	 
	 3.각 변수의 get,set 메소드를 public으로 생성 O
	 
	 4.MyDate(int, day,int,month, int year)생성자 만들기
	 
	 5.public boolean isValid() 메소드로 날짜가 유효한지 확인
	 
	 6.MyDAteMain 클래스에서 생성한 MyDate 날짜가 유효한지 확인
	 

	 윤년 2월
	 
	 달 : 1-12 유효
	 그 이외 유효하지 않다
	
	 */
	
	//day, month, year 변수는 private로 선언
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	//각 변수의 get,set 메소드를 public으로 생성
	//get은 건들이지 않고, set 부분만 수정하기
	public int getDay() {
		System.out.println("getDay : " + day);	//확인차 작성
		System.out.println("getDay isVaild" + isValid);	//확인차 작성
		return day;
	}
	
	public void setDay(int day) {
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if (day > 0 && day <= 31) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
			
		case 4: case 6: case 9: case 11:
			if (day > 0 && day <= 30) {
				this.day = day;
			} else {
				isValid = false;
			}
			break;
			
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				if (day > 0 && day <= 29) {//윤년이면 29 
					this.day = day;
					
				} else {
					isValid = false;
				}
			} else {
				if(day>0 && day <=28) {
					this.day = day;
				}else {
				isValid = false;
				}
			}
			break;
			
		default:
			isValid = false;
		}
		
		this.day = day;
	}
	
	public int getMonth() {
		System.out.println("getMonth : " + month);	//확인차 작성
		System.out.println("getMonth isValid : " + isValid);	//확인차 작성
		return month;
	}

	public void setMonth(int month) {
		if(month>0 && month<=12) {
			this.month = month;
		} else {
			isValid = false;

		}

	}
	

	public int getYear() {
		System.out.println("getYear : " + year);		//확인차 작성
		System.out.println("getYear isValid : " + isValid);		//확인차 작성
		return year;
	}
	
	public void setYear(int year) {
		if (year > 0) {
			this.year = year;
		} else {
			isValid = false;
		}
	}
	
	//public boolean isValid() 메소드로 날짜가 유효한지 확인
	public String isValid() {
		if(isValid) {
			return "유효한 날짜입니다.";
		}else {
			return "유효하지 않은 날짜입니다.";
		}
		
	}
	
	
	
	//MyDate(int, day,int,month, int year)생성자 만들기
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//기본생성자
	public MyDate() {
		
	}


//toString
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + ", isValid=" + isValid + "]";
	}
	
	
	
	
	

}

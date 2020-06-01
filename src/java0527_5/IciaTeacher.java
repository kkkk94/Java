package java0527_5;

public class IciaTeacher extends IciaPerson{
String subject;
int commission;

@Override	//재정의
public void finish() {
	System.out.println("교수님들은 5시 20분에 퇴근한다.");
	
}
}



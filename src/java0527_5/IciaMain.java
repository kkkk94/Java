package java0527_5;

public class IciaMain {

	public static void main(String[] args) {
		IciaInfo info = new IciaInfo();
		
		IciaPerson icia = new IciaPerson();
		IciaStudent student = new IciaStudent();
		IciaTeacher teacher= new IciaTeacher();
		IciaWorker worker= new IciaWorker();								//이거 모두 주석처리해도 값 똑같이 나옴
		
		//참조
		info.finishType(icia);
		info.finishType(student);
		info.finishType(teacher);
		info.finishType(worker);

	}

}



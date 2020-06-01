package java0528_1;

public class AnimalMain {

	public static void main(String[] args) {
		//Animal Dog Cat 객체 생성
		
		//추상메소드는 객체를 생성할 수 없다.
		//Animal animal = new Animal();
		
		System.out.println("첫번째 : 객체생성");
		Dog dog = new Dog();	//강아지 객체생성
		Cat cat = new Cat();	//고양이 객체생성
		dog.breath();
		dog.sound();
		cat.breath();
		cat.sound();
		
		
		System.out.println();
		System.out.println("두번째 : 자동 타입 변환");
		
		Animal animal = null;		
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();	//animal에 Cat을 넣어줌
		animal.sound();
		//animal 객체를 만들어 개와 고양이 넣어준다
		
		System.out.println();
		System.out.println("세번째 : 다형성(유틸클래스)" );
		
		//animal객체생성
		AnimalInfo aninfo = new AnimalInfo();
		aninfo.animalSound(dog); 	//dog는 위의 new dog
		aninfo.animalSound(cat);
		//객체 생성 이후 사용 가능
		//ex ) Dog dog = new dog();
		
		

	}

}

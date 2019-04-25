package h_inherit;

public class Test {

	public static void main(String[] args) {
		// 1.클래스 생성과 메소드 호출 확인
		Umma u = new Umma();
		u.gene();
		u.job();
		//u.study(); 부모클래스는 자식클래스만 가지고 있는 메소드 접근 불가.
		
		Ddal d = new Ddal(); 
		d.gene();
		d.study();
		d.job(); //자식클래스는 부모클래스만 가지고 있는 메소드에 접근 가능
				//그이유는자식 클래스인  Ddal 클래스 객체 생성시, 부모클래스인 Umma 클래스가 메모리에 먼저 생성되기 때문에
				// 자식클래스는 부모클래스의 메모리에 접근이 가능하다.
		
		
		System.out.println();
		// 2. 부모 변수에 자식객체 생성 가능.!!! 중요중요.--->왜 그렇게 쓸까???
		
		//Ddal dd = new Umma();  //엄마 객체 생성 -->  엄마의 메모리만 할당 --> 그런데 딸의 메모리를 참조하고 싶다. 따라서 참조 불가능
		Umma uu = new Ddal(); //딸 객체 생성--> 딸과 엄마 메모리 모두 할당 --> 그중에서 umma 내용만 쓸것. 
		uu.gene(); //자식은 자식이다 --> 변수가 Umma이지만 내용은 자식의 내용이 나온다. 오버라이딩 개념!!
		uu.job(); 
		
		//uu.study();
		
		//**overriding
		//	- 부모자식간의 메소드명이 동일
		//  - 인자동일 / 리턴형 동일
		//	- 접근지정자는 같거나 크거나, 같은 것 권장
		//	* 부모 변수에서 자식의 멤버 호출
		//
		System.out.println();
		//3. 형변환(casting) - 상속관계에서만 가능.
		//		기본적으로 참조형은 형변환이 안됨.
		
		//Umma uuu = new Umma();    // --Umma 메모리만 생성됨.
		//Ddal ddd = (Ddal)uuu; 	// 엄마 메모리만 가지고 있으니까 딸 형식으로 캐스팅이 안됨.
		
		Ddal ddd = new Ddal(); 
		Umma uuu = (Umma)ddd;
		
		ddd.study();
		// uuu.study(); //불가능 // 딸의 자료형을 엄마 자료형으로 캐스팅 가능, 엄마 자료형에는 study가 없으므로 출력 불가능.
		
		
		Umma uuuu = new Ddal(); // 딸의 객체, 엄마 변수 생성 하면 딸의 메모리 모두 확보 
		Ddal dddd=(Ddal)uuuu; // 엄마 변수 uuuu를 딸의 자료형으로 캐스팅이 가능. 그래서 딸만 가지고 잇는 study를 불러올 수 있다.
		
		dddd.study();
		System.out.println();
		
		//4. instanceof 연산자  --> A instanceof B : A는 B의 instance 인지 아닌지 판단하는 연산자.
		Ddal ddddd = new Ddal();
		
		if(d instanceof Ddal) {
			System.out.println("Ddal 객체임");		
		}
		if(d instanceof Umma) {
			System.out.println("Umma 객체임");		
		}
		if(d instanceof Object) { //class를 만들면 class명 뒤에 자동으로 extends Object를 작성함, 모든 java의 클래스는 Object를 상속받음. 
			System.out.println("Object 객체임");		
		}
		
		
		
		
		
	}

}

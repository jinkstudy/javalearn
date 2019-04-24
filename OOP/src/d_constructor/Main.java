package d_constructor;

public class Main {

	public static void main(String[] args) {
		
		Student s2 = new Student("홍길자",100,80,70); //클래스를 불러올때 new를 꼭 써야한다.
		System.out.println("이름:"+s2.getName());
		System.out.println("총점:"+s2.calTotal());
		System.out.println("평균:"+s2.calAverage());
		
		
		//생성자 함수가 하나도 없는 경우
		// Java Compiler가 자동으로 생성자 함수를 생성
		//public Student() {}
		// 
		// 문제를 예방하기 위해 -> default로 기본생성자를 만든다.
		// public Student(){
		
	//}
		System.out.println();
		
		Student s = new Student();	
		
//		s.setName("홍길동");
//		s.setKor(100);
//		s.setEng(88);
//		s.setMath(77);
		
		System.out.println("이름:"+s.getName());
		System.out.println("총점:"+s.calTotal());
		System.out.println("평균:"+s.calAverage());
		
		
	}

}

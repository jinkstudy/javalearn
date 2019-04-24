package b_encapsulation;

public class Main {

	public static void main(String[] args) {

		Student s = new Student(); //클래스를 불러올때 new를 꼭 써야한다.
		
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(88);
		s.setMath(77);
	
		System.out.println("총점:"+s.calTotal());
	
		System.out.println("평균:"+s.calAverage());
		
	}

}

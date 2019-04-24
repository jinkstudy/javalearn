package a_basic;

public class Main {

	public static void main(String[] args) {

		Student s = new Student(); //클래스를 불러올때 new를 꼭 써야한다.
		
		s.name="홍길동";
		s.kor = 100;
		s.eng=88;
		s.math=77;
		System.out.println("총점:"+s.calTotal());
		s.total = 300;
		System.out.println("평균:"+s.calAverage());
		
	}

}

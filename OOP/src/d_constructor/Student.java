package d_constructor;

// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
public class Student {
	
	// 멤버변수 (member field)
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	// 생성자 - 멤버변수 초기화
	// - 반드시 클래스 명과 동일한 이름의 함수.
	// - 리턴형 없음.(void 없음. void 작성 시 일반 함수로 인식)
	// - overloading이 가능 
	
	
	//생성자 함수가 하나도 없는 경우
			// Java Compiler가 자동으로 생성자 함수를 생성
			//public Student() {}
			// 
			// 문제를 예방하기 위해 -> default로 기본생성자를 만든다.
			// public Student(){
			
		//}
	
	public Student(){
		//this : 멤버를 지칭하기 위한 레퍼런스
		//this() : 다른 생성자 함수 호출
		
		this("익명",50,50,50); // this()는 반드시 첫줄에 기술.
		
//		this.name = "익명";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;
		System.out.println("기본생성자 호출");
     }
	 
	 
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.math = math;
		System.out.println("인자 있는 생성자 호출");
		
	}
	
	// 멤버메소드 (member method)
	public int calTotal() {
		total= kor + eng +math;
		return total;
	}
	
	public double calAverage() {
		avg=(double)total/3;
		return avg;
	}
	
	//settet/getter
	
	public void setName(String name) { //여기서 name은 지역변수
		this.name = name; //여기서 왼쪽 name은 멤버변수 오른쪽은 지역변수. this.name에서 this는 본 클래스를 의미한다. 
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	
	

	
	
}

package b_encapsulation;

// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
public class Student {
	
	// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
	/* 캡슐화 = 권한관련부여 
	 * 	1. 멤버변수 -  private ( 다른 클래스에서 접근 허용 안함 )
	 * 	2. 멤버메소드 - public (모든 접근 허용)
	 */
	
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
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

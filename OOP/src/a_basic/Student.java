package a_basic;

// 클래스 = 서로 다른 자료형의 변수들 + 메소드들
/* 캡슐화 = 권한관련부여 
 * 	1. 멤버변수 -  private
 * 	2. 멤버메소드 - public
 */

public class Student {
	String name;
	int kor,eng,math;
	int total;
	double avg;
	
	int calTotal() {
		total= kor + eng +math;
		return total;
	}
	
	double calAverage() {
		avg=(double)total/3;
		return avg;
	}
	
	
}

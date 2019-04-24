package a_datatype;


import java.util.Scanner; //ctrl+shift+o 하면 자동 import 완성. 초기에는 어디에 소속되어 있는지 아는 것이 중요하므로, 사용하지 않는 것이 좋다.

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//학생명을 입력받기.
		
		System.out.print("이름을 입력하세요=>");
		String name = input.next();
				
		System.out.print("국어점수=>");
		int kor = input.nextInt();
		
		
		System.out.print("영어점수=>");
		int eng = input.nextInt();
		
		
		System.out.print("수학점수=>");
		int math = input.nextInt();
	
		
		// 총점을 구해서 출력
		int total = kor + eng + math;
		System.out.println(name+"의 총점:"+total);
		
		// 평균을 구해서 출력
		//double avg = total/3; // 해당 결과는 87.0 , 그 이유는 total과 3이 정수형이기 때문에 결과가 정수로 나온다.
		//따라서 실수로 나오게 하기 위해서는 강제로 total을 double 형으로 형변환하여 계산해야한다.
		
		double avg = (double)total/3;
		System.out.println("평균:"+avg);

	}

}

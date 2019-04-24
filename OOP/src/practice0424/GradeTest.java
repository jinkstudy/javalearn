package practice0424;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		//data 갯수 입력받기.
		System.out.println("data의 갯수를 입력하세요 ");
		int n= input.nextInt();
		
		//입력받은 data 갯수크기의 점수배열 생성.
		int[] jumsu = new int[n];
		
		//data 갯수만큼 점수 입력받기.
		System.out.println(n+"개의 점수를 입력하세요");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i]=input.nextInt();
		}
		
		//입력받은 점수 출력하기.
		System.out.print("점수들 : ");
		for (int i = 0; i < jumsu.length; i++) {
			if (i<n-1) {
				System.out.print(jumsu[i]+",");
			}else System.out.print(jumsu[i]);
		}

		System.out.println();
		
		//GradeExpr 객체 생성 및 method 실행.
		GradeExpr grade=new GradeExpr(jumsu);
		
		grade.getTotal();grade.getAverage();grade.getGoodScore();grade.getBadScore();
		
		// 결과값 출력
		//Class에 toString을 만들어주면 아래와 같이 바로 출력 가능.
		
		System.out.println(grade);
		
		//만약 toString을 만들지 않았다면, 위에 코드 수행 결과 grade의 주소값이 반환되므로, 하기와 같이 print 해줘야 한다.
		
//		System.out.println("총점 : "+grade.getTotal());
//		System.out.println("평균 : "+Math.round(grade.getAverage()*100)/100.0);
//		System.out.println("최고 점수 : "+grade.getGoodScore());
//		System.out.println("최저 점수 : "+grade.getBadScore());
//		
		
	

		



	}

}

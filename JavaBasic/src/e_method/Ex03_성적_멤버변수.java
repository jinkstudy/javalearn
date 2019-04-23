package e_method;

import java.util.Scanner;

public class Ex03_성적_멤버변수 {
	
	static int[] score = new int[3];
	static int[] result= new int[2];
	static int kor,eng,math,sum,avg;

	public static void main(String[] args) {

	    input();
		calc();
		output();
	}

	static void input() {
		//국영수 점수를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		 kor=input.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng=input.nextInt();
		System.out.println("수학점수를 입력하세요");
		 math= input.nextInt();
		score[0] = kor;
		score[1] =eng;
		score[2] = math;
	
	}
	static void calc() {
		//input()에서 입력받은 점수들의 합과 평균을 구하기
		sum=0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg=sum/score.length;
		result[0]=sum;
		result[1]=avg;
		
	}

	static void output() {

		System.out.println("총 합은 "+result[0]+", 평균은 " + result[1] + "입니다.");

	}

}



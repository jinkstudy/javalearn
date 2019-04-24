package e_method;

import java.util.Scanner;

public class Ex03_성적 {


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int []score=input();
		int [] result=calc(score);
		output(result);
	}

	static int[] input() {
		//국영수 점수를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor=input.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng=input.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math= input.nextInt();
		int[]score = {kor,eng,math};
		return score;

	}
	static int[] calc(int[] score) {
		//input()에서 입력받은 점수들의 합과 평균을 구하기
		int sum=0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		int avg=sum/score.length;
		int []result = {sum,avg};
		return result;
	}

	static void output(int[] result) {

		System.out.println("총 합은 "+result[0]+", 평균은 " + result[1] + "입니다.");

	}

}

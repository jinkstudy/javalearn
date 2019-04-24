package Practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Day0418_성적처리 {

	/*
	 * 입력할 학생수를 입력하세요. 4
4명의 국어, 영어, 수학 점수를 받아 결과 출력하기

1째 학생의 성적을 입력 -> 88/77/66
2째 학생의 성적을 입력 -> 50/40/70
3째 학생의 성적을 입력 -> 44/33/22
4째 학생의 성적을 입력 -> 55/50/70

[결과]
1째 학생의 총점 xxx 이고 평균은 ooo 입니다
2째 학생의 총점 xxx 이고 평균은 ooo 입니다
3째 학생의 총점 xxx 이고 평균은 ooo 입니다
4째 학생의 총점 xxx 이고 평균은 ooo 입니다
국어과목  총점 xxx 이고 평균은 ooo 입니다
영어과목  총점 xxx 이고 평균은 ooo 입니다
수학과목  총점 xxx 이고 평균은 ooo 입니다
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요");
		int stu_num= input.nextInt(); //학생 수 입력 받기.

		int [][] score = new int[stu_num][3]; // 2차열 배열로 저장 ex)0번째 학생의 0번째 과목의 점수는 int[0][0]
		int [] total_stu = new int[stu_num] ; // 학생 총점 1차열 배열로 저장
		int [] total_sub = new int[3];// 과목 총점 1차열 배열로 저장
		int [] avg_stu = new int[stu_num] ;// 학생 평균 1차열 배열로 저장
		int [] avg_sub = new int[3];// 과목 평균 1차열 배열로 저장

		for(int i=0; i<stu_num; i++) { 
			System.out.println((i+1)+"째 학생의 성적을 입력 (ex)88/77/66)->");
			String score_string=input.next(); //학생 수 만큼 입력받기, 입력받은 값 저장 

			StringTokenizer st = new StringTokenizer(score_string,"/");//입력받은 값 '/'을 기준으로 분리.
			for(int j=0;j<3;j++) { // 과목 수 만큼 반복.
				score[i][j] = Integer.parseInt(st.nextToken()); //'/'을 기준으로 분리한 값은 string으로 저장되므로, int로 변경하여 배열에 저장.

				total_stu[i]+=score[i][j];  //학생 총점 구해서 1차원 배열에 저장 
				avg_stu[i]=total_stu[i]/3; // 학생 총점 /3 
				total_sub[j]+=score[i][j]; //과목 총점 구해서 1차원 배열에 저장 
				avg_sub[j]=total_sub[j]/stu_num; // 과목 총점/3

			}

		}
		for(int i=0; i<stu_num; i++) { //출력 학생수 만큼 반복.
			System.out.println((i+1)+"번째 학생의 총점은 " +total_stu[i]+", 평균은"+avg_stu[i]+" 입니다");
		}
		String sub_name="";

		for(int i=0; i<3; i++) {  //출력 과목수 만큼 반복.

			switch(i) { //index를 과목명으로 변환

			case 0:sub_name="국어"; break;
			case 1:sub_name="영어"; break;
			case 2:sub_name="수학"; break;

			}
			System.out.println(sub_name+"과목 총점은"+total_sub[i]+", 평균은"+avg_sub[i]+ " 입니다.");

		}
	}
}



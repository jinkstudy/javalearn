package d_array;
/*
 *   *야구 게임*
 *   숫자 세개와 각 자리 까지 완벽하게 맞추면 3Strike로 승리.
 * 
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07_baseball {

	public static void main(String[] args) {

		int baseball[] = new int[3];

		//1. 컴퓨터 랜덤 수 3개 만들기
		for (int i = 0; i < baseball.length; i++) {
			baseball[i]=(int)(Math.random()*10)+1;


			for (int j = 0; j < i; j++) { //중복 발생 방지
				if(baseball[j]==baseball[i]) {
					i--;
				}
			}

			System.out.print(baseball[i]+" ");
		}
		System.out.println();

		//2. 사용자에게 답을 입력 받아서 메모리 할당하기.
		int answer[] = new int[3];
		Scanner input = new Scanner(System.in);

		LABEL: //전체 break.
			for(int n=0; n<10; n++) {
				System.out.println("답이라고 생각하는 숫자 3개를 입력하세요.");
				System.out.println("입력 예시 : 1,3,4 ");
				String anwser_st = input.next();
				StringTokenizer st = new StringTokenizer(anwser_st,",");

				for (int i = 0; i < answer.length; i++) {
					answer[i] = Integer.parseInt(st.nextToken());
					// System.out.print(answer[i] + " "); 확인용.
				}

				//3. baseball 배열과 answer 배열을 각각 비교.
				int strike =0; int ball = 0;
				for (int i = 0; i < baseball.length; i++) {
					for (int j = 0; j < answer.length; j++) {

						if(baseball[i]==answer[j]) {//같은 값이라면
							if(i==j) {
								strike++;// 자리 위치까지 같다면 strike
							}else if(i!=j) {
								ball++;
							}
							// 자리 위치는 다르면 ball++
						}	
					}
				}
				System.out.println(strike + "S"+ ball+"B 입니다");
				//4 strike라면 반복문 종료.
				if(strike == 3) {
					System.out.println("정답입니다.");
					System.out.println();break LABEL;
				}else {
					System.out.println("다시 시도하세요");
					System.out.println();
					if(n==9) System.out.println("10번의 기회를 모두 사용하셨습니다.");
				}
			}
	}
}

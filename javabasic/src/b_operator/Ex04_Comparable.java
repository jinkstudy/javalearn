package b_operator;

/*
 *  비교 연산자 : > < >= <=, == !=
 */

public class Ex04_Comparable {

	public static void main(String[] args) {

		int k=50, e=88, m=99;
		double avg = (double)(k+e+m)/3;  //(double)로 캐스팅 하지 않으면 int형으로만 계산되서 소수 점이 나오지 않는다.
		System.out.println("평균 :" + avg);
		
		String score = "";
		switch((int)(avg/10)) {
		case 10: //평균 100점인 경우와 90점 이상인 경우 둘다 score "A", break를 쓰지 않으면 자동으로 10인 경우 9의 결과를 수행하므로, 동일결과.
		case 9: score="A"; break;
		case 8: score="B"; break;
		case 7: score="C"; break;
		default: score="F"; break;
		}
		
		System.out.println(score);
   }
}

package z_useful;

import java.util.*;

public class CalendarEx01 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance(); // Java에서는 객체를 Instance라는 용어로 표현함.
		//새로 메모리를 할당하는 개념이 아니라, 기존 할당된 것을 가져오는 것이므로 new를 쓸 필요가 없다.
		
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println((c.get(Calendar.MONTH)+1)+"월");//외국은 문자로 표현,그래서 1월을 0으로 인식. ex)4월인경우 3월로 표기되므로 수정해야함.
		System.out.println(c.get(Calendar.DATE)+"일");
		
		// 요일(일요일 = 1, 월요일=2,......
		System.out.println(c.get(Calendar.DAY_OF_WEEK)+"요일");// 숫자로 나온다. 나중에 작업 필요.
		String [] day_of_week= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"}; // 요일로 이루어진 배열을 만들어서.
		System.out.println(day_of_week[c.get(Calendar.DAY_OF_WEEK)-1]);//Calendar class로 구한 (index-1)값에 해당하는 요일을 출력하도록.
	
		
		// 시, 분, 초 출력
		
		System.out.println(c.get(Calendar.HOUR)+"시");
		System.out.println(c.get(Calendar.MINUTE)+"분");
		System.out.println(c.get(Calendar.SECOND)+"초");
		
		// 그외 정보
		System.out.println("그 해의" + c.get(Calendar.DAY_OF_YEAR)+"일입니다"); //그 해의 몇번째 일인지
		System.out.println("그 해의" + c.get(Calendar.WEEK_OF_YEAR)+"주입니다"); //그 해의 몇번째 주인지
		System.out.println("그 달의" + c.get(Calendar.WEEK_OF_MONTH)+"주입니다"); //그 달의 몇번째 주인지
	}

}

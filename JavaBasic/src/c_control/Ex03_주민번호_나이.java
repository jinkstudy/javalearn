package c_control;

import java.util.Calendar;

/*
 *    1 - 정수값 1 (연산가능) 4바이트
 *    '1' - 문자 1 2바이트
 *    "1" - 스트링 1 힙영역
 *  */
public class Ex03_주민번호_나이 {

	public static void main(String[] args) {
		String id = "881212-1234567" ;
		String nai1=id.substring(0,2); // nai1 = "80"
		int nai2 = Integer.parseInt(nai1); // String을 Int로 변환("80"-->80), Integer.parseInt() 사용
		
		int age = 0;
		int nai3 = id.charAt(7);// 주민번호의 7번째 문자를 얻어서 
		
		// Calendar 클래스를 이용하여 년도값을 구해서 년도 지정.
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR)	;	
		
		if(nai3=='1'|nai3=='2') {// 1 이거나 2라면 1900
		// 3 이거나 4라면 2000
			age = year -(1900+nai2)+1;
		}else{
			age = year -(2000+nai2)+1;
		}
		
		System.out.println(age);
		

	}

}

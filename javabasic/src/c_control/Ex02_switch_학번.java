package c_control;

import java.util.Scanner;

public class Ex02_switch_학번 {

	public static void main(String[] args) {
		System.out.println("학번을 입력하세요");
		Scanner input = new Scanner(System.in);
		
		String stu_num = input.next(); // 학번 입력받기
		char dan_num = stu_num.charAt(4); // 단과대 구분하기 위해 학번 5번째 자리수 뽑기 
		String depart_num = stu_num.substring(5, 7); // 학과 구분하기 위해 학번 6-7번째 자리수 뽑기 
		String dan =" "; // dan_num으로 단과대명 구분하여 저장하기 위한 변수 설정 및 초기화.
		String depart= " "; // dapart_num으로 학과명 구분하여 저장하기 위한 변수 설정 및 초기화.
		
		switch(dan_num) {
		case '1' : dan ="공대"; // dan_num가 1인 경우 공대. dan_num이 1이면서 11,12,13,22,33 이어야 하므로 if(dan_num=='1')안에 넣어줘야함.
			switch(depart_num)
			{
			case "11" : depart = "컴퓨터학과"; break;
			case "12" : depart = "소프트웨어학과"; break;
			case "13" : depart = "모바일학과"; break;
			case "22" : depart = "자바학과"; break;
			case "33" : depart = "서버학과"; break;
			 }
			break;
			
	    case '2' : dan ="사회대"; // dan_num가 2인 경우 공대. dan_num이 2이면서 11,12 이어야 하므로 if(dan_num=='2')안에 넣어줘야함.
					
			
			switch(depart_num)
			{
			case "11" : depart = "사회학과"; break;
			case "12" : depart = "경영학과"; break;
			case "13" : depart = "경제학과"; break;
			}
			
	
		}
		
		System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 "+dan+" " +depart+" " +"학생"
				+ "입니다.");
		
		}
		}




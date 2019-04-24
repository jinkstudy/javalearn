package c_control;

import java.util.Scanner;

/*
 * 우리대학의 학번은 총 10자리로 되어 있습니다.
맨 앞의 4자리는 입학년도이고 5번째 문자는 단과대 번호입니다. (charAt() 이용)
     1 : 공대
     2 : 사회대
그 뒤의 2자리는 각 학과번호입니다.
  공과대학인 경우는 (substring() 이용)
     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
     22 : 자바학과         33 : 서버학과
사회대학인 경우는
  11 : 사회학과         12 : 경영학과          13 : 경제학과

       ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
       ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
       ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다 
 */


public class Ex02_if_학번new {

	public static void main(String[] args) {
		
		System.out.println("학번을 입력하세요");
		Scanner input = new Scanner(System.in);
		
		String stu_num = input.next(); // 학번 입력받기
		char dan_num = stu_num.charAt(4); // 단과대 구분하기 위해 학번 5번째 자리수 뽑기 
		String depart_num = stu_num.substring(5, 7); // 학과 구분하기 위해 학번 6-7번째 자리수 뽑기 
		String dan =" "; // dan_num으로 단과대명 구분하여 저장하기 위한 변수 설정 및 초기화.
		String depart= " "; // dapart_num으로 학과명 구분하여 저장하기 위한 변수 설정 및 초기화.
		
		if(dan_num=='1') {
			dan = "공대"; // dan_num가 1인 경우 공대. dan_num이 1이면서 11,12,13,22,33 이어야 하므로 if(dan_num=='1')안에 넣어줘야함.
			if(depart_num.equals("11")) {   
				depart = "컴퓨터학과";
			}else if(depart_num.equals("12")) {
				depart = "소프트웨어학과";
			}else if(depart_num.equals("13")) {
				depart = "모바일학과";
			}else if(depart_num.equals("22")) {
				depart = "자바학과";
			}else if(depart_num.equals("33")) {
				depart = "서버학과";
			}
		}else if(dan_num=='2') { // dan_num가 2인 경우 공대. dan_num이 2이면서 11,12 이어야 하므로 if(dan_num=='2')안에 넣어줘야함.
			dan = "사회대";
			if(depart_num.equals("11")) {
				depart = "사회학과";
			}else if(depart_num.equals("12")) {
				depart = "경영학과";
			}else if(depart_num.equals("13")) {
				depart = "경제학과";
		}
		
		
		// 문구 출력하기.
		System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 "+dan+" " +depart+" " +"학생"
				+ "입니다.");
		
	

	}
	}
	}



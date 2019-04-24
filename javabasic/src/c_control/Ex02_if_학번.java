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

public class Ex02_if_학번 {

	public static void main(String[] args) {
		
		System.out.println("학번을 입력하세요");
		Scanner input = new Scanner(System.in);
		
		String stu_num = input.next();
		//System.out.println(stu_num.charAt(4));
		//System.out.println(stu_num.substring(5, 7));
		
		if(stu_num.charAt(4) == '1') {
			if(stu_num.substring(5, 7).equals("11")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 공대 컴퓨터 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("12")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 공대 소프트웨어 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("13")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 공대 모바일 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("22")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 공대 자바 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("33")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 공대 서버 학과 학생입니다.");
			}
			
		}else if(stu_num.charAt(4) == '2') {
			if(stu_num.substring(5, 7).equals("11")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 사회대 사회 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("12")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 사회대 경영 학과 학생입니다.");
			}else if(stu_num.substring(5, 7).equals("13")) {
				System.out.println(stu_num+"는"+(stu_num.substring(0,4))+"년도에 입학한 사회대 경제학과 학과 학생입니다.");
			}
		}

	}
	}



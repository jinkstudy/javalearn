package c_control;

/*
 *  switch 문 : 분기문
 * 
 *  switch(______)  // ____ : 정수형/문자형/String(1.5버전 이후)
 *  {
 *  	case A : 명령어A; break;
 *  	case B : 명령어B; break;
 *  	case C : 명령어C; break;
 *  	default: 그 외 명령어; break; //맨앞에 둘 경우 break를 무조건 써야하고, 맨 뒤에 쓰는 경우 break;생략가능하나,쓰는것이 좋다.
 *  
 *  } 
 *  
 */

public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		String id = "801212-1234567";
		char chul =id.charAt(8);
		String home = "";
		switch(chul) {
		
		// 하기 코드를 수행하면, 아무런 결과도 나오지 않는다. 왜??? chul은 char 형인데 case 뒤에는 int이기 때문에 해당 case가 없는 것으로 인식.
//		case 0 : home="서울"; break;
//		case 1 : home="인천/부산";break;
//		case 2 : home="경기";break;
//		case 9 : home="제주";break;	
//		default: home="한국인";
		
		case '0' : home="서울"; break;
		case '1' : home="인천/부산";break;
		case '2' : home="경기";break;
		case '9' : home="제주";break;	
		default:home="한국인";  //break있는 경우, 해당 case 감지 후 바로 switch문을 나가고
		                      // break가 없는 경우, 해당 case 감지 후에도 밑에 case를 다 수행한다.

		}
		
		System.out.println("출신지:" + home);

	}

}

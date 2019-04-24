package Practice;

public class Day0417_swich_연습 {

	public static void main(String[] args) {
		
		int i =1, j=0;
		  switch ( i ) {
		      case 2 : j += 6;
		   case 4 : j += 1;
		   default : j += 2; // i=0인 case가 없으므로 default case 명령 수행함. j=2
		   case 0 : j += 4; // break가 없으므로 그 이후 것도 수행함. j=6
		  }
		  System.out.println( j ); //6

	}

}

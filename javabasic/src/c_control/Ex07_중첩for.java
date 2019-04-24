package c_control;

public class Ex07_중첩for {

	public static void main(String[] args) {


		// 화면에 ***** 찍기
		for(int j=0; j<5; j++) {
			for (int i = 5; i>j; i--) {
				System.out.print('*');
			}
			System.out.println();
		}

		//알파벳 A-Z 출력
		/*
A
AB
ABC
ABCD
:
ABCDEFGHIJKLMNOPQRSTUVW
ABCDEFGHIJKLMNOPQRSTUVWX
ABCDEFGHIJKLMNOPQRSTUVWXY
ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 */

		for(int i=0; i<26;i++) {
			for(char c='A'; c<='A'+i ;c++) {//A부터 시작해서 i만큼 증가한 알파벳까지 나오도록.
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println();

		//알파벳 A-Z 출력
		/*
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ABCDEFGHIJKLMNOPQRSTUVWXY
ABCDEFGHIJKLMNOPQRSTUVWX
ABCDEFGHIJKLMNOPQRSTUVW
ABCDEFGHIJKLMNOPQRSTUV
:
ABC
AB
A
		 */		
		for(int i=0; i<26;i++) {
			for(char c='A'; c<='Z'-i ;c++) { 
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println();

		//알파벳 A-Z 출력
		/*
ABCDEFGHIJKLMNOPQRSTUVWXYZ
BCDEFGHIJKLMNOPQRSTUVWXYZ
CDEFGHIJKLMNOPQRSTUVWXYZ
DEFGHIJKLMNOPQRSTUVWXYZ
:
XYZ
YZ
Z
		 */

		for(int i=0; i<26;i++) {
			for(char c=(char)('A'+i); c<='Z' ;c++) { //'A'+i int로 인식되므로 c자료형에 맞게 char형으로 casting 해줘야함.
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println();

		//알파벳 A-Z 출력
		/*
		   Z
		   ZY
		   ZYX
		   :
		   ZYXWVUTSRQPONMLKJIHGFEDC
		   ZYXWVUTSRQPONMLKJIHGFEDCB
		   ZYXWVUTSRQPONMLKJIHGFEDCBA	
		 */

		for(int i=0; i<26;i++) {
			for(char c='Z'; c>='Z'-i ;c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();

		//알파벳 A-Z 출력

		/*
		 * 
ABCDEFGHIJKLMNOPQRSTUVWXYZ
  BCDEFGHIJKLMNOPQRSTUVWXYZ
    CDEFGHIJKLMNOPQRSTUVWXYZ
      DEFGHIJKLMNOPQRSTUVWXYZ
       :

                                         WXYZ
                                            XYZ
                                              YZ
                                                Z


		 */
		for(int i=0; i<26;i++) {
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(char c=(char)('A'+i); c<='Z' ;c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}

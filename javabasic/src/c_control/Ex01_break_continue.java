package c_control;

/*
 *  break - 블럭을 아예 벗어나는 명령
 *  continue - 블럭의 끝으로 가라는 명령
 *  
 */

public class Ex01_break_continue {

	public static void main(String[] args) {
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++){
				
				if(j==1) break ; // Label이 붙어있는 블럭을 통째로 벗어나는.
				System.out.println("<"+i+","+j+">");
			}
			
			System.out.println("데이타");
		}
	System.out.println();
	
		END:  //Label 설정- 중첩반복문에서 통째로 벗어나고 싶을 때.
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++){
				
				if(j==1) break END; // Label이 붙어있는 블럭을 통째로 벗어나는.
				System.out.println("<"+i+","+j+">");
			}
			
			System.out.println("데이타");
		}
	System.out.println();
	
	END:  //Label 설정- 중첩반복문에서 통째로 벗어나고 싶을 때.
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++){
				
				if(j==1) continue END; // Label이 붙어있는 블럭을 통째로 벗어나는.
				System.out.println("<"+i+","+j+">");
			}
			
			System.out.println("데이타");
		}
	System.out.println();
	
	for(int i=0; i<2; i++) {
		for(int j=0; j<3; j++){
			
			if(j==1) continue ; // Label이 붙어있는 블럭을 통째로 벗어나는.
			System.out.println("<"+i+","+j+">");
		}
		
		System.out.println("데이타");
	}
		

	}

}

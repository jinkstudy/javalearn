package a_datatype;

public class Ex03_Declaration {

	public static void main(String[] args) {
		// (1) 변수 선언 -> 값 대입
		int  kor;
		kor = 30;
		
		// (2) 초기화 =  변수 선언 + 값지정(대입)
		int eng = 33;
		
		if(kor == eng) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");	
		}
		
		int temp; //swap 두개의 값 바꾸기. 중간 임시 저장공간이 필요하다.
		temp = kor;
		kor = eng;
		eng = temp;
		System.out.println("국어:" + kor + ",영어:"+ eng);
		System.out.printf("국어:%d,영어 :%d",kor,eng);
		
		
		
	}

}

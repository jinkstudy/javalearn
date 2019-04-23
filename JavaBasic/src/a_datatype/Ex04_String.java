package a_datatype;

public class Ex04_String {

	public static void main(String[] args) {
		//String a;
		//a= new String("홍길동");
		
//		String a = new String("홍길동");
//		String b= new String("홍길동");
		
		// 참조형
		// class 정석과 같이 new를 포함한 상위 소스의 결과는 "다르다"이다. 그이유는 a,b에는 참조주소값을 저장하고 있기 때문이다.
		
		
				
		String a = "홍길동";
		String b = "홍길동";
		
		// 편의를 위해 String의 경우 new를 삭제하고 사용할 수 있도록 했지만, 
		// new를 포함하지 않는 경우, 내용이 같아서 이미 해당 내용이 heap에 저장되어 있는 경우 기존 heap의 참조주소를 반환하여 결과는 "같다"가 나온다.		
		
		if(a==b) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// new를 포함하고 해당 내용이 같은 지를 비교하고 싶다면, 하기와 같이 equals를 사용해야한다.
		
		if(a.equals(b)) {
			System.out.println("이름이 같다");
		}else {
			System.out.println("이름이 다르다");
		}
		
	
	}

}


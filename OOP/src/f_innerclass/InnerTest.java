package f_innerclass;

class Outer{
	static class Inner{
		//class안에 class 또 생성. Outer$Inner.class로 이름 적힘.
		static void najabara() { 
			System.out.println("호출해주세요");
		}
		
	}

}
public class InnerTest {

	public static void main(String[] args) {
		//Outer o = new Outer(); //Inner를 불러오기 위해서는 Outer가 먼저 메모리에 불러와져야한다.
		//Outer.Inner in= o.new Inner(); // Outer의 객체를 통해서 불러와야한다.
		Outer.Inner in = new Outer.Inner(); //Inner class를 static으로 만들어주면 Outer클래스명으로 접근 간ㅇ.
		
		//in.najabara();//Inner의 객체를 타고 호출.
		Outer.Inner.najabara();//najabara()를 static으로 만든 경우, 메소드도 클래스 명으로 접근 가능.

	}

}

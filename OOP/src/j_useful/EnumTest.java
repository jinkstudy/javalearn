package j_useful;

//enum : 상수들의 모음.
enum Size{ //상수지정
	SMALL,
	MEDIUM,
	LARGE
	
}
public class EnumTest {

	public static void main(String[] args) {
		Size size = Size.SMALL; //추후에 화면에서 넘어오는 값
		switch(size) {
		case SMALL : System.out.println("작은거"); break;
		case MEDIUM : System.out.println("중간거"); break;
		case LARGE : System.out.println("큰거"); break;
		}

	}

}

package z_useful;

/*
 *  자바에서 문자열 처리하는 클래스
 *  1. String
 *  2. StringBuffer : 실무에서 더 많이 쓴다.
 *  3. StringBuilder = StringBuffer( 99% 동일 - 1% 다른점 ) -->Sync 안됨.
 */
public class String_StringBuffer {

	public static void main(String[] args) {

		String s = "안녕"; //원래 참조형은 연산안되지만 String은 예외.
		s+="하세요";  // String은 내용변경 시 heap에 계속 새로운 메모리를 할당함.
		             //따라서 변경이 잦은 string 변수의 경우, string을 쓸 경우 메모리 손실이 심하므로 
		          //stringBuffer를 쓰는 것이 좋다.
		
		System.out.println(s);
		
		StringBuffer sb= new StringBuffer("반갑"); // New를 안써도 되는 참조형은 String 뿐이므로, new를 안쓰면 오류.
		// sb+="습니다."; 참조형 이므로 연산 불가.
		sb.append("습니다"); //참조형에 글을 추가 하고자 하면 .append()를 써야함.//StringBuffer는 기존할당된 메모리에 내용을 수정.
		System.out.println(sb);

	}

}

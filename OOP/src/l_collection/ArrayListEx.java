package l_collection;

import java.util.*;

/*
 *  1. List구조
 *  	- 순서를 저장
 *  
 */

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(4); // 동적인 배열
		list.add("코끼리");
		list.add("원숭이");
		list.add("사자");
		list.add("고양이");
		list.add("호랑이");
		list.add("토끼");
		
//		for (int i = 0; i < list.size(); i++) {
//			String str = (String)list.get(i);  //get은 object를 반환하기 때문에 형변환해줘야한다.
//			System.out.println(str);
//			
//		}
		
		for( String str:list ) { // 향상된 for문을 이용하면 자동으로 형변환 해줌. 따라서 향상된 for문 쓰기 위해서는  상세 자료형을 기술 하는 Generic<String>을 꼭 포함해줘야한다
			System.out.println(str);
		}
		
		System.out.println(list); //주소값이 아니라, 배열 원소들이 나온다. 자동으로 overriding 되어있는 toString()수행이 됨.
		
		list.set(2, "dog"); // 2번째 원소를 dog로 바꿔라
		System.out.println(list);
		
		list.remove(4); //4번째 원소를 제거하라
		System.out.println(list);
		
		Collections.sort(list); //sort함수가  static이라서 Collections라는 class명으로 바로 접근가능.
		System.out.println(list);
		
		
	}

}

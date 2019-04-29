package l_collection;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {


		HashSet list = new HashSet();
		list.add("코끼리");
		list.add("원숭이");
		list.add("사자");
		list.add("고양이");
		list.add("호랑이");
		list.add("사자"); 
		
		System.out.println(list);  //HashSet은 순서를 저장하지 않음. 중복된 값은 저장되지 않음. 
		//ex) 로또같이 중복이 허용되지 않고, 순서가 중요하지 않는 경우 사용하면 매우 편리!
		
		
		

	}

}

package l_collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		set.add("사자");
		set.add("호랑이");
		set.add("고양이");
		set.add("강아지");
		set.add("얼룩말");
		set.add("토끼");
		set.add("햄스터");
		set.add("하마");
		set.add("코끼리");
		set.add("기린");
		set.add("뱀");
		set.add("돼지");
		
		System.out.println(set); // 오름차순으로 정렬되어 있음. data구조가 Tree구조인 경우 저장하는 순간 정렬됨.
		System.out.println(set.subSet("사", "호"));
		System.out.println(set.headSet("사"));
		System.out.println(set.tailSet("호"));


	}

}

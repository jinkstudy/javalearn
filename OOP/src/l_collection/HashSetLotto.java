package l_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetLotto {

	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		for (int i = 0; lotto.size()<6; i++) {
			int su = (int)(Math.random()*45)+1;
			lotto.add(su);
		}
		System.out.println(lotto);
		
		ArrayList<Integer> list = new ArrayList<Integer> (lotto);
		Collections.sort(list); //sort는 List형만 인수로 사용 가능하다. 따라서 위와 같이 lotto를 ArrayList로 변환한 후에 매개변수로 넣어줘야한다.
		

	}

}

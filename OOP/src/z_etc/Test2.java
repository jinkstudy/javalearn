package z_etc;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<String> data = method(); //ArrayList는 length개념이 아니라 size개념.
		
		//출력
		for (int i = 0; i < data.size(); i++) {
			String str = (String)data.get(i);   // data.get(i)는 Object 형으로 반환해주기 때문에 형변환을 해야한다. 
												//형변환이 가능한 이유는, 모든 자료형이 object의 자식클래스이기 때문
		}

	}
	static ArrayList<String> method() {
		
		String a = "올라";
		String b = "헬로우";
		String c = "안녕";
		//<String> --> Generics라고 한다. String과 같은 특정 자료형만 ArrayList or 집합에 저장하겠다 라는 뜻// 
		//명확한 자료형을 작성하지 않은 경우--모든 자료형으로 생각함.작성하지 않아도 문제발생하지 않지만 속도상 큰차이가 있으므로 해주는 것이 좋다  
		
		ArrayList<String> list = new ArrayList<String>(3); //ArrayList는 기존 메모리공간을 넘치는 경우, 자동으로 메모리 확보해서 추가 해준다.
		list.add(a);
		list.add(b);
		list.add(c);
		list.add("곤니치와");
		
		return list;
		
	}

}

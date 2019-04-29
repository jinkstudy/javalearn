package l_collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String,String> map = new HashMap<String, String>();
		// map.put("kimjava", "1111");
		map.put("parkjava", "1234");
		map.put("leejava", "1234");
		map.put("kimjava", "9999"); // kimjava 처럼 key가 중복 된 경우, 두개다 저장되는 것이 아니라, 
		//앞에 이미 존재하는 data의  value값이 업데이트 되면서 덮어쓰기된다.

		Scanner input = new Scanner(System.in);

		boolean stop = false;
		while(!stop) {
			System.out.println("아이디와 패스워드 입력");
			System.out.println("아이디 입력 - >");
			String id = input.nextLine();
			System.out.println("패스워드 입력 - >");
			String pw = input.nextLine();   

			//입력 받은 id값이 map의 key에 해당되는가? 
			if(map.containsKey(id)) { //해당하는 id가 map key에 포함되었는지 확인.
				//비밀번호가 맞는지 확인
				if(map.get(id).equals(pw) ) { //map.get(id) 를  하면, id에 해당하는 pw value값이 반환된다.

					System.out.println("로그인 성공");
					stop = true;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					continue;
				}

			}else {
				System.out.println("존재하지 않는 아이디입니다.");
				continue;

			}
		}

	}

}

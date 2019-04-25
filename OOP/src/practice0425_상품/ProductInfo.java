package practice0425_상품;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opt1; // 첫번째 선택 변수
		int opt2; // 두번째 선택 변수
		int i=0; // 상품 갯수 및 id
		char answer;//Y or N
		Product[] p = new Product[5]; //product 갯수만큼 class 배열 만들기. 이문제에서는 최대 5개니까 5만큼 메모리 확보함.
		// 다형성을 위해 부모클래스 변수,자식클래스 객체를 생성한다.


		END: //3을 선택하면 반복문 전체 종료하기 위해.

			do{
				// 첫번재 옵션 선택
				System.out.println("원하는 옵션을 선택하세요.");
				System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3)");
				opt1=input.nextInt(); input.nextLine();
				
				// 옵션이 상품 추가(1)이라면,
				if(opt1==1) {
					
					//옵션2를 선택하고,
					System.out.println("상품 종류를 선택하세요");
					System.out.println("책(1), 음악CD(2), 회화책(3)");
					opt2 = input.nextInt();input.nextLine();
					
					//옵션2 값에 따라 따로 만들어 놓은 input메소드가 수행되고, 그 결과값을  ArrayList형 변수로 저장.
					ArrayList<Object> arr=input(opt2);
					//System.out.println(arr.toString()); //중간확인용
					
					//opt2 책(1), 음악CD(2), 회화책(3)에 따라 해당 클래스 객체가 생성되도록.
					switch(opt2)
					{
					case 1 : 
						//arr의 원소들이 해당 클래스 생성자함수의  인자로 대입되도록 형변환 해준다.
						p[i]= new Book(i,(String)arr.get(0),(String)arr.get(1),(int)arr.get(2),
								(String)arr.get(3),(String)arr.get(4),(int)arr.get(5));  break;
					case 2 :
						p[i]=new CompactDisc(i,(String)arr.get(0),(String)arr.get(1),(int)arr.get(2),
								(String)arr.get(3),(String)arr.get(4)); break;
					case 3 : 
						p[i]= new ConversationBook(i,(String)arr.get(0),(String)arr.get(1),(int)arr.get(2),(String)arr.get(3),
								(String)arr.get(4),(int)arr.get(5),(String)arr.get(6)); break;
					}
					i++; //입력될때마다 i값 증가
					
					//5개까지만 입력이 가능하므로, i=5이면 더이상 추가 할 수 없고, 입력내용 확인 후 종료.
					if(i==5){
						System.out.println("더 이상 추가할 수 없습니다. 입력된 상품들을 확인하세요."); 
						for (int j = 0; j < i; j++) {
							p[j].showInfo();
							System.out.println();
						}
						break;

					}
				}
				//옵션1이 2번 내용 확인이라면, showInfo()를 실행 시켜 모든 내용을 읽어온다.
				else if(opt1==2) {
					for (int j = 0; j < i; j++) {
						p[j].showInfo();
						System.out.println();
					}
					//옵션1이 3번 종료라면, 모든 반복문이 종료되도록 한다.
				}else if(opt1==3){
					System.out.println("프로그램을 끝내겠습니다.");
					break END;
				}
				System.out.println("계속 하시겠습니까?(Y|N)");
				answer = input.nextLine().charAt(0);
			}while(answer=='y'|answer =='Y');
	}

	// 사용자에게 각각의 변수들을 입력받아, ArrayList<Object>형으로 결과 값을 저장 및 반환하는 메소드 생성.
	public static ArrayList<Object> input(int opt2) {
		Scanner input = new Scanner(System.in);
		ArrayList<Object> input_value = new ArrayList<Object>(5);

		// 공통되는 내용은 기본 실행되도록 하고.
		System.out.println("상품설명:");
		input_value.add(input.nextLine());
		System.out.println("생산자:");
		input_value.add(input.nextLine());
		System.out.println("가격:");
		input_value.add(input.nextInt());
		input.nextLine();
		
		//opt2에 따라서 입력 값이 다르므로, 조건문 수행하여 입력받는다.
		if(opt2 == 1) {
			System.out.println("저자:");
			input_value.add( input.nextLine());
			System.out.println("책제목:");
			input_value.add( input.nextLine());
			System.out.println("ISBN:");
			input_value.add( input.nextInt());

		}else if(opt2==2){
			System.out.println("앨범 제목:");
			input_value.add( input.nextLine());
			System.out.println("가수:");
			input_value.add( input.nextLine());

		}

		else if(opt2 == 3) {

			System.out.println("저자:");
			input_value.add(input.nextLine());
			System.out.println("책제목:");
			input_value.add(input.nextLine());
			System.out.println("ISBN:");
			input_value.add(input.nextInt());
			input.nextLine();
			System.out.println("언어:");
			input_value.add(input.nextLine());

		}
		return input_value;


	}
}



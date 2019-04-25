package practice0425_상품;

import java.util.ArrayList;
import java.util.Scanner;

import c_array.Student;

public class ProductInfo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opt1;
		int opt2;
		Product p = null; 

		END:

			for (int i = 0; i < 5; i++) {
				System.out.println("원하는 옵션을 선택하세요.");
				System.out.println("상품 추가(1), 모든 상품 조회(2), 끝내기(3)");
				opt1=input.nextInt(); input.nextLine();
				if(opt1==1) {
					System.out.println("상품 종류를 선택하세요");
					System.out.println("책(1), 음악CD(2), 회화책(3)");
					opt2 = input.nextInt();input.nextLine();

					input(opt2);
					
					switch(opt2)
					{
					case 1 : 

						p = new Book();  break;
					case 2 : p = new CompactDisc(); break;
					case 3 : p = new ConversationBook(); break;
					
					}

		}
//					else if(opt1==2) {
//					p.showInfo();
//				}else if(opt1==3){
//					System.out.println("프로그램을 끝내겠습니다.");
//					break END;
//				}






			}


	}
	public static ArrayList input(int opt2) {
		Scanner input = new Scanner(System.in);
		ArrayList inputvalue = new ArrayList(5);

		System.out.println("상품설명:");
		String id = input.nextLine();
		System.out.println("생산자:");
		String producer = input.nextLine();
		System.out.println("가격:");
		int price = input.nextInt();
		input.nextLine();

		if(opt2 == 1) {
	    	System.out.println("책 제목:");
			String title = input.nextLine();
			System.out.println("저자:");
			String autor = input.nextLine();
			System.out.println("ISBN:");
			int isbn = input.nextInt();
		
		}else if(opt2==2){
			System.out.println("앨범 제목:");
			String title = input.nextLine();
			System.out.println("가수:");
		
		}
		
		else if(opt2 == 3) {
			System.out.println("저자:");
			String autor = input.nextLine();
			System.out.println("ISBN:");
			int isbn = input.nextInt();
			input.nextLine();
			System.out.println("언어:");
			String lang = input.nextLine();
		
		}
	return inputvalue;
		

	}
}



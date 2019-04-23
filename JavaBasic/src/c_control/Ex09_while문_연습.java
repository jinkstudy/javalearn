package c_control;
/*
 * [3,6,9 게임]
 * 1~50까지 숫자 중에서 3,6,9가 포함되면 그 갯수만큼  '짝'출력
 * 3,6,9가 하나도 포함되지 않으면 그 숫자를 출력.
 */

public class Ex09_while문_연습 {

	public static void main(String[] args) {
		
		for(int i=1;i<=50;i++) {
			int mok = i;
			boolean su369 = false; 
			
			while(mok!= 0) {
				int na = mok%10;
				if(na==3 | na==6 | na == 9) {
					System.out.print("짝");
					su369 = true;
				}
				mok/= 10;
			}
			
			if(su369) {
				System.out.println();
			}else {
				System.out.println(i);
			}
		
			
		}

	}

}

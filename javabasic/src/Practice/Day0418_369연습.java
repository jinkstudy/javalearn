package Practice;

/*
 * *  문제가 어려운 것이 아니라 구글입사시험이라는 편견이 있었다.
 * 
 * 문제  : 8의 숫자 세기(구글입사문제)
 * 
 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
 결과 : 4000
 
 */
public class Day0418_369연습 {

	public static void main(String[] args) {
		
		int sum = 0;
	
		for(int i=1;i<=10000;i++) {
			int mok = i;
			            //int count=0; //각 숫자에 포함된 8의 갯수가 궁금하다면 count를 계속 초기화 시켜줘야하므로 for문 안에서 수행되도록 해야한다.
			
			while(mok!= 0) {
				int na = mok%10;
				if(na==8) {
					sum++; //나머지가 8이라면 count를 하나씩 증가
					       //count++  // 해당숫자에서 8이 나올때마다 count를 1 증가시킴.
				}
				
				mok/= 10; //몇자리 수인지 모르므로, 10으로 나눠서 몫으로 재수행 여부를 판단
			}
			
			//System.out.println(count); //각 숫자에 포함된 8의 갯수를 알고싶을 때.
			//sum=sum+count; //기존 sum에 count를 합해서 총합을 구함.
			
			}
		  System.out.println("1-10,000까지 총 8의 갯수는 "+sum+ "개 입니다.");
	}

}

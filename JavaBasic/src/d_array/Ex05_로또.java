package d_array;

public class Ex05_로또 {

	public static void main(String[] args) {


		int[][] lotto = new int[5][6]; //로또 숫자 6개씩 5세트 (5줄 6개)

		for (int j = 0; j < lotto.length; j++) {
			
			for (int i = 0; i < lotto[j].length; i++) { //2차원 배열의 길이 //행의 길이 arr.length, 열의 길이 arr[].length 

				lotto[j][i] = (int) (Math.random()*45)+1; // Math.random 함수는 0~1사이의 실수를 랜덤하게 뽑아주는 함수.

				/*Math.random() 메소드(함수)는, "0.0 이상에서 1.0 미만 (greater than or equal to 0.0 and less than 1.0)"의 

				 * double형 실수 값을 반환합니다. 즉, 0.0 은 나올 수 있지만 1.0 은 나올 수 없습니다.
				 * //따라서 1~45까지의 숫자를 구하고 싶다면 *45를 해주고 int 형으로 형변환을 해줘야 한다.
				 */
					for (int k = 0; k <i; k++) {
					if(lotto[j][k] == lotto[j][i]) {
						i--;    //수의 중복을 피하기 위해서,수가 중복된다면 i를 감소시켜서 재발생 시킨 후 덮어쓰기한다.
					}
					
				}

			}
		}
		//정렬
		for (int k = 0; k < lotto.length; k++) {
			for(int j=lotto[k].length-1;j>0;j--) {
				for (int i = 0; i < j; i++) {

					if(lotto[k][i] > lotto[k][i+1]) {

						int temp = lotto[k][i+1];
						lotto[k][i+1]= lotto[k][i];
						lotto[k][i]=temp;

					}

				}
			}
		}
		 //출력
		
		
	
		
		// - 숫자의 합 106-170사이라면 별표 출력
		for (int j = 0; j < lotto.length; j++) {
			int sum=0;
			for (int i = 0; i < lotto[j].length; i++) {
				
				sum += lotto[j][i];
				System.out.print(lotto[j][i]+"\t"); //tab만큼 띄우고 싶을 때 \t을 해주면 된다.
				
			}
			 // - 숫자의 합 106-170사이라면 별표 출력
		if(sum>106 && sum<170) System.out.print("★");
			System.out.println();
		}
		
		
	}
}

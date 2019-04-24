package d_array;

public class Ex04_버블정렬 {

	public static void main(String[] args) {
		/*
		 * 버블 정렬
		 * 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
		      인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환한다.
		      선택 정렬과 기본 개념이 유사하다.
		 * [선택1] 삽입정렬+ 선택정렬
		 * [선택2] 퀵정렬 + 힙정렬 + 머지정렬
		 */

		int [] arr = {90,15,13,7,35,25};

		for(int j=arr.length-1;j>0;j--) {
			for (int i = 0; i < j; i++) {

				if(arr[i] > arr[i+1]) {

					int temp = arr[i+1];
					arr[i+1]= arr[i];
					arr[i]=temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "/");

		}

	}

}

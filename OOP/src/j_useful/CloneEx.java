package j_useful;

import java.util.Arrays;

public class CloneEx {

	public static void main(String[] args) {
		String[] array= {"안녕", "헬로우", "올라","곤니찌와"};
		//String[] copy = array; // array의 주소를 복사.--> array와 copy가 같은 곳을 가리킨다. 얕은 복사. 즉 변수 두개, 메모리 하나.
		String[] copy=array.clone(); //깊은복사
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copy));
		
		
		copy[1] = "Hello";
		copy[2] = "Hola";
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(copy));
		
		//얕은 복사의 결과  : array의 내용까지 변화됨
		// clone, 깊은 복사의 결과 array의 내용은 변경되지 않고, copy의 내용만 변경된다.
	

	}

}

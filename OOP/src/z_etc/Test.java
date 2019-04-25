package z_etc;

public class Test {

	public static void main(String[] args) {
		
		Object [] data = method();
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
	
	static Object[] method() {
		// method()에 들어있는 변수들을 main에서 수행하고 싶을 때, return으로 값을 반환해줘야한다.
		// 이때, 자료형이 다른 경우, Object배열로 만들어서 반환해줄 수 있다.
		// 왜냐하면, 모든 자료형은 Object를 상속받기 때문에, 부모클래스인 Object로 반환 가능.
	
		String a = "헬로우";
		int b = 100;
		double d = 36.6;
		Object [] data = new Object[3];
		data[0]=a;
		data[1] = new Integer(b);
		data[2] = new Double(d);
		return data;
	}

}

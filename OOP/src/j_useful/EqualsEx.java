package j_useful;

public class EqualsEx {

	// 오버라이딩하지 않으면, 하기 결과는 다른학생이 나온다. 왜냐하면  Equals 함수는 String을 제외한 모든 자료형 은 내용을 비교하는 것이 아니라 주소를 비교하기 때문에.
	public static void main(String[] args) {
		Student a = new Student("012345","홍길동");
		Student b = new Student("012345","홍길동");
		if(a.equals(b)) System.out.println("같은학생");
		else System.out.println("다른학생");
		System.out.println(a.toString());
		System.out.println(b);
	}

}

class Student{
	String hakbun, name;
	Student(){}
	Student(String hakbun, String name){
		this.hakbun = hakbun;
		this.name = name;
	}
	public boolean equals(Object obj) { // 오버라이딩 하기 위해서. Student형이 아닌 Object형으로 받는 이유는, overriding은 인자의 자료형이 같아야 하므로,

		Student other = (Student) obj; // Student의 부모클래스인 obj형으로 받고 자료형 변환 해준다.
		if(hakbun.equals(other.hakbun)) return true;
		else return false;

	}
	
	public String toString() { // 오버라이딩 하기 전에는 주소가 나옴.. 오버라이딩 후 아래 return 값으로 설정해놓은 값이 나옴.
		return "["+hakbun+"]"+name;
	}


 // 따로 함수를 만드는 거나, 오버라이딩하는 거나 결과는 똑같은데 굳이 오버라이딩 하는 이유는??

}



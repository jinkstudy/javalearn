package l_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//ArrayList<Object>list = method();
		
		ArrayList<Student>list = method();;
		System.out.println(list); // list 배열 전체 출력.
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) { 
			Student s = (Student)list.get(i);
			System.out.println(s);
		}
		
		System.out.println();
		
		for(Student str : list) { // 향상된 for문.
			System.out.println(str);
		}
		
		System.out.println();
		// 표준화 출력  ->무슨 구조,자료형인지 알필요 없을때.
		// Enumeration  - > Iterator
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
	static ArrayList<Student> method() {
		Student a = new Student("홍길자",20);
		Student b = new Student("홍길숙",30);
		Student c = new Student("홍길동",40);
		
		//ArrayList<Object> list = new ArrayList<Object>(3);
		ArrayList<Student> list = new ArrayList<Student>(3);
		list.add(a);
		list.add(b);
		list.add(c);
		return list;
	}

}

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " 학생은 " + age + "세입니다.";
	}
}

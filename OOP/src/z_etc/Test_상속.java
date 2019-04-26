package z_etc;
		class Parent {

			int  i = 7;

			public int get() {  return i ; }

		}

		class Child extends Parent {

			int  i = 5 ;

			public int get() {  return i ; }

		}

		public class Test_상속 {
			public static void main ( String [] args ) {

				Parent  p = new Parent ();

				System.out.println("---------------------1---------------------");

				System.out.println( p.i );  // 7

				System.out.println( p.get( ) ); //7

				Child  c = new Child ();

				System.out.println("---------------------2---------------------");

				System.out.println( c.i ); //5

				System.out.println( c.get( ) ); //5

				Parent  p2 = new Child (); // Parent 변수에 Child 객체를 생성한다. 이때 메모리는 Parent와 Child 모두 확보하지만, 변수 접근은 Parent에만 가능하다.  

				System.out.println("---------------------3---------------------");

				System.out.println( p2.i ); //7  Parent 변수이므로 Parent의 i값이 출력된다.

				System.out.println( p2.get( ) ); //5  Parent 변수에 Child 객체를 생성했기때문에 get()함수가  오버로딩 됨. 따라서 child에서 오버로딩되어 child의 i값이 출력된다.
				
				//Child  p3 = new Parent ();  --> child 변수에 Parent 객체를 생성하는 것은 불가. 왜냐하면, Parent객체 생성시 Parent에 대한 메모리만 확보되므로 child 변수 접근 불가.
			}
		}







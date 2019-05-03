package io.bytestream;

/*
	======================================================
	InputStream을 구현한 FileInputStream을 이용한 예
	======================================================
	
	@ int read()
		` 한 바이트를 읽고 이를 0-255사이의 값을 리턴하지만4byte의 int 형으로 리턴
		` 리턴되는 값은 0-255 부호없는 바이트이지만 형변환 과정에서 -128 ~127의 부호 있는 바이트가 된다
		
		
		` 데이타를 읽어들이기 전까지 기다리므로 다른 부분을 실행할 수가 없다
			-> 쓰레드 적용 필요
			
		` 더이상 읽을 바이트가 없으면 -1 리턴
		
		
		
		[ 참고 ]
			int i =  b >= 0 ? b : 256 + b;
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputTestFirst
{
	public static  void main( String args[] ) 
	{

		try {
			FileInputStream fos1 = new FileInputStream("a.txt");
			
//			for( int ch = 'A'; ch <='Z'; ch++)
//			{
//				char a=(char)fos1.read();
//				System.out.println(a);
//			}
//			while(true) {
//				int data = fos1.read(); //int로 반환,, 파일의 끝(EOF)에 -1이라는 신호를 주기 때문에.
//				if(data ==-1) break; //-1이면 파일의 끝이므로 그때 끝내라는 신호.
//				System.out.println((char)data);
//			}
			
			int data = 0;
			while((data = fos1.read()) != -1) {
				System.out.println();
			}
			
			
			fos1.close();
			
		} catch (IOException e) {
			
			System.out.println("파일입력실패:" + e.toString());
		}
		
		
	}	
}

/*
	======================================
		결과 출력
	======================================

	` 숫자만 나오는데, 우선 열개만 읽어서 숫자 자체로 출력하고
	나머지는 읽어서 (char) 형변환 하면 문자로 출력될 것이
*/
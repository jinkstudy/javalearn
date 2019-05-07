package io.others;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		//디렉토리와 파일 모두 File로 관리함.
		File f = new File("src\\io\\others");
		
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		if(f.isFile())
		{
			System.out.println("파일입니다");
		}else if(f.isDirectory()) {
			System.out.println("디렉토리입니다.");
			String [] sub=f.list(); //파일의 list 가져오기.
			for(String m:sub) {
				System.out.println(m);
			}
		}
		
		File f2 = new File("src\\io\\others\\파일.txt");
		f2.delete(); //파일 삭제. //휴지통에 남지 않음!
		

	}

}

package k_format;

import java.text.SimpleDateFormat;
import java.util.Date;

//날짜를 내가 원하는 형식으로 바꾸고 싶을때.
public class DateFormatEx {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"); // 월은 MM대문짜 써야함. mm은 분. 주의!!
		System.out.println(sdf.format(today));

	}

}

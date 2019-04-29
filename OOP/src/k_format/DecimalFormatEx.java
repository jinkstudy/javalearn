package k_format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {

		double [] data = {12345675, 55555555.5555, 2123.111, 3.141592 , 1234.50, 99.999999999};
		
		DecimalFormat df = new DecimalFormat("###,###,###.#################"); 
		//소수점 자리수 넉넉하게 확보해줘야 반올림 혼동이 없음. ex)소수점 3개만 처리하는 경우 99.9999999가 100으로 나옴.
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(df.format(data[i]));
		}

	}

}

package k_format;

import java.text.ChoiceFormat;

public class ChoiceFormatEx {

	public static void main(String[] args) {


		int [] scores = {88,99,81,45,66,87,15,65,100};
		
		double [] limits = {60,70,80,90};
		String [] grades = {"D","C","B","A"};
		
		ChoiceFormat cf = new ChoiceFormat(limits,grades);
		
		for (int k :scores) {
			System.out.println(k + ":" + cf.format(k));		
		}
		
	}

}

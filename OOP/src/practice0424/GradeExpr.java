package practice0424;

public class GradeExpr {

	private int[] jumsu;
	private int sum;

	// 기본생성자 생성
	public GradeExpr() {

	}
	// 생성자 오버로딩
	public GradeExpr(int[] jumsu) {
		this.jumsu=jumsu;

	}
	//총합구하기
	public int getTotal() {
		sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum+=jumsu[i];
		}
		return sum;
		
	}
	//평균구하기
	public double getAverage() {
		
		return (double)sum/jumsu.length;
		
	}
	//최고 점수구하기
	
	public int getGoodScore() {
		int max = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if(max<jumsu[i]) {
				max=jumsu[i];
			}
		}
		return max;
		
	}
	//최저 점수 구하기
	
	public int getBadScore() {
		int min = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if(min>jumsu[i]) {
				min=jumsu[i];
			}
		}
		return min;
		
	}
	//setter
	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	//getter
	public int[] getJumsu() {
		return jumsu;
	}
	public int getSum() {
		return sum;
	}
	
	//객체 print 수행 시, 아래와 같이 나오도록 지정. 
	public String toString() {
		
	String result ="총점 : "+getTotal()+'\n'+"평균 : "+Math.round(getAverage()*100)/100.0
			+'\n'+"최고 점수 : "+getGoodScore()+'\n'+"최저 점수 : "+getBadScore();

		return result;	
	}
}

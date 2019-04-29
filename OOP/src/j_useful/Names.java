package j_useful;

// enum : 상수들의 모음.
// enum을 클래스와 유사하게 사용하는 경우도 있음. 우리나라에서는 잘 사용하지 않음.

public enum Names {
	
	GILDONG("개발자"){
		String salary() {return "추가급여대상";}
	},
	GILJA("디자이너"),
	GILJUN("팀장") ;
	
	String job;
	Names(String job){this.job = job; }
	
	String salary() {return "고정급여";}

}

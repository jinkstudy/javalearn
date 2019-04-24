package e_static2;

class UserC {
	 DBConnect con;
	 
	 public UserC (){
		 con  = DBConnect.getInstance();
	  
	 }
	 
	 public void use(){
	  System.out.println("디비 작업중");
	 }
	}
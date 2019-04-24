package e_static2;

class UserA {
	 DBConnect con;
	 
	 public UserA(){
	  //con = new DBConnect();
		 con  = DBConnect.getInstance();
		 
	  
	 }
	 
	 public void use(){
	  System.out.println("디비 작업중");
	 }
	}

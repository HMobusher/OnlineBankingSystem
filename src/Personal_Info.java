
  public  abstract class Personal_Info {
	  
	  public abstract void Name(String fName, String lName);
	  public abstract void Id(int id);
	  public abstract void DOB(int dob);
	  public abstract void Email(String email);
	  public abstract void PhoneNo(int phonenum);
	    
	long ID;
	String getFName;
	String LName;
	int DOB;                  //MM/DD/YYYY
	String Email;
	int PhoneNo;

	/*
	protected Personal_Info(long id, String first, String last, int birth, String mail, int phone) {
		ID = id;
		FName = first;
		LName = last;
		DOB = birth;
		Email = mail;
		PhoneNo = phone;
	}
	*/
		
}



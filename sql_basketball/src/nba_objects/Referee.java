package nba_objects;

public class Referee {
	
	int refid;
	String firstName;
	String lastName;
	String birthday;
	String hireDate;
	String refLevel;
	
	public Referee(int refid, String firstName, String lastName, String birthday, String hireDate, String refLevel) {
		this.refid=refid;
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthday=birthday;
		this.hireDate=hireDate;
		this.refLevel=refLevel;
	}

	
}

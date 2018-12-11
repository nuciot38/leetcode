package Extend;

public class FatherClass {
	private String user;
	private int id;
	
	public FatherClass(String userName, int idCard) {
		// TODO Auto-generated constructor stub
		user = userName;
		id = idCard;
		System.out.println("this is father class");
	}
	
	public void say() {
		System.out.println("I am "+user+" my id is "+id);
	}
	
	public void sleep() {
		System.out.println(user+" is sleeping.");
	}
	
}

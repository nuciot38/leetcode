package Abstract;

public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		// TODO Auto-generated constructor stub
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of salary");
		System.out.println("Mailing check to "+getName()+" with salary "+salary);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newsalary) {
		if (newsalary >= 0.0) {
			salary = newsalary;
		}
	}
	
	public double computePay() {
		System.out.println("Computing salary pay for "+getName());
		return salary/52;
	}
	
	
}

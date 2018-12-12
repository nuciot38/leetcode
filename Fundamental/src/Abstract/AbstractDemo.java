package Abstract;

public class AbstractDemo {
	public static void main(String[] args) {
		Salary salary = new Salary("Mohd Mohatashim", "Ambehta", 3, 3600.00);
		Employee employee = new Salary("John Adams", "Boston", 2, 2400.00);
		
		System.out.println("Call mailCheck using Salary reference --");
		salary.mailCheck();
		
		System.out.println("\n Call mailCheck using Employee reference --");
		employee.mailCheck();
	}
}

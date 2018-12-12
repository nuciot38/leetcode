package DuoTai;

public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Salary�۵�mailCheck����");
		System.out.println("�ʼ�֧Ʊ����"+getName()+"����Ϊ:"+salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		// TODO Auto-generated method stub
		if (newSalary >= 0.0) {
			salary = newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("���㹤�ʸ�"+getName());
		return salary/52;
	}
}

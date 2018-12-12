package DuoTai;

public class VirtualDemo {
	public static void main(String[] args) {
		Salary salary = new Salary("A", "北京", 3, 3600.00);
		Employee employee = new Salary("B", "上海", 2, 2400.00);
		System.out.println("使用Salary的引用调用mailCheck--");
		salary.mailCheck();
		System.out.println("\n使用Employee的引用调用mailCheck--");
		employee.mailCheck();
	}
}

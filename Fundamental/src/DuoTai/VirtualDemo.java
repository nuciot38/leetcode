package DuoTai;

public class VirtualDemo {
	public static void main(String[] args) {
		Salary salary = new Salary("A", "����", 3, 3600.00);
		Employee employee = new Salary("B", "�Ϻ�", 2, 2400.00);
		System.out.println("ʹ��Salary�����õ���mailCheck--");
		salary.mailCheck();
		System.out.println("\nʹ��Employee�����õ���mailCheck--");
		employee.mailCheck();
	}
}

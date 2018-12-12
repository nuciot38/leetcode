package DuoTai;

public class Test {
	public static void main(String[] args) {
		show(new Cat());
		show(new Dog());
		
		Animal animal = new Cat();
		animal.eat();
		Cat cat = (Cat)animal;
		cat.work();
	}
	
	public static void show(Animal animal) {
		animal.eat();
		if (animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.work();
		}else if (animal instanceof Dog) {
			Dog cDog = (Dog)animal;
			cDog.work();
		}
	}
}

abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	public void work() {
		System.out.println("ץ����");
	}
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("�Թ�ͷ");
	}
	public void work() {
		System.out.println("����");
	}
}
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
		System.out.println("吃鱼");
	}
	public void work() {
		System.out.println("抓老鼠");
	}
	
}

class Dog extends Animal{
	public void eat() {
		System.out.println("吃骨头");
	}
	public void work() {
		System.out.println("看家");
	}
}
package OverRide;

/*
�����б������ȫ�뱻��д��������ͬ��
�������ͱ�����ȫ�뱻��д�����ķ���������ͬ��
����Ȩ�޲��ܱȸ����б���д�ķ����ķ���Ȩ�޸��͡����磺��������һ������������Ϊpublic����ô����������д�÷����Ͳ�������Ϊprotected��
����ĳ�Ա����ֻ�ܱ�����������д��
����Ϊfinal�ķ������ܱ���д��
����Ϊstatic�ķ������ܱ���д�������ܹ����ٴ�������
����͸�����ͬһ�����У���ô���������д�������з�������������Ϊprivate��final�ķ�����
����͸��಻��ͬһ�����У���ô����ֻ�ܹ���д���������Ϊpublic��protected�ķ�final������
��д�ķ����ܹ��׳��κη�ǿ���쳣�����۱���д�ķ����Ƿ��׳��쳣�����ǣ���д�ķ��������׳��µ�ǿ�����쳣�����߱ȱ���д���������ĸ��㷺��ǿ�����쳣����֮����ԡ�
���췽�����ܱ���д��
������ܼ̳�һ��������������д���������
 */

class Animal{
	public void move(){
		System.out.println("��������ƶ�");
	}
	public void say() {
		System.out.println("this is say.");
	}
}
	 
class Dog extends Animal{
   public void move(){
	   System.out.println("�������ܺ���");
   }
   @Override
	public void say() {
		// TODO Auto-generated method stub
		super.say();
		System.out.println("this is dog say");
	}
}
	 
public class TestDog{
	public static void main(String args[]){
		Animal a = new Animal(); // Animal ����
	    Animal b = new Dog(); // Dog ����
	 
	    a.move();// ִ�� Animal ��ķ���
	 
	    b.move();//ִ�� Dog ��ķ���
	    b.say();
	}
}
package org.java.oop;

public class Car1Main {
public static void main(String[] args) {
	Car1.CITV="����";
	//aCar->��ü ��������(������ ��ü�� �ּҰ�)->��ü
	// new ��ü����������
	//Ŭ���� -> ����� ����Ÿ��
	Car1 aCar=new Car1();
	Car1 aCar1 = new Car1();
	Car1 aCar2 = new Car1();
	
	System.out.println(aCar1.equals(aCar2));
	System.out.println(aCar1);
	System.out.println(aCar2);
	
	System.out.println(aCar1.getClass());
	System.out.println(aCar2.getClass());
	
	System.out.println(aCar.CITV);
	
	int i =10;
	
	aCar.instanctMethod1();
	// ��ü�� �⺻ ���� null
	
	aCar.carName="ACar";
	aCar.carCoin=100000;
	aCar.carWidth=150;
	aCar.carYear=2020;
	
	aCar.instanctMethod1();
	aCar.instanctMethod2();
	aCar.instanctMethod3();
	aCar.instanctMethod4();
	//private ���  setter
	aCar.setOption1("�ڵ�");
	aCar.setOption1("�ɼ�2");
	
	//private �ɹ� getter
	//�ż����� return���� ȣ��(call)�� ���� return�ȴ�.
	System.out.println(aCar.getOption1());//
	String option1 = aCar.getOption1();
	System.out.println(option1);

	//bCar
	Car1 bCar = new Car1();
	System.out.println(bCar.CITV);
	
	bCar.carCoin=5000;
	bCar.carName="bCar";
	bCar.carWidth=52;
	bCar.carYear=2222;
	
	bCar.instanctMethod1();
	bCar.instanctMethod2();		
	bCar.instanctMethod3();
	bCar.instanctMethod4();
	
	//cCar
	Car1 cCar = new Car1();
	System.out.println(cCar.CITV);
	
	cCar.carCoin=700;
	cCar.carName="cCar";
	cCar.carWidth=88;
	cCar.carYear=8888;
	
	cCar.instanctMethod1();
	cCar.instanctMethod2();
	cCar.instanctMethod3();
	cCar.instanctMethod4();
			

}
}

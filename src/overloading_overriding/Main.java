package overloading_overriding;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Dog();
		// animal là chó nhưng chỉ có những hành động của animal, ko gọi
		// đc method và thuộc tính riêng của class Dog
		// nếu trong class Dog @Override method của Animal thì 
		// sẽ gọi được method đó từ class Dog
		
		animal.go();
		animal.smile();
		

		int a = 8;
		int t = (++a) 	+ 	(a++)	+ 	(a--)	+ 	(++a)	+ 	(--a);
				// 9  	+	  9		+ 	10		+	10		+	9
				// a=9		a=10		a=9			a=10		a=9
		System.out.println(t);	 
		System.out.println(a);

	}
}

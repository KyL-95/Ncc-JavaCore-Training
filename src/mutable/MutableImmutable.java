package mutable;

public class MutableImmutable {

	public static void main(String[] args) {
		Dorobou a = new Dorobou("Putin");
		System.out.println("Tên của a là " + a.getName());

		Dorobou b = a; // b là 1 Clone của a
		System.out.println("Tên của b là " + b.getName());

		System.out.println("Đổi tên b :");
		b.setName("Obama");
		System.out.println("Tên của b sau khi đổi là " + b.getName());
		System.out.println("Tên của a sau khi b đổi tên là " + a.getName() + "??? WTF sao a bị đổi tên") ;

		int a1 = 1;
		a1 = 2;
		int b1 = a1;
		b1 = 2;

		System.out.println("a1 = " + a1);
		System.out.println("-----String Pool------");

		String s1 = "Hi";
		String s2 = new String("Hi");
		String s3 = "Hi";

		System.out.print("s1 == s2 ? ");
		System.out.println(s1 == s2);
		System.out.print("s1 == s3 ? ");
		System.out.println(s1 == s3);
		System.out.println("-------------");

		System.out.println("S2: " + s2);
		s2.concat("Khanh");
		System.out.println("S2 sau khi concat: " + s2);

		StringBuilder sb1 = new StringBuilder("hiii");
		System.out.println("Sb1 sau khi khởi tạo : " + sb1);
		StringBuilder sb2 = sb1;

		System.out.println("Sb2: " + sb2);
		sb2.append("Khanh");
		System.out.println("Sb2 sau khi append: " + sb2);
		System.out.println("Sb1 sau khi chưa thay đổi gì " + sb1);

		Integer i1 = new Integer(129);
		Integer i2 = new Integer(129);

	}

}

package valuetype_referencetype;

public class Test {

	public static void main(String[] args) {
		String s = "Hi";
		StringBuilder sb = new StringBuilder("Hi");
		Student st = new Student("Kiên");
		int x = 0;

		System.out.println("String s before modify  : " + s);
		modify(s);
		System.out.println("String s after modify  : " + s);
		System.out.println("-------------");

		System.out.println("StringBuilder sb before modify append hii: " + sb);
		modify(sb);
		System.out.println("StringBuilder sb after modify append hii: " + sb);
		System.out.println("-------------");

		System.out.println("Student before modify name->Khánh: " + st);
		modify(st);
		System.out.println("Student after modify name->Khánh: " + st);
		System.out.println("-------------");

		System.out.println("Integer X before modify x->5: " + x);
		modify(x);
		System.out.println("Integer X after modify x->5: " + x);
	}

	static void modify(String s){
		s = "haha";
	}
	static void modify(StringBuilder s) {
		s.append("hii");
	}
	static void modify(Student st) {
		st.setName("Khánh");
	}
	static void modify(int x) {
		x = 5;
	}
}

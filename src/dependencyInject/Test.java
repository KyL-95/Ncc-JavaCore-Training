package dependencyInject;

public class Test {

	public static void main(String[] args) {
		Gun gun = new Gun(1, "Lục Bạc");
		Knife knife = new Knife("Dao nhựa");

		Toy gun2 = new Gun(0, "Súng nước");
		Toy knife2 = new Knife("Katana");
		// Khánh chỉ có mỗi Toy cụ thể là Gun
		Khanh k = new Khanh();
			k.setGun(gun);
		System.out.print("Khánh ám sát Putin bằng " + k.getGun() + " ---> "); gun.kill(gun.getSoDan());
		// Nam có nhiều Toy : Gun, knife ... extends từ Toy
		Nam n = new Nam();
			// Cho nam cầm súng nước đi ám sát Putin
			n.setToy(gun2);
		System.out.print("Nam ám sát Putin bằng " + n.getToy() + " ---> "); gun2.kill();
			// Cho nam cầm katana đi ám sát Putin
			n.setToy(knife2);
		System.out.print("Nam ám sát Putin bằng " + n.getToy() + " ---> ");	knife2.kill();
			// Cho nam cầm dao nhựa đi ám sát Putin
			n.setToy(knife);
		System.out.print("Nam ám sát Putin bằng " + n.getToy() + " ---> ");	knife.kill(knife.getStyle());
		System.out.println("Nam đỉnh :))");

		// Khanh muốn dùng vũ khí khác thì phải viết thêm class và
		// thêm thuộc tính class đó vào cho class Khanh

		// Nam muốn dùng vũ khí khác thì chỉ cần viết class tương ứng extends Toy,
		// mà không cần tác động đến class Toy hay Nam
	}
}

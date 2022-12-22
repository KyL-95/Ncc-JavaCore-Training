package dependencyInject;

public class Gun extends Toy {

	private int soDan;
	
	public Gun() {
		//TODO Auto-generated constructor stub
	}

	public Gun(int soDan, String style) {
		this.soDan = soDan;
		this.setStyle(style) ;
	}

	public int getSoDan() {
		return soDan;
	}

	public void setSoDan(int soDan) {
		this.soDan = soDan;
	}


	@Override
	public String toString() {
		return "Gun " + soDan + " viên đạn," + this.getStyle() ;
	}


	@Override
	public void kill() {
		System.out.println("Đấm chết");
	}

	public void kill(int soDan){

		if(soDan == 0){
			System.out.println("Súng hết đạn bắn qq");
			kill();
		}else {
			System.out.println("Bắn chết");
		}
	}

	@Override
	public void throwss() {

	}
}

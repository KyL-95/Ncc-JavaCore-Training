package dependencyInject;

public class Knife extends Toy {

	public Knife(String style) {
		this.setStyle(style);
	}

	@Override
	public String toString() {
		return "Knife " + this.getStyle() ;
	}

	@Override
	public void kill() {
		System.out.println("Cắt cổ chết");
	}
	public void kill(String style ){
		if(style.equalsIgnoreCase("dao nhựa")){
			System.out.println("Cứng quá dao nhựa ko cắt đc :))");
		}else{
			kill();
		}
	}

	@Override
	public void throwss() {

	}
}

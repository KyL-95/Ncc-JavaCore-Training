package dependencyInject;

public class Nam {
	private Toy toy;

	public Nam() {

	}

	public Nam(Toy toy) {
		this.toy = toy;
	}

	public Toy getToy() {
		return toy;
	}

	public void setToy(Toy toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Nam [toy=" + toy + "]";
	}

}

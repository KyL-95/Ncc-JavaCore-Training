package overloading_overriding;

public class Dog extends Animal {
	
	private int soChan;
	
	
	
    public int getSoChan() {
		return soChan;
	}

	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}
	@Override
	public void go() {
        System.out.println("Chó đi");
    }

    @Override
    public void smile() {
        System.out.println("dog smile");
    }
    
    public void sua () {
    	System.out.println("gau gau");
    }


}

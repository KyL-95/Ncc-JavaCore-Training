package valuetype_referencetype;

public class Student {
	private String name;
	
	public Student() {
		//TODO Auto-generated constructor stub
	}
	
	

	public Student(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}

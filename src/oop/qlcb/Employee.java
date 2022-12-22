package oop.qlcb;

public class Employee extends Staff {
	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public Employee(String hoTen, Byte tuoi, String diaChi, String gioiTinh, String congViec) {
		super(hoTen, tuoi, diaChi, gioiTinh);
		this.congViec = congViec;
		
	}

	@Override
	public String toString() {
		return "Engineer [congViec=" + congViec +","+ super.toString() +  "]";
	}
	
	
	

}

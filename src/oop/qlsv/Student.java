package oop.qlsv;

public class Student {
	private Integer maSv;
	private String hoTen;
	private Integer namSinh;
	private Double diemTB;

	public Student() {

	}

	public Student(Integer maSv) {
		this.maSv = maSv;
	}

	public Student(Integer maSv, String hoTen, Integer namSinh, Double diemTB) {
		this.maSv = maSv;
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}

	public Integer getMaSv() {
		return maSv;
	}

	public void setMaSv(Integer maSv) {
		this.maSv = maSv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getTen() { // Bạch Ngọc Khánh
		String[] hoTenArr = hoTen.split(" "); // {"Bạch", "Ngọc" , "Khánh"}
		String ten = hoTenArr[hoTenArr.length - 1];
		return ten;
	}

	public Integer getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(Integer namSinh) {
		this.namSinh = namSinh;
	}

	public Double getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(Double diemTB) {
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return "Student [maSv=" + maSv + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
	}

}

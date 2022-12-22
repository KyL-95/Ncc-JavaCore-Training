package oop.qlcb;

import java.util.Scanner;

public class Staff {

	private String hoTen;
	private Byte tuoi;
	private String diaChi;
	private String gioiTinh;
	Scanner scanner = new Scanner(System.in);;

	public Staff(String hoTen, Byte tuoi, String diaChi, String gioiTinh) {
		//super();
		this.hoTen = hoTen;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
	}

	public Staff() {

	}
// getter/setter
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Byte getTuoi() {
		return tuoi;
	}

	public void setTuoi(Byte tuoi) {
		this.tuoi = tuoi;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Override
	public String toString() {
		return " hoTen=" + hoTen + ", tuoi=" + tuoi + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh ;
	}

}

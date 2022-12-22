package oop.qlcb;

public class Engineer extends Staff {
	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public Engineer(String hoTen, Byte tuoi, String diaChi, String gioiTinh, String nganhDaoTao) {
		super(hoTen, tuoi, diaChi, gioiTinh);
		this.nganhDaoTao = nganhDaoTao;
		
	}

	@Override
	public String toString() {
		return "Engineer [nganhDaoTao=" + nganhDaoTao + ","+ super.toString() + "]";
	}
	
	
	

}

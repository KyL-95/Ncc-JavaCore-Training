package oop.qlcb;

public class Worker extends Staff {
	private int rank;

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

	public Worker(String hoTen, Byte tuoi, String diaChi, String gioiTinh, int rank) {
		super(hoTen, tuoi, diaChi, gioiTinh);
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Worker [rank=" + rank + "," + super.toString() + "]";
	}

}

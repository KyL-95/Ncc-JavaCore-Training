package oop.qlsv;

import oop.untils.ScannerUntils;

import java.util.Scanner;

public class Test {
	static final StudentList dssv = new StudentList() ;
	static final Scanner sc = new Scanner(System.in);
	public static void menu(){
		System.out.println("1. Thêm mới sinh viên\n" + "2. In danh sách sinh viên\n"
				+ "3. Kiểm tra danh sách sinh viên có rỗng không\n" + "4. Lấy ra số lượng sinh viên\n"
				+ "5. Làm rỗng danh sách sinh viên\n" + "6. Xóa một sinh viên khỏi danh sách theo mã sinh viên\n"
				+ "7. Kiểm tra bằng mã sv xem sinh viên có tồn tại trong danh sách không\n"
				+ "8. Tìm kiếm một sinh viên theo tên\n" + "9. Xuất ra danh sách sinh viên điểm từ cao tới thấp\n"
				+ "0. Thoát khỏi chương trình\n" + "Mời chọn chức năng từ 0 --> 9 ");
	}

	public static void main(String[] args) {
		do {
			menu();
			int luaChon = ScannerUntils.inputInt(sc, ScannerUntils.INT_ERR);
			switch (luaChon) {
			case 1:
				while(true) {
					System.out.println("Nhập vào mã sv");
					int maSv = ScannerUntils.inputInt(sc, ScannerUntils.INT_ERR);
					if (!dssv.checkExists(maSv)) {
						System.out.println("Nhập vào họ tên sv");
						String hoTen = ScannerUntils.inputString(sc, ScannerUntils.STRING_ERR);
						System.out.println("Nhập vào năm sinh sv");
						int namSinh = ScannerUntils.inputInt(sc, ScannerUntils.INT_ERR);
						System.out.println("Nhập vào điểm trung bình sv");
						double diemTB = ScannerUntils.inputDouble(sc, ScannerUntils.DOUBLE_ERR);

						Student addSv = new Student(maSv, hoTen, namSinh, diemTB);
						dssv.themSinhVien(addSv);
						break;
					}
					System.out.println("Mã sv này đã tồn tại, mời nhập mã sv khác!");
				}
				case 2:
				dssv.inDanhSach();
				break;
			case 3:
				dssv.checkEmpty();
				break;
			case 4:
				dssv.laySoLuongSv();
				break;
			case 5:
				dssv.makeEmpty();
				break;
			case 6:
				System.out.println("Nhập mã sinh viên cần xóa : ");
				int maSv1 = ScannerUntils.inputInt(sc, ScannerUntils.INT_ERR);
//				Student st = new Student(maSv1);
				dssv.xoaTheoMaSv(maSv1);
				break;
			case 7:
				System.out.println("Nhập mã sinh viên cần kiểm tra");
				Integer maSvCheck = sc.nextInt();
				System.out.println("Sinh viên đã có trong danh sách : " + dssv.checkExists(maSvCheck));
				break;
			case 8:
				System.out.println("Mời nhập tên sinh viên cần tìm");
				String name = ScannerUntils.inputString(sc, ScannerUntils.STRING_ERR);
				dssv.searchByName(name);
				break;
			case 9:
				dssv.sortByScore();
				break;
			case 0:
				System.out.println("Bye!!");
				return;

			default:
				System.out.println("Nhập sai, mời nhập lại từ 0 --> 9");
				break;
			}

		} while (true);
	}

}

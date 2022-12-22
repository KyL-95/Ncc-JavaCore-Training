package oop.qlsv;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	private List<Student> studentList;
	private final String LINE = "----------------------------";
	public StudentList() {
		this.studentList = new ArrayList<Student>();
	}

	public StudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	// 1 . Thêm sinh viên
	public void themSinhVien(Student sv) {
		this.studentList.add(sv);
		System.out.println("Thêm thành công sinh viên ");
		System.out.println(LINE);
	}

	// 2. In danh sách sinh viên
	public void inDanhSach() {
		if (studentList.size() == 0) {
			System.out.println("Danh sách trống!");
			System.out.println(LINE);
			return;
		}
		System.out.println("Danh sách sinh viên hiện tại : ");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println(LINE);
	}

	// 3. Kiếm tra danh sách sinh viên có rỗng không
	public void checkEmpty() {
		if (this.studentList.isEmpty()) {
			System.out.println("Danh sách sinh viên trống");
			System.out.println(LINE);
		} else {
			inDanhSach();

		}
	}

	// 4. Lấy ra số lượng sinh viên
	public void laySoLuongSv() {
		System.out.println("Số lượng sinh viên là: " + this.studentList.size());
		System.out.println(LINE);
	}

	// 5. Làm rỗng danh sách sinh viên
	public void makeEmpty() {
		this.studentList.removeAll(studentList);
		System.out.println("Làm rỗng thành công!");
		inDanhSach();
	}

	/**
	 * 6. Xóa theo mã sv -- lỗi ConcurrentModificationException khi remove trong
	 * List --> ko xóa trong vòng foreach, xóa bên ngoài vòng foreach
	 */

	public void xoaTheoMaSv(Integer st) {
		List<Student> stRemoveList = new ArrayList<>(); // tạo 1 danh sách sv cần xóa

		for (Student student : studentList) { // duyệt danh sách sinh viên
			if (student.getMaSv().equals(st)) { // nếu mã sv nhập vào = mã sv nào đó trong danh sách thì
				stRemoveList.add(student); // thêm sv đó vào danh sách sv cần xóa
			}
		}
		if (stRemoveList.size() == 0) { // Nếu danh sách cần xóa = 0 thì :
			System.out.println("Sinh viên này không tồn tại");
			System.out.println(LINE);
		} else { // Danh sách cần xóa khác 0 thì :
			studentList.removeAll(stRemoveList); // danh sách ban đầu - danh sách cần xóa --> kết quả
			System.out.println("Xóa thành công sinh viên có msv = " + st);
			System.out.println(LINE);

		}
	}

	// 7. Kiểm tra sinh viên có trong danh sách không dựa vào mã sv,nếu có thì in ra

	public boolean checkExists(Integer maSvCheck) {
		for (Student student : studentList) {
			if (student.getMaSv().equals(maSvCheck)) {
				return true;
			}
		}
		return false;
	}
	// 8.Tìm kiếm một sinh viên theo tên -- Lỗi
	public void searchByName(String name) {
		for (Student student : studentList) {
			if (student.getTen().equals(name)) {
				System.out.println("Sinh viên cần tìm :");
				System.out.println(student);
				System.out.println(LINE);
			} else
				System.out.println("Không có sinh viên này trong danh sách!");
				System.out.println(LINE);
		}
	}

	// 9.Xuất ra danh sách sinh viên điểm từ cao tới thấp
	public void sortByScore() {
//		Collections.sort(studentList, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return -(o1.getDiemTB().compareTo(o2.getDiemTB()));
//			}
//		});
		studentList.sort(( s1,s2) -> (int) (s1.getDiemTB()- s2.getDiemTB()));
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println(LINE);
	}
}

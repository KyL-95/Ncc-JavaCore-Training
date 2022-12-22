package oop.qlcb;

import oop.untils.ScannerUntils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuQLCB extends Staff {

	// Tạo method menu
	Scanner scanner;
	private final List<Staff> staffList;

	public MenuQLCB() {
		super();
		staffList = new ArrayList<Staff>();
		scanner = new Scanner(System.in);
	}
	public void generalMenu(){
		System.out.println("======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
		System.out.println("=== 1. Thêm mới cán bộ. ===");
		System.out.println("=== 2. Tìm kiếm theo họ tên. ===");
		System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===");
		System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===");
		System.out.println("=== 5. Thoát khỏi chương trình. ===");
		System.out.println("======================================================================");
	}
	public void addStaffMenu(){
		System.out.println("======================================================================");
		System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");
		System.out.println("=== 1. Thêm mới công nhân. ===");
		System.out.println("=== 2. Thêm mới kỹ sư. ===");
		System.out.println("=== 3. Thêm mới nhân viên. ===");
		System.out.println("=== 4. Quay lại menu chính. ===");
		System.out.println("======================================================================");
	}

	public void menu() {
		while (true) {
			generalMenu();
			int menuChoose = ScannerUntils.inputInt(scanner,ScannerUntils.INT_ERR);
			switch (menuChoose) {
			case 1:
				addStaff();
				break;
			case 2:
				findByName();
				break;
			case 3:
				getListStaff();
				break;
			case 4:
				deleteByName();
				break;
			case 5:
				System.out.println("Bye!");
				return;
			default:
				System.out.println("Hãy Lựa chọn đúng số trên menu. Kiểm tra và nhập lại!");
				break;
			}
		}
	}

	// Tạo method addCanBo

	private void addStaff() {
		addStaffMenu();
		int choose1 = ScannerUntils.inputInt(scanner,ScannerUntils.INT_ERR);
		Staff cb ;
		switch (choose1) {

		case 1:
			newWorker();
			break;
		case 2:
			newEngineer();
			break;
		case 3:
			newEmployee();
			break;
		case 4:
			break;
		default:
			System.out.println("Hãy Lựa chọn đúng số trên. Kiểm tra và nhập lại!");
			break;

		}
		getListStaff();
	}

	// Tạo method findByName
	private void findByName() {
		System.out.println("Nhập vào tên muốn tìm kiếm: ");
		String findName = scanner.next();
//		staffList.stream().filter(canBo -> canBo.getHoTen().equals(findName)).count()
		for (Staff staff : staffList) {
			if (staff.getHoTen().equals(findName)) {
				System.out.println(staff);
			}
		}
	}

	// Tạo method printDanhSachCanBo
	private void getListStaff() {
		if (staffList.isEmpty()) {
			System.out.println("Danh sách tên cán bộ trống.");

		} else {
			System.out.println("==================Danh sách tên cán bộ================");
			for (Staff staff : staffList) {
				System.out.println(staff);
			}
		}
	}

	// Tạo method deleteByName
	private void deleteByName() {
		System.out.println("Nhập tên cần xóa thông tin: ");
		String delName = ScannerUntils.inputString(scanner,ScannerUntils.STRING_ERR);
		staffList.removeIf(staff -> staff.getHoTen().equals(delName));
		System.out.println("Xóa thành công cán bộ!");
		getListStaff();
	}

	public Staff newStaff(){
		Staff staff;
		String genderName1 ;
		System.out.println("Nhập vào tên : ");
		String staffName = ScannerUntils.inputString(scanner, ScannerUntils.STRING_ERR);
		System.out.println("Nhập vào tuổi : ");
		byte staffAge = ScannerUntils.inputByte(scanner,ScannerUntils.BYTE_ERR);
		System.out.println("Nhập vào địa chỉ : ");
		String staffAddress = ScannerUntils.inputString(scanner, ScannerUntils.STRING_ERR);
		OuterWhile:
		while(true) {
		System.out.println("Chọn giới tính : 1.Nam, 2.Nữ, 3.Khác ");
		int staffGender = ScannerUntils.inputInt(scanner,ScannerUntils.INT_ERR);
			switch (staffGender) {
				case 1:
					genderName1 = Gender.GENDER_MALE.getGender();
					break OuterWhile;
				case 2:
					genderName1 = Gender.GENDER_FEMALE.getGender();
					break OuterWhile;
				case 3:
					genderName1 = Gender.GENDER_UNKNOWN.getGender();
					break OuterWhile;
				default:
					System.out.println("Chỉ được nhập các số từ 1-3");
			}
		}
		 staff = new Staff(staffName,staffAge,staffAddress,genderName1);
		return staff;
	}
	public void newWorker(){
		Staff cb  = newStaff();
		System.out.println("Nhập vào bậc Worker: ");
		int rankWorker = ScannerUntils.inputInt(scanner,ScannerUntils.INT_ERR);
//			scanner.nextLine();
		Worker wk = new Worker(cb.getHoTen(),cb.getTuoi(),cb.getDiaChi(),cb.getGioiTinh(),rankWorker);
		staffList.add(wk);
		System.out.println("Bạn đã thêm thông tin thành công\n");
	}
	public void newEngineer(){
		Staff cb  = newStaff();
		System.out.println("Nhập vào chuyên ngành Engineer: ");
		String majorEngineer = ScannerUntils.inputString(scanner, ScannerUntils.STRING_ERR);
		Engineer en = new Engineer(cb.getHoTen(),cb.getTuoi(),cb.getDiaChi(),cb.getGioiTinh(),majorEngineer);
		staffList.add(en);
		System.out.println("Bạn đã thêm thông tin thành công\n");
	}
	public void newEmployee(){
		Staff cb = newStaff();
		System.out.println("Nhập vào công việc Employee: ");
		String workEmployee = ScannerUntils.inputString(scanner, ScannerUntils.STRING_ERR);
		Employee em = new Employee(cb.getHoTen(),cb.getTuoi(),cb.getDiaChi(),cb.getGioiTinh(),workEmployee);
		staffList.add(em);
		System.out.println("Bạn đã thêm thông tin thành công\n");
	}
}


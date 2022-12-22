package finalstatic.interfaceexample;

import finalstatic.interfaceexample.HinhChuNhat;
import finalstatic.interfaceexample.HinhTron;
import finalstatic.interfaceexample.HinhVuong;

public class Test {
    public static void main(String[] args) {
        HinhTron t1 = new HinhTron(2.5);

        HinhChuNhat cn1 = new HinhChuNhat(4,5);

        HinhVuong v1 = new HinhVuong(5);

        HinhChuNhat cn2 = new HinhVuong(7);

        System.out.println("Diện tích hình tròn 1 là : " +t1.tinhDienTich());
        System.out.println("Diện tích hình chữ nhật 1 là : " +cn1.tinhDienTich());
        System.out.println("Diện tích hình chữ nhật 2 là : " +cn2.tinhDienTich());
        System.out.println("Diện tích hình vuông 1 là : " +v1.tinhDienTich());

    }
}

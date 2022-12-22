package finalstatic.interfaceexample;

public class HinhVuong extends HinhChuNhat implements TinhDienTich {
    private final double a;
    public HinhVuong(double a) {
        super(a,a);
        this.a = a;
    }

}

package finalstatic.interfaceexample;

public  class HinhChuNhat implements TinhDienTich {
    private final double a;
    private final double b;

    public HinhChuNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double tinhDienTich() {
        return a * b;
    }
}

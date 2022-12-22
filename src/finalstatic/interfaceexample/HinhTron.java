package finalstatic.interfaceexample;

public final class HinhTron implements TinhDienTich { // cannot extend this class
    private static final double PI = 3.14;
    private double r;

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public Double tinhDienTich() {
        return PI * r * r;
    }


}

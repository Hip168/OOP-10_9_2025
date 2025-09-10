package bai_tap_java;
public class HinhChuNhat {
    private double dai;
    private double rong;

    public HinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double chuVi() {
        return 2 * (dai + rong);
    }

    public double dienTich() {
        return dai * rong;
    }

    public void hienThi() {
        System.out.println("Chiều dài: " + dai + ", Chiều rộng: " + rong +
                ", Chu vi: " + chuVi() + ", Diện tích: " + dienTich());
    }

    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(5, 3);
        HinhChuNhat h2 = new HinhChuNhat(10, 4);
        HinhChuNhat h3 = new HinhChuNhat(7.5, 2.5);

        h1.hienThi();
        h2.hienThi();
        h3.hienThi();
    }
}
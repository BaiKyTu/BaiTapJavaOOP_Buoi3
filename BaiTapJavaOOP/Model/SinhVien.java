package BaiTapJavaOOP.Model;

import java.util.Scanner;

public class SinhVien extends ThongTinCoBan{
    private String mssv;
    private double Toan;
    private double Ly;
    private double Hoa;
    private double DiemTB;

    public void Nhap(Scanner sc){
        System.out.println("Nhập thông tin sv ");
        System.out.println("Nhập tên sv: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập mã sv: ");
        mssv = sc.nextLine();
        System.out.println("Nhập điểm Toán: ");
        Toan = sc.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        Ly = sc.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        Hoa = sc.nextDouble();
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        Toan = toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double ly) {
        Ly = ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        Hoa = hoa;
    }

    public double getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(double diemTB) {
        DiemTB = diemTB;
    }

    public double TinhDiemTB(double Toan, double Ly, double Hoa){
        return (Toan+Ly+Hoa)/3;
    }

    public void XepLoai(double DiemTB){
        if (9<= DiemTB && DiemTB <= 10){
            System.out.println("Giỏi");
        }
        else if (8<= DiemTB && DiemTB<9){
            System.out.println("Khá");
        }
        else if (7<=DiemTB && DiemTB<8){
            System.out.println("Tiên tiến");
        }
        else if (5<=DiemTB && DiemTB<7){
            System.out.println("Trung bình");
        }
        else{
            System.out.println("Yếu");
        }
    }
}

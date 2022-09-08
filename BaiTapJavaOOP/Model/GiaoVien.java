package BaiTapJavaOOP.Model;

import java.util.Scanner;

public class GiaoVien extends ThongTinCoBan{
    private String maGV;
    private String boMon;


    public void Nhap(Scanner sc){
        System.out.println();
        System.out.println("Nhập thông tin giáo viên ");
        System.out.println("Nhập tên GV: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập mã GV: ");
        maGV = sc.nextLine();
        System.out.println("Nhập bộ môn giảng dạy: ");
        boMon = sc.nextLine();
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public GiaoVien() {

    }
    public GiaoVien(String hoTen, int tuoi, String gioiTinh){
        super(hoTen, tuoi, gioiTinh); //ThongTinCoBan()
        //super: kích hoạt hàm khởi tạo của class cha
    }


    public void TienLuong(){

    }
}

package BaiTapJavaOOP.Model;


import java.util.Scanner;

public class HieuTruong extends ThongTinCoBan {
    private String maGV;
    private short nhiemKy;

    public void Nhap(Scanner sc){
        System.out.println();
        System.out.println("Nhập thông tin hiệu trưởng ");
        System.out.println("Nhập tên HT: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập mã GV: ");
        maGV = sc.nextLine();
        System.out.println("Nhập nhiệm kỳ: ");
        nhiemKy = sc.nextByte();
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public short getNhiemKy() {
        return nhiemKy;
    }

    public void setNhiemKy(short nhiemKy) {
        this.nhiemKy = nhiemKy;
    }

    public void TraLuong(double tienLuong, String maGV){

    }
}
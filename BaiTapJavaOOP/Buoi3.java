package BaiTapJavaOOP;

import BaiTapJavaOOP.Model.GiaoVien;
import BaiTapJavaOOP.Model.HieuTruong;
import BaiTapJavaOOP.Model.SinhVien;

import java.awt.*;
import java.util.Scanner;

public class Buoi3 {
    public static void main(String[] args) {
        SinhVien();
        GiaoVien();
        HieuTruong();
    }

    public static void SinhVien(){
        SinhVien sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        sv.Nhap(new Scanner(System.in));
        double DiemTB = sv.TinhDiemTB(sv.getToan(), sv.getLy(), sv.getHoa());
        System.out.println("Tên SV: "+sv.getHoTen());
        System.out.println("Mã sv: "+sv.getMssv());
        System.out.println("Điểm TB: "+DiemTB);
        System.out.print("Xếp loại: ");
        sv.XepLoai(DiemTB);
    }

    public static void GiaoVien(){
        GiaoVien gv = new GiaoVien();
        Scanner sc = new Scanner(System.in);
        gv.Nhap(new Scanner(System.in));
        System.out.println("Tên GV: "+gv.getHoTen());
        System.out.println("Mã GV: "+gv.getMaGV());
        System.out.println("Bộ môn: "+gv.getBoMon());
    }

    public static void HieuTruong(){
        HieuTruong ht = new HieuTruong();
        Scanner sc = new Scanner(System.in);
        ht.Nhap(new Scanner(System.in));
        System.out.println("Tên HT: "+ht.getHoTen());
        System.out.println("Mã GV: "+ht.getMaGV());
        System.out.println("Nhiệm kỳ: "+ht.getNhiemKy()+" năm");
    }
}

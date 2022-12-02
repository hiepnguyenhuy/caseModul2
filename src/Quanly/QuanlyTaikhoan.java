package Quanly;

import Luudulieu.DocvaghiDulieu;
import Model.Sinhvien;
import Model.Taikhoan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlyTaikhoan {
    DocvaghiDulieu<Taikhoan> docvaghiTaikhoan = new DocvaghiDulieu<>();

    ArrayList<Taikhoan> tks = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public static Taikhoan taikhoan;

    {
        tks = docvaghiTaikhoan.docDulieu("Taikhoan.txt");
        if (tks.size() == 0) {
            tks.add(new Taikhoan("admin", "admin", "admin"));
        }
//        QuanlySinhvien.sinhviens = docvaghiSV.docDulieu("Sinhvien.txt");
    }

    public void show() {
        for (Taikhoan tk : tks) {
            System.out.println(tk.toString());
        }
    }

    public boolean kTraQuyen(Taikhoan taikhoan) {

        if (taikhoan.getPhanQuyen().equals("admin")) {
            System.out.println(taikhoan.toString()+"2");
            return true;
        }
        return false;
    }

    public boolean dangnhap(String tenDangnhap, String matKhau) {

        for (Taikhoan taikhoan : tks) {
            if (taikhoan.getTenDangnhap().equals(tenDangnhap) && taikhoan.getMatKhau().equals(matKhau)) {
                QuanlyTaikhoan.taikhoan = taikhoan;
                System.out.println(QuanlyTaikhoan.taikhoan.toString()+"1");
                return true;
            }
        }
        return false;
    }

//    public Sinhvien ktradangnhap(String ten, String matKhau) {
//        for (Taikhoan taikhoan : tks) {
//            if (taikhoan.getTenDangnhap().equals(ten) && taikhoan.getMatKhau().equals(matKhau)) {
//                Taikhoan taikhoandangnhap = taikhoan;
//                if (taikhoandangnhap instanceof Sinhvien) {
//                    Sinhvien sinhvien = (Sinhvien) taikhoandangnhap;
//                    return sinhvien;
//                }
//                return null;
//            }
//        }
//        return null;
//    }


    public static Sinhvien traveSVdangDN() {
        DocvaghiDulieu<Sinhvien> docvaghiSV = new DocvaghiDulieu<>();
        QuanlySinhvien.sinhviens = docvaghiSV.docDulieu("Sinhvien.txt");
        Sinhvien svTrave = new Sinhvien();
        for (int i = 0; i < QuanlySinhvien.sinhviens.size(); i++) {
            if (QuanlyTaikhoan.taikhoan.getTenDangnhap().equals(QuanlySinhvien.sinhviens.get(i).getTenDangnhap())) {
                System.out.println(QuanlySinhvien.sinhviens.toString());
                System.out.println(QuanlySinhvien.sinhviens.get(i).toString() +"3");
                svTrave = (Sinhvien) QuanlySinhvien.sinhviens.get(i);
            }
        }
        return svTrave;
    }


    public void dangky(String tenDangnhap, String matKhau) {
        tks.add(new Taikhoan(tenDangnhap, matKhau, "sinhvien"));
        docvaghiTaikhoan.ghiDulieu((ArrayList<Taikhoan>) tks, "Taikhoan.txt");
    }

    public void suaMatkhau() {
        String tenDangnhap = null;
        while (true) {
            System.out.println("Nhập tên đăng nhập");
            tenDangnhap = scanner.nextLine();
            if (!ktraTendangnhap(tenDangnhap)) {
                System.out.println("Nhập vào mật khẩu mới");
                String mkMoi = scanner.nextLine();


                if (taikhoan.getTenDangnhap().equals(tenDangnhap)) {
                    taikhoan.setMatKhau(mkMoi);
                    docvaghiTaikhoan.ghiDulieu((ArrayList<Taikhoan>) tks, "Taikhoan.txt");
                }

            } else {
                System.out.println("Không có tài khoản này");
            }
        }

    }

    public boolean ktraTendangnhap(String tenDangnhap) {
        for (Taikhoan taikhoan : tks) {
            if (taikhoan.getTenDangnhap().equals(tenDangnhap)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(QuanlySinhvien.sinhviens.toString());
    }
}

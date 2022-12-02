package Hienthi;

import Quanly.QuanlyTaikhoan;

import java.util.Scanner;

public class HienthiDangnhap {
    static QuanlyTaikhoan qltk = new QuanlyTaikhoan();
    Scanner sc = new Scanner(System.in);

    public int MenuDangnhap() {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        return Integer.parseInt(sc.nextLine());
    }
    public String nhapTen() {
        System.out.println("Nhập vào tên đăng nhập");
        return sc.nextLine();
    }
    public String nhapMatkhau() {
        System.out.println("Nhập vào mật khẩu");
        return sc.nextLine();
    }


    public static void main(String[] args) {
        qltk.show();
    }
}

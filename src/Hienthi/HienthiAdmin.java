package Hienthi;

import Model.Monhoc;
import Model.Sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class HienthiAdmin {
   static Scanner sc = new Scanner(System.in);
    public int menuAdmin() {
        System.out.println("Danh Mục Quản Lý :");
        System.out.println("1.Quản lý sinh viên");
        System.out.println("2.Quản lý môn học");
        System.out.println("3.Đăng xuất");
        return  Integer.parseInt(sc.nextLine());
    }
    public int menuQLSinhvien() {
        System.out.println("Phần Quản Lý Sinh Viên");
        System.out.println("1.Sửa thông tin sinh viên");
        System.out.println("2.Tìm sinh viên");
        System.out.println("3.Hiển thị danh sách sinh viên");
        System.out.println("4.Xóa sinh viên");
        System.out.println("5.Đăng xuất");
        return  Integer.parseInt(sc.nextLine());
    }
    public int menuQLMonhoc() {
        System.out.println("Phần Quản Lý Môn học");
        System.out.println("1.Thêm môn học");
        System.out.println("2.Sửa môn học");
        System.out.println("3.Hiển thị danh sách môn học");
        System.out.println("4.Xóa môn học");
        System.out.println("5.Đăng xuất");
        return  Integer.parseInt(sc.nextLine());
    }
    public int nhapID() {
        System.out.println("Nhập vào ID");
        return Integer.parseInt(sc.nextLine());
    }
    public String nhapTen() {
        System.out.println("Nhập vào tên");
        return sc.nextLine();
    }

    public Monhoc taoMonhoc() {
        System.out.println("Nhập tên môn học");
        String tenMonhoc = sc.nextLine();
        System.out.println("Nhập số tín chỉ");
        int soTinchi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập ngày bắt đầu");
        String ngayBatdau = sc.nextLine();
        System.out.println("Giá tiền");
        double giaTien = Double.parseDouble(sc.nextLine());
        return new Monhoc(tenMonhoc, soTinchi, ngayBatdau, giaTien);

    }
    public static Sinhvien taoSV() {
        System.out.println("Nhập vào tên sinh viên");
        String tenSV = sc.nextLine();
        System.out.println("Nhập vào tuổi sinh viên");
        int tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào lớp học ");
        String lop = sc.nextLine();
        return new Sinhvien(tenSV,tuoi,lop);
    }

}

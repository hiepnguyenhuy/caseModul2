package Hienthi;

import Model.Monhoc;
import Model.Sinhvien;

import java.util.Scanner;

public class HienthiSinhvien {
Scanner sc = new Scanner(System.in);
public int menuSinhvien() {
    System.out.println("Bạn Muốn Gì?");
    System.out.println("1. Đăng ký môn học");
    System.out.println("2. Thêm môn học");
    System.out.println("3. Xóa môn học ");
    System.out.println("4. Xem môn học đã chọn");
    System.out.println("5. Xem thời khóa biểu");
    System.out.println("6. Xem học phí");
    System.out.println("7. Đăng xuất");
    return Integer.parseInt(sc.nextLine());
}
public String tenMh() {
    System.out.println("Nhập vào tên môn học");
    return sc.nextLine();
}
//public Sinhvien taoSvDaChonMh(Monhoc monhoc) {
//
//return new Sinhvien(HienthiAdmin.taoSV().getTen(), HienthiAdmin.taoSV().getTuoi(), HienthiAdmin.taoSV().getLop(),monhoc );
//}
}

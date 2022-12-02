package Dieukhien;

import Hienthi.HienthiDangnhap;
import Model.Sinhvien;
import Model.Taikhoan;
import Quanly.QuanlySinhvien;
import Quanly.QuanlyTaikhoan;

public class DieukhienDangnhap {
    public static void menuDangnhap() {
        HienthiDangnhap hienthiDN = new HienthiDangnhap();
        QuanlyTaikhoan qltk = new QuanlyTaikhoan();
        QuanlySinhvien qlsv = new QuanlySinhvien();

        while (true) {
            int choice = hienthiDN.MenuDangnhap();
            switch (choice) {
                case 1:

                   if (qltk.dangnhap(hienthiDN.nhapTen(), hienthiDN.nhapMatkhau())) {
                    if (qltk.kTraQuyen(QuanlyTaikhoan.taikhoan)) {
                        System.out.println(QuanlyTaikhoan.taikhoan.toString()+"4");
                        DieukhienAdmin.menuQuanlyAdmin();

                    } else {
//                        Sinhvien sinhvien=qltk.ktradangnhap(hienthiDN.nhapTen(), hienthiDN.nhapMatkhau());
                        DieukhienSinhvien.menuSinhvien();

                    } } else {
                       break;
                   }
                    break;

                case 2:
                    qltk.dangky(hienthiDN.nhapTen(), hienthiDN.nhapMatkhau());
                    qlsv.themSinhvien();
                    break;

                default:
                    return;
            }
        }
    }

    public static void main(String[] args) {
        DieukhienDangnhap.menuDangnhap();
    }
}

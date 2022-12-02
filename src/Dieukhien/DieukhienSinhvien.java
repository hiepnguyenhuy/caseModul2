package Dieukhien;

import Hienthi.HienthiDangnhap;
import Hienthi.HienthiSinhvien;
import Quanly.QuanlySVMonhoc;
import Quanly.QuanlyTaikhoan;

public class DieukhienSinhvien {
    public static void menuSinhvien() {
        QuanlyTaikhoan qltk = new QuanlyTaikhoan();
        HienthiSinhvien hienthiSV = new HienthiSinhvien();
        QuanlySVMonhoc qlchonmh = new QuanlySVMonhoc();
        HienthiDangnhap htdn = new HienthiDangnhap();
        while (true) {
            int choice = hienthiSV.menuSinhvien();
            switch (choice) {
                case 1:
//                    if (qlchonmh.timMh(hienthiSV.tenMh()) != -1) {
                    qlchonmh.dangkyMh(hienthiSV.tenMh());
//                    }
                    break;
                case 2:
                    qlchonmh.themMH(hienthiSV.tenMh());
                    break;
                case 3:
                    qlchonmh.xoaDangky(hienthiSV.tenMh());
                    break;
                case 4:
                    qlchonmh.show();
                    break;
                case 5:
//                    qlchonmh.xemHocphi();
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

        }
    }

    public static void main(String[] args) {

        menuSinhvien();
    }
}

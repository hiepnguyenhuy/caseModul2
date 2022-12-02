package Dieukhien;

import Hienthi.HienthiAdmin;
import Quanly.QuanlyMonhoc;
import Quanly.QuanlySinhvien;

public class DieukhienAdmin {
    public static void menuQuanlyAdmin() {
        HienthiAdmin hienthi = new HienthiAdmin();
        QuanlySinhvien qlsv = new QuanlySinhvien();

        QuanlyMonhoc qlmh = new QuanlyMonhoc();
        while (true) {
            int choice = hienthi.menuAdmin();
            switch (choice) {
                case 1:
                    int luachonQLSV = hienthi.menuQLSinhvien();
                    switch (luachonQLSV) {
                        case 1:
                            qlsv.suaThongtin(hienthi.nhapTen(), hienthi.nhapID());
                            break;
                        case 2:
                            qlsv.timSv(hienthi.nhapTen());
                            break;
                        case 3:
                            qlsv.show();
                            break;
                        case 4:
                            qlsv.xoaSinhvien(hienthi.nhapTen(), hienthi.nhapID());
                            break;
                        case 5:
                            qlsv.themSinhvien();
                            break;
                        case 6:
                            return;
                    }
                    break;
                case 2:
                    int luachonQLMH = hienthi.menuQLMonhoc();
                    switch (luachonQLMH) {
                        case 1:
                            qlmh.themMonhoc(hienthi.taoMonhoc());
                            break;
                        case 2:
                            qlmh.suaMonhoc(hienthi.nhapTen(), hienthi.taoMonhoc());
                            break;
                        case 3:
                            System.out.println("đã vào đây");
                            qlmh.show();

                            break;
                        case 4:
                            qlmh.xoaMonhoc(hienthi.nhapTen());
                        case 5:
                            return;
                    }
                    break;
            }


        }
    }

    public static void main(String[] args) {
        DieukhienAdmin.menuQuanlyAdmin();
    }


}

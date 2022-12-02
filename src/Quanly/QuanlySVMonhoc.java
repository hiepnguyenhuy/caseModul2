package Quanly;

import Dieukhien.DieukhienDangnhap;
import Luudulieu.DocvaghiDulieu;
import Model.Monhoc;
import Model.Sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlySVMonhoc {
DieukhienDangnhap dkdn = new DieukhienDangnhap();
QuanlyTaikhoan qltk = new QuanlyTaikhoan();
    DocvaghiDulieu<Sinhvien> docvaghiMhdachon = new DocvaghiDulieu<>();

    DocvaghiDulieu<Monhoc> docvaghiMh = new DocvaghiDulieu<>();


    {

        QuanlySinhvien.sinhviens = docvaghiMhdachon.docDulieu("Sinhvien.txt");
        QuanlyMonhoc.monhocs = docvaghiMh.docDulieu("Monhoc.txt");

    }

    public void show() {

        System.out.println(QuanlyTaikhoan.traveSVdangDN().hienthimonhoc());
    }


    public int timMh(String tenMh) {
        for (int i = 0; i < QuanlyMonhoc.monhocs.size(); i++) {
            if (QuanlyMonhoc.monhocs.get(i).getTenMonhoc().equals(tenMh)) {
                return i;
            }
        }
        return -1;
    }

    public Monhoc tralaitenMh(String tenMh) {

        Monhoc tralaiMH = new Monhoc();
        for (int i = 0; i < QuanlyMonhoc.monhocs.size(); i++) {
            if (QuanlyMonhoc.monhocs.get(i).getTenMonhoc().equals(tenMh)) {
                tralaiMH = QuanlyMonhoc.monhocs.get(i);
            }
        }
        return tralaiMH;
    }

    public void dangkyMh(String tenMh) {

//        sinhvien.dangkyMh(tralaitenMh(tenMh));
        QuanlyTaikhoan.traveSVdangDN().dangkyMh(tralaitenMh(tenMh));

//        docvaghiMh.ghiDulieu(QuanlyTaikhoan.traveSVdangDN().getDachon(), "Mhdachon.txt");
    }

    public void xoaDangky(String tenMh) {
//        QuanlyTaikhoan.traveSVdangDN().getDachon().remove(tralaitenMh(tenMh));
//        docvaghiMhdachon.ghiDulieu(QuanlySinhvien.sinhviens, "Mhdachon.txt");
    }

    public void themMH(String tenMh) {
//        QuanlyTaikhoan.traveSVdangDN().getDachon().add(tralaitenMh(tenMh));
//        docvaghiMhdachon.ghiDulieu(QuanlySinhvien.sinhviens, "Mhdachon.txt");
    }

//    public void xemThoikhoabieu() {
//        for (Monhoc tkb :
//                QuanlyTaikhoan.traveSVdangDN().getDachon()) {
//            System.out.println(tkb.getNgayBatdau());
//        }
//    }

//    public void xemHocphi() {
//        for (Monhoc tkb :
//                QuanlyTaikhoan.traveSVdangDN().getDachon()) {
//            System.out.println(tkb.getGiaTien());
//        }
//    }


    public static void main(String[] args) {
        QuanlySVMonhoc quanlySVMonhoc = new QuanlySVMonhoc();
        System.out.println(quanlySVMonhoc.tralaitenMh("Vật lý").toString());
//        for (Sinhvien sv:
//             QuanlySinhvien.sinhviens) {
//            System.out.println(sv.toString());
//        }
        System.out.println(QuanlySinhvien.sinhviens.toString());
    }

}

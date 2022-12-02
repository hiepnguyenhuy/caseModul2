package Quanly;

import Luudulieu.DocvaghiDulieu;
import Model.Monhoc;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlyMonhoc {

    DocvaghiDulieu<Monhoc> docvaghiMonhoc = new DocvaghiDulieu<>();
   static ArrayList<Monhoc> monhocs = new ArrayList<>();

    {
        monhocs = docvaghiMonhoc.docDulieu("Monhoc.txt");
    }

    public void themMonhoc(Monhoc monhoc) {
        monhocs.add(monhoc);
        docvaghiMonhoc.ghiDulieu(monhocs, "Monhoc.txt");
    }

    public void show() {
        System.out.println("đã vào đây");
        for (Monhoc mh: monhocs) {
            System.out.println(mh.toString());
        }
    }

    public int timMonhoc(String tenMh) {
        for (int i = 0; i < monhocs.size(); i++) {
            if (monhocs.get(i).getTenMonhoc().equals(tenMh)) {
                return i;
            }
        }
        return -1;
    }

    public void suaMonhoc(String tenMh, Monhoc monhoc) {
        int index = timMonhoc(tenMh);
        if (index != -1) {
            monhocs.set(index, monhoc);
        }
        docvaghiMonhoc.ghiDulieu(monhocs,"Monhoc.txt");
    }

    public void xoaMonhoc(String tenMh) {
        int index = timMonhoc(tenMh);
        if (index != -1) {
            monhocs.remove(index);
        }
        docvaghiMonhoc.ghiDulieu(monhocs, "Monhoc.txt");

    }

}

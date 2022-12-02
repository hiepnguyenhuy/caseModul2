package Quanly;

import Luudulieu.DocvaghiDulieu;
import Model.Sinhvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanlySinhvien {
    DocvaghiDulieu<Sinhvien> docvaghiSV = new DocvaghiDulieu<>();
   static ArrayList<Sinhvien> sinhviens = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    {
        sinhviens = docvaghiSV.docDulieu("Sinhvien.txt");
    }

    public void themSinhvien() {
        Sinhvien sinhvien = new Sinhvien();
        sinhvien.thongtin();
        sinhviens.add(sinhvien);
        docvaghiSV.ghiDulieu((ArrayList<Sinhvien>) sinhviens, "Sinhvien.txt");
    }

    public void show() {
        for (Sinhvien sv : sinhviens) {
            System.out.println(sv.toString());
        }
    }

    public ArrayList<Sinhvien> ktraTenSV(String ten) {
        ArrayList<Sinhvien> list = new ArrayList<>();
        for (int i = 0; i < sinhviens.size(); i++) {

            if (sinhviens.get(i).getTen().equals(ten)) {
                list.add(sinhviens.get(i));
            }
        }

        return list;
    }

    public int timID(int ID) {
        for (int i = 0; i < sinhviens.size(); i++) {
            if (sinhviens.get(i).getID() == ID) {
                return i;
            }
        }
        return -1;
    }

    public void timSv(String ten) {
        System.out.println(ktraTenSV(ten).toString());
    }

    public void suaThongtin(String ten, int ID) {
        System.out.println(ktraTenSV(ten).toString());
        int index = timID(ID);
        if (index != -1) {
            sinhviens.get(index).thongtin();
        } else {
            System.out.println("Nhập sai ID");
        }
        docvaghiSV.ghiDulieu((ArrayList<Sinhvien>) sinhviens, "Sinhvien.txt");
    }

    public void xoaSinhvien(String ten, int ID) {
        System.out.println(ktraTenSV(ten).toString());
        int index = timID(ID);
        if (index != -1) {
            sinhviens.remove(index);
        } else {
            System.out.println("Nhập sai ID");
        }
        docvaghiSV.ghiDulieu((ArrayList<Sinhvien>) sinhviens, "Sinhvien.txt");
    }


    public static void main(String[] args) {
        QuanlySinhvien sinhvien = new QuanlySinhvien();
        sinhvien.themSinhvien();
        sinhvien.show();
    }

}

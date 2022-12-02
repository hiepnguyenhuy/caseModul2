package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sinhvien extends Taikhoan implements Serializable {
    private static int id = 0;
    private int ID;
    private String ten;
    private int tuoi;
    private String lop;
    private ArrayList<Monhoc> dachon = new ArrayList<>();

    public Sinhvien() {
        this.ID = id;
        id++;
    }

    public Sinhvien(int ID, String ten, int tuoi, String lop) {
        this.ID = ID;
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public Sinhvien(String ten, int tuoi, String lop, ArrayList<Monhoc> dachon) {
    }

    public void thongtin() {

        Scanner sc = new Scanner(System.in);
        if (ID<=0){
            this.ID = Sinhvien.id;
            Sinhvien.id++;
        }
        System.out.println("Nhập vào họ và tên");
        String ten = sc.nextLine();
        this.ten = ten;
        System.out.println("Nhập vào tuổi");
        int tuoi = Integer.parseInt(sc.nextLine());
        this.tuoi = tuoi;
        System.out.println("Nhập vào lớp");
        String lop = sc.nextLine();
        this.lop = lop;
    }


    public Sinhvien(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public Sinhvien(int ID, String ten, int tuoi, String lop, ArrayList<Monhoc> dachon) {

        this.ID = ID;
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
        this.dachon = dachon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Monhoc> getDachon() {
        return dachon;
    }

    public void setDachon(ArrayList<Monhoc> dachon) {
        this.dachon = dachon;
    }

    public  void dangkyMh(Monhoc monhoc) {
        this.dachon.add(monhoc);
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "ID=" + ID +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", lop='" + lop + '\'' +
                '}';
    }
    public String hienthimonhoc() {
        return "Sinhvien{" +
                "ID=" + ID +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", lop='" + lop + '\'' +
                ", dachon" + dachon.toString() +"\'"+
                '}';
    }


}

package Model;

import java.io.Serializable;

public class Monhoc implements Serializable {
    private String tenMonhoc;
    private int soTinchi;
    private String ngayBatdau;
    private double giaTien;

    public Monhoc() {
    }



    public Monhoc(String tenMonhoc, int soTinchi, String ngayBatdau, double giaTien) {
        this.tenMonhoc = tenMonhoc;
        this.soTinchi = soTinchi;
        this.ngayBatdau = ngayBatdau;
        this.giaTien = giaTien;
    }



    public String getTenMonhoc() {
        return tenMonhoc;
    }

    public void setTenMonhoc(String tenMonhoc) {
        this.tenMonhoc = tenMonhoc;
    }

    public int getSoTinchi() {
        return soTinchi;
    }

    public void setSoTinchi(int soTinchi) {
        this.soTinchi = soTinchi;
    }

    public String getNgayBatdau() {
        return ngayBatdau;
    }

    public void setNgayBatdau(String ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Monhoc{" +
                "tenMonhoc='" + tenMonhoc + '\'' +
                ", soTinchi='" + soTinchi + '\'' +
                ", ngayBatdau='" + ngayBatdau + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }


}

package Model;

import java.io.Serializable;

public class Taikhoan implements Serializable {
    private String tenDangnhap;
    private String matKhau;
    private String phanQuyen;

    public Taikhoan() {
    }

    public Taikhoan(String tenDangnhap, String matKhau, String phanQuyen) {
        this.tenDangnhap = tenDangnhap;
        this.matKhau = matKhau;
        this.phanQuyen = phanQuyen;
    }

    public String getTenDangnhap() {
        return tenDangnhap;
    }

    public void setTenDangnhap(String tenDangnhap) {
        this.tenDangnhap = tenDangnhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(String phanQuyen) {
        this.phanQuyen = phanQuyen;
    }

    @Override
    public String toString() {
        return "Taikhoan{" +
                "tenDangnhap='" + tenDangnhap + '\'' +
                ", matKhau='" + matKhau + '\'' +

                '}';
    }
}

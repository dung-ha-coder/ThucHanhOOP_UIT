/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HoaDon extends SanPham {

    private int soLuongBan;
    private float giaBan;

    public HoaDon() {
        super();
    }

    public HoaDon(int soLuongBan, int giaBan) {
        super();
        this.soLuongBan = soLuongBan;
        this.giaBan = giaBan;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public float tinhThanhTien() {

        return this.soLuongBan * this.giaBan;
    }

    @Override
    public float tinhThue() {
        return (float) (0.1 * tinhThanhTien());

    }

    @Override
    public float tinhLai() {
        return (float) ((this.giaBan - giaThanh) * soLuongBan);

    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap so luong san pham da ban: ");
        this.soLuongBan = new Scanner(System.in).nextInt();

        System.out.println("Nhap gia ban san pham: ");
        this.giaBan = new Scanner(System.in).nextFloat();

    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("So luong san pham da ban: " + this.soLuongBan);
        System.out.println("Gia ban: " + this.giaBan);
        System.out.println("Thanh tien: " + this.tinhThanhTien());
        System.out.println("Tien thue: " + this.tinhThue());
        System.out.println("Tien lai: " + this.tinhLai());
    }

}

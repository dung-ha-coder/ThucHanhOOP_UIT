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
public abstract class SanPham {

    protected String tenSanPham;
    protected int namSanXuat;
    protected float giaThanh;

    public SanPham() {
    }

    public SanPham(String tenSanPham, int namSanXuat, float giaThanh) {
        this.tenSanPham = tenSanPham;
        this.namSanXuat = namSanXuat;
        this.giaThanh = giaThanh;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void nhapThongTin() {
        System.out.println("Nhap ten san pham: ");
        this.tenSanPham = new Scanner(System.in).nextLine();

        System.out.println("Nhap nam san xuat: ");
        this.namSanXuat = new Scanner(System.in).nextInt();

        System.out.println("Nhap gia thanh san pham: ");
        this.giaThanh = new Scanner(System.in).nextInt();

    }

    public void xuatThongTin() {
        System.out.println("Ten san pham: " + this.tenSanPham);
        System.out.println("Nam san xuat: " + this.namSanXuat);
        System.out.println("Gia thanh san pham: " + this.giaThanh);
    }
    
    public abstract float tinhThanhTien();
    public abstract  float tinhThue();
    public abstract float tinhLai();
}

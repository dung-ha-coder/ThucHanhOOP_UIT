package oop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<SanPham> listHoaDon = new ArrayList<SanPham>();

        // cau 1
        System.out.println("Nhap so luong hoa don: ");
        int soLuongHoaDon;
        soLuongHoaDon = new Scanner(System.in).nextInt();
        System.out.println("============NHAP THONG TIN======================");
        for (int i = 0; i < soLuongHoaDon; i++) {
            System.out.println("Nhap hoa don thu: " + (i + 1));
            SanPham sp = new HoaDon();
            sp.nhapThongTin();
            listHoaDon.add(sp);
        }

        // cau 2
        System.out.println("==============XUAT THONG TIN====================");

        for (int i = 0; i < listHoaDon.size(); i++) {
            System.out.println("Xuat thong tin san pham thu: " + (i + 1));
            listHoaDon.get(i).xuatThongTin();
            System.out.println("---------------------------------");
        }

        // cau 3
        // sap xep
        Collections.sort(listHoaDon, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                if (sp1.tinhLai() > sp2.tinhLai()) {
                    return -1;
                }else if(sp1.tinhLai() < sp2.tinhLai()){
                    return 1;
                }
                else{
                    return 0;
                }
            
            }
            
        });

        System.out.println("==========SAU KHI SAP XEP=======================");
        for (SanPham sanPham : listHoaDon) {
            sanPham.xuatThongTin();
            System.out.println("----------------");
        }
        // cau 4
        float tongTien = 0f;
        for (int i = 0; i < listHoaDon.size(); i++) {
            tongTien = tongTien + (float) listHoaDon.get(i).tinhThanhTien();
        }
        System.out.println("Tong tien cac hoa don ban san pham la: " + tongTien);
        // cau 5
        float max = (float) listHoaDon.get(0).tinhThue();
        int id = 0;
        for (int i = 1; i < listHoaDon.size(); i++) {
            if (max < listHoaDon.get(i).tinhThue()) {
                id = i;

            }
        }
        System.out.println("==========SAN PHAM CO TIEN THUE CAO NHAT LA==============");
        listHoaDon.get(id).xuatThongTin();

    }

}

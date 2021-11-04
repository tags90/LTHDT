package com.nhannc2008110306.kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;

public class DanhSachQuanLy {
    HocVien hv = new HocVien("Noah","Boston", 7, 9);
    NhanVien nv = new NhanVien("Ben", "London", 1600);
    KhachHang kh = new KhachHang("Newt","New York","Google", 1500);
    List<DanhSachQuanLy> listNguoi = new ArrayList<DanhSachQuanLy>();
    public void themNguoi(){        
        listNguoi.add(hv);
        listNguoi.add(nv);
        listNguoi.add(kh);
    }
    public void inDanhSach(){
        for (DanhSachQuanLy ng : listNguoi){
            ng.toString();
        }
    }
}

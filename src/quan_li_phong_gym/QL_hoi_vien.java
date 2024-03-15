/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

import java.util.ArrayList;

/**
 *
 * Anh Hợp đẹp 
 */
public class QL_hoi_vien {
    private ArrayList<Hoi_vien> dsHoi_vien;

    // Khoi tao
    public QL_hoi_vien(ArrayList<Hoi_vien> dsHoi_vien) {
        this.dsHoi_vien = dsHoi_vien;
    }

    public ArrayList<Hoi_vien> getDsHoi_vien() {
        return dsHoi_vien;
    }

    public void setDsHoi_vien(ArrayList<Hoi_vien> dsHoi_vien) {
        this.dsHoi_vien = dsHoi_vien;
    }
    //Them hoi vien vao ds
   public void Themhoivien(Hoi_vien hv){
   this.dsHoi_vien.add(hv);
   }
   // Xoa hoi vien khoi ds
   public void Xoahoivien(Hoi_vien hv){
   this.dsHoi_vien.remove(hv);}
   // Thay doi thang tin cua hoi vien
    public void ThaydoithongtinHV(Hoi_vien hv){
     this.dsHoi_vien.add(hv);
     this.dsHoi_vien.remove(hv);
    }
}

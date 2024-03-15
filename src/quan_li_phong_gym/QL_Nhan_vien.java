/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QL_Nhan_vien {
     private ArrayList<Nhan_vien> dsNhan_vien;

    // Khoi tao
    public QL_Nhan_vien(ArrayList<Nhan_vien> dsNhan_vien) {
        this.dsNhan_vien = dsNhan_vien;
    }

    public ArrayList<Nhan_vien> getDsNhan_vien() {
        return dsNhan_vien;
    }

    public void setDsNhan_vien(ArrayList<Nhan_vien> dsNhan_vien) {
        this.dsNhan_vien = dsNhan_vien;
    }

   
    //Them hoi vien vao ds
   public void Themhoivien(Nhan_vien nv){
   this.dsNhan_vien.add(nv);
   }
   // Xoa hoi vien khoi ds
   public void Xoahoivien(Nhan_vien nv){
   this.dsNhan_vien.remove(nv);}
   // Thay doi thang tin cua hoi vien
    public void ThaydoithongtinHV(Nhan_vien nv){
     this.dsNhan_vien.add(nv);
     this.dsNhan_vien.remove(nv);
}
}

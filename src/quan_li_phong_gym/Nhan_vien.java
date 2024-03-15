/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

/**
 *
 * @author Admin
 */
public class Nhan_vien extends Con_nguoi{

    private String Manv ;

    public Nhan_vien(String Manv, String Ten, String Cccd, String Sdt, String Gioitinh) {
        super(Ten, Cccd, Sdt, Gioitinh);
        this.Manv = Manv;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }
    
    
}

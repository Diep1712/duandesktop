/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

/**
 *
 * @author Admin
 */
public class Hoi_vien extends Con_nguoi{
boolean ThuePT;
private String Mahv ;

    public Hoi_vien( String Ten, String Cccd, String Sdt,boolean ThuePT, String Gioitinh,String Mahv) {
        super(Ten, Cccd, Sdt, Gioitinh);
        this.ThuePT = ThuePT;
        this.Mahv = Mahv;
    }

    public String getMahv() {
        return Mahv;
    }

    public void setMahv(String Mahv) {
        this.Mahv = Mahv;
    }

    

 

    public boolean isThuePT() {
        return ThuePT;
    }

    public void setThuePT(boolean ThuePT) {
        this.ThuePT = ThuePT;
    }
    

  
    
    
}

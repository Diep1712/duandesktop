/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

/**
 *
 * @author Admin
 */
public class Huan_Luyen_vien extends Con_nguoi{
    private String Kinhnghiem,Mahlv ;
    public Huan_Luyen_vien(String Ten,String kinhnghiem , String Cccd, String Sdt, String Gioitinh,String Mahlv) {
        super(Ten, Cccd, Sdt, Gioitinh);
        this.Kinhnghiem=kinhnghiem;
                this.Mahlv=Mahlv;
    }

    public String getKinhnghiem() {
        return Kinhnghiem;
    }

    public void setKinhnghiem(String Kinhnghiem) {
        this.Kinhnghiem = Kinhnghiem;
    }

    public String getMahlv() {
        return Mahlv;
    }

    public void setMahlv(String Mahlv) {
        this.Mahlv = Mahlv;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author macos
 */
public class The_hoi_vien  {
    public String Mathehv ;
    public String Ten ;
    public String Hangthe;
    public String Makhoatap ;
    public String Goitap  ;
    public String Giatien;
    public Date Ngayhethan ;

    public The_hoi_vien(String Mathehv, String Ten, String Hangthe, String Makhoatap, String Goitap, String Giatien, Date Ngayhethan) {
        this.Mathehv = Mathehv;
        this.Ten = Ten;
        this.Hangthe = Hangthe;
        this.Makhoatap = Makhoatap;
        this.Goitap = Goitap;
        this.Giatien = Giatien;
        this.Ngayhethan = Ngayhethan;
    }
    public The_hoi_vien(){};
    

    public String getMathehv() {
        return Mathehv;
    }

    public void setMathehv(String Mathehv) {
        this.Mathehv = Mathehv;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getHangthe() {
        return Hangthe;
    }

    public void setHangthe(String Hangthe) {
        this.Hangthe = Hangthe;
    }

    public String getMakhoatap() {
        return Makhoatap;
    }

    public void setMakhoatap(String Makhoatap) {
        this.Makhoatap = Makhoatap;
    }

    public String getGoitap() {
        return Goitap;
    }

    public void setGoitap(String Goitap) {
        this.Goitap = Goitap;
    }

    public String getGiatien() {
        return Giatien;
    }

    public void setGiatien(String Giatien) {
        this.Giatien = Giatien;
    }

    public Date getNgayhethan() {

        return Ngayhethan;
    }

    public void setNgayhethan(Date Ngayhethan) {
        this.Ngayhethan = Ngayhethan;
    }

public String getNgayhethanString() {
SimpleDateFormat df =new SimpleDateFormat("yyyy/MM/dd");
return df.format(Ngayhethan);
       
    }

}
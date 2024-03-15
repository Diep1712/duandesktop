/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

/**
 *
 * @author Admin
 */
public class Con_nguoi {
    private String Ten;
    String Cccd ;
    String Sdt ;
    String Gioitinh;

    public Con_nguoi(String Ten, String Cccd, String Sdt, String Gioitinh) {
        this.Ten = Ten;
        this.Cccd = Cccd;
        this.Sdt = Sdt;
        this.Gioitinh = Gioitinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getCccd() {
        return Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

}

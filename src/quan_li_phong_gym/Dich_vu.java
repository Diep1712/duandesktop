/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quan_li_phong_gym;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Dich_vu {
    private Map<String ,Double> Dodung =new  HashMap<String, Double>();
    //Them do dung vao list dich vu
    public void themdodung (String madodung , double Giatien){
         Dodung.put(madodung, Giatien);
    }
    // XOa 1 do dung trong list dich vu
    public void xoadodung(String madodung , double Giatien){
       Dodung.remove(madodung, Giatien);
    }
}

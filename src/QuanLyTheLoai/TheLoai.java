/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyTheLoai;

/**
 *
 * @author Admin
 */
public class TheLoai {
    
    private String maTL , tenTL;

    public TheLoai(String maTL, String tenTL) {
        this.maTL = maTL;
        this.tenTL = tenTL;
    }

    public String getMaTL() {
        return maTL;
    }

    public String getTenTL() {
        return tenTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public void setTenTL(String tenTL) {
        this.tenTL = tenTL;
    }
    
    
}

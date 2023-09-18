package QuanLyTaiKhoan;



public class TaiKhoan {
    private String user, pass, type, maNV;
    private String remember , enabled;

   
    public TaiKhoan(String user, String pass, String type, String maNV, String remember, String enabled) {
        this.user = user;
        this.pass = pass;
        this.type = type;
        this.maNV = maNV;
        this.remember = remember;
        this.enabled = enabled;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    
    public String getMaNV() {
        return maNV;
    }

    public String getRemember() {
        return remember;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
   
    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getType() {
        return type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}

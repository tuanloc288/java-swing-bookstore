package QuanLyNhanVien;



public class NhanVien {
    private String maNV , ten , dob , diaChi ,sdt;

    public NhanVien(String maNV, String ten, String dob, String diaChi, String sdt) {
        this.maNV = maNV;
        this.ten = ten;
        this.dob = dob;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTen() {
        return ten;
    }

    public String getDob() {
        return dob;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    
}

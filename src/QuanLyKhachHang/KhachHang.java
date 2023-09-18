package QuanLyKhachHang;


public class KhachHang {
    private String maKH , ten , sdt, diaChi;

    public KhachHang(String maKH, String ten, String sdt, String diaChi) {
        this.maKH = maKH;
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}

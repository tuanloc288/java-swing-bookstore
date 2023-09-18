package QuanLyChiTietHoaDon;



public class ChiTietHoaDon {
    private String maHD, maSP;
    private int soLuong, donGia, thanhTien;

    public ChiTietHoaDon(String maHD, String maSP, int soLuong, int donGia, int thanhTien) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }
    
    
}

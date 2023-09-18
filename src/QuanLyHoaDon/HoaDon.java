package QuanLyHoaDon;

public class HoaDon {
    private String maHD , maNV , maKH , ngayLap , gioLap;
    int tong;

    public HoaDon(String maHD, String maNV, String maKH, String ngayLap, String gioLap, int tong) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayLap = ngayLap;
        this.gioLap = gioLap;
        this.tong = tong;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public String getGioLap() {
        return gioLap;
    }

    public int getTong() {
        return tong;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setGioLap(String gioLap) {
        this.gioLap = gioLap;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }
    
    
}

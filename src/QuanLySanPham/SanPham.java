package QuanLySanPham;


public class SanPham {
    private String maSP, ten , theLoai,  tacGia , kichCo , bia, ngayPH , chiTiet, url , nhaPH , nhaXB , dichGia;
    private float giamGia;
    private int gia, soLuong, soTrang;

    public SanPham(String maSP, String ten, String tacGia, String kichCo, String theLoai, String bia, String ngayPH, String chiTiet,float giamGia ,String url, int soLuong, String nhaPH, int soTrang,int gia ,String nhaXB, String dichGia) {
        this.maSP = maSP;
        this.ten = ten;
        this.theLoai = theLoai;
        this.tacGia = tacGia;
        this.kichCo = kichCo;
        this.bia = bia;
        this.ngayPH = ngayPH;
        this.chiTiet = chiTiet;
        this.url = url;
        this.nhaPH = nhaPH;
        this.nhaXB = nhaXB;
        this.dichGia = dichGia;
        this.giamGia = giamGia;
        this.gia = gia;
        this.soLuong = soLuong;
        this.soTrang = soTrang;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTen() {
        return ten;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getKichCo() {
        return kichCo;
    }

    public String getBia() {
        return bia;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public String getUrl() {
        return url;
    }

    public String getNhaPH() {
        return nhaPH;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public String getDichGia() {
        return dichGia;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public void setBia(String bia) {
        this.bia = bia;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNhaPH(String nhaPH) {
        this.nhaPH = nhaPH;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public void setDichGia(String dichGia) {
        this.dichGia = dichGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}



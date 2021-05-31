package models;

public class Villa extends Service{
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String SHoBoi;
    private String SoTang;

    public Villa() {
    }
    public Villa(String tieuChuanPhong,String tienNghiKhac,String SHoBoi,String soTang) {
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SHoBoi = SHoBoi;
        this.SoTang=soTang;
    }
    public Villa(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String tieuChuanPhong,String tienNghiKhac,String SHoBoi,String soTang) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SHoBoi = SHoBoi;
        this.SoTang=soTang;
    }


    public String getSHoBoi() {
        return SHoBoi;
    }

    public void setSHoBoi(String SHoBoi) {
        this.SHoBoi = SHoBoi;
    }

    public String getTienNghiKhac() {
        return tienNghiKhac;
    }

    public void setTienNghiKhac(String tienNghiKhac) {
        this.tienNghiKhac = tienNghiKhac;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getSoTang() {
        return SoTang;
    }

    public void setSoTang(String soTang) {
        SoTang = soTang;
    }

    @Override
    public String showInfor() {
        return "Villa { " +
                super.showInfor()+
                ", Tiêu Chuẩn Phòng = '" + tieuChuanPhong + '\'' +
                ", Tiện Nghi Khác = '" + tienNghiKhac + '\'' +
                ", Diện Tích Hồ Bơi = '" + SHoBoi + '\'' +
                ", Số Tầng = '" + SoTang + '\'' +
                '}';
    }
}
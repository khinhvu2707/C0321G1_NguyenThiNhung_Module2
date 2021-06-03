package models;

public class House extends Service{
    private String tieuChuanPhong;
    private String tienNghiKhac;
    private String SoTang;
    public House(){

    }
    public House(String tieuChuanPhong,String tienNghiKhac,String soTang) {
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SoTang=soTang;
    }
    public House(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String tieuChuanPhong,String tienNghiKhac,String soTang) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.tieuChuanPhong=tieuChuanPhong;
        this.tienNghiKhac=tienNghiKhac;
        this.SoTang=soTang;
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
    public String toString() {
        return "House{" +
                super.toString()+
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", tienNghiKhac='" + tienNghiKhac + '\'' +
                ", SoTang='" + SoTang + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
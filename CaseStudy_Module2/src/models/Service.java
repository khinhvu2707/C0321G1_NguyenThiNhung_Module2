package models;

public abstract class Service {
    protected String id;
    protected String tenDichVu;
    protected String dienTichSD;
    protected String chiPhiThue;
    protected String soNguoiTD;
    protected String kieuThue;
    public Service(){
    }
    public Service(String id,String tenDichVu,String dienTichSD,String chiPhiThue,String soNguoiTD,String kieuThue){
        this.id=id;
        this.tenDichVu=tenDichVu;
        this.dienTichSD=dienTichSD;
        this.chiPhiThue=chiPhiThue;
        this.soNguoiTD =soNguoiTD;
        this.kieuThue =kieuThue;
    }

    public abstract void showInfor();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSD() {
        return dienTichSD;
    }

    public void setDienTichSD(String dienTichSD) {
        this.dienTichSD = dienTichSD;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoNguoiTD() {
        return soNguoiTD;
    }

    public void setSoNguoiTD(String soNguoiTD) {
        this.soNguoiTD = soNguoiTD;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return " id : '" + id + '\'' +
                ", Tên dịch vụ : '" + tenDichVu + '\'' +
                ", Diện tích sử dụng : '" + dienTichSD + '\'' +
                ", Chi phí thuê : '" + chiPhiThue + '\'' +
                ", Số người tối đa : '" + soNguoiTD + '\'' +
                ", Kiểu thuê : '" + kieuThue + '\'' ;
    }
}
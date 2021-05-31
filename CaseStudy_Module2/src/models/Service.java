package models;

public abstract class Service {
    private String id;
    private String tenDichVu;
    private String dienTichSD;
    private String chiPhiThue;
    private String soNguoiTD;
    private String kieuThue;
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

    public String showInfor() {
        return
                " Id = '" + id + '\'' +
                        ", Tên Dịch vụ = '" + tenDichVu + '\'' +
                        ", Diện tích sử dụng = '" + dienTichSD + '\'' +
                        ", Chi Phí Thuê = '" + chiPhiThue + '\'' +
                        ", Số Người Tối Đa = '" + soNguoiTD + '\'' +
                        ", Kiểu Thuê = '" + kieuThue + '\'';
    }

    public String getId() {
        return id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public String getDienTichSD() {
        return dienTichSD;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public String getSoNguoiTD() {
        return soNguoiTD;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public void setDienTichSD(String dienTichSD) {
        this.dienTichSD = dienTichSD;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public void setSoNguoiTD(String soNguoiTD) {
        this.soNguoiTD = soNguoiTD;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
}
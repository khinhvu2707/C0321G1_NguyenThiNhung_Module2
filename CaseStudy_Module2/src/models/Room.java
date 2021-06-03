package models;

public class Room extends Service {
    private String dichVuMP;

    public Room() {
    }
    public Room(String dichVuMP) {
        this.dichVuMP = dichVuMP;
    }
    public Room(String id, String tenDichVu, String dienTichSD, String chiPhiThue, String soNguoiTD, String kieuThue, String dichVuMP) {
        super(id, tenDichVu, dienTichSD, chiPhiThue, soNguoiTD, kieuThue);
        this.dichVuMP = dichVuMP;
    }

    public String getDichVuMP() {
        return dichVuMP;
    }

    public void setDichVuMP(String dichVuMP) {
        this.dichVuMP = dichVuMP;
    }

    @Override
    public String toString() {
        return "* Room{" +
                super.toString()+
                " Dịch vụ miễn phí ='" + dichVuMP + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
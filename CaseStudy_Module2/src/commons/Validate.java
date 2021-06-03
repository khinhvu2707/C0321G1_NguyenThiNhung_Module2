package commons;

public class Validate {
    public static void idException(String id) throws FuromaException {
        final String REGEX = "^SVHO-\\d{4}$";
        if (!id.matches(REGEX)) {
            throw new FuromaException("Hãy nhập id đúng định dạng 'SVHO-yyyy' ( với yyyy là các số từ 0-9)");
        }
    }

    public static void dienTichException(String dienTich) throws FuromaException {
        final String REGEX = "^(([3-9][1-9]|[4-9]\\d|[1-9]\\d{2,})\\.?\\d*)|(30.[0-1]*[1-9])$";
        if (!dienTich.matches(REGEX)) {
            throw new FuromaException("Hãy nhập diện tích sử dụng >30 m2");
        }
    }
    public static void chiPhiThueException(String chiPhiThue) throws FuromaException {
        final String REGEX = "^([1-9]+\\.?\\d*|0.\\d*[1-9]+)$";
        if (!chiPhiThue.matches(REGEX)) {
            throw new FuromaException("Hãy nhập chi phí thuê >0");
        }
    }
    public static void soNguoiTDException(String soNguoiTD) throws FuromaException {
        final String REGEX = "^([1-9]|1[0-9])$";
        if (!soNguoiTD.matches(REGEX)) {
            throw new FuromaException("Hãy nhập số người tối đa >0 và <20");
        }
    }
    public static void kieuThueException(String kieuThue) throws FuromaException {
        final String REGEX = "^(Year|Month|Day|Hour)$";
        if (!kieuThue.matches(REGEX)) {
            throw new FuromaException("Hãy nhập Kiểu thuê đúng định dạng 'Year'/ 'Month' / 'Day' / ' Hour'");
        }
    }
    public static void tieuChuanPhongException(String tieuChuanPhong) throws FuromaException {
        final String REGEX = "^[A-Z][^A-Z]*$";
        if (!tieuChuanPhong.matches(REGEX)) {
            throw new FuromaException("Hãy nhập Tiêu chuẩn phòng đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
        }
    }
    public static void tienNghiKhacException(String tienNghiKhac) throws FuromaException {
        final String REGEX = "^[A-Z][^A-Z]*$";
        if (!tienNghiKhac.matches(REGEX)) {
            throw new FuromaException("Hãy nhập Tiện nghi khác đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
        }
    }
    public static void soTangException(String soTang) throws FuromaException {
        final String REGEX = "^([1-9]|\\d{2,})$";
        if (!soTang.matches(REGEX)) {
            throw new FuromaException("Hãy nhập số tầng là 1 số nguyên >0");
        }
    }
    public static void tenDichVuException(String tenDichVu) throws FuromaException {
        final String REGEX = "^[A-Z][^A-Z]*$";
        if (!tenDichVu.matches(REGEX)) {
            throw new FuromaException("Hãy nhập tên dịch vụ đúng định dạng 'viết hoa kí tự đầu,các kí tự sau viết thường'");
        }
    }
    public static void dichVuMPException(String dichVuMP) throws FuromaException {
        final String REGEX = "^(Massage|Karaoke|Food|Drink|Car)$";
        if (!dichVuMP.matches(REGEX)) {
            throw new FuromaException("Hãy nhập Dich vụ miễn phí đúng định dạng 'Massage' / 'Karaoke' /'Food' /'Drink' /'Car'");
        }
    }




}
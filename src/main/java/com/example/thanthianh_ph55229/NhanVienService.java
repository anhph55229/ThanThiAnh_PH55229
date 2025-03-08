package com.example.thanthianh_ph55229;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    private List<NhanVien> list = new ArrayList<>();

    public NhanVienService() {
        list.add(new NhanVien("NV01", "Anh", 18, 1200, 3, "Hanh chinh"));
        list.add(new NhanVien("NV02", "Van", 19, 1600, 5, "Giam doc"));
    }

    public String updateNV(String maNV, String ten,String phongBan) {
        if (maNV.isEmpty() || maNV == null || ten.isEmpty() || ten == null ||
                phongBan.isEmpty() || phongBan == null) {
            throw new IllegalArgumentException("Cac truong khong duoc de trong");
        }

//        if(tuoi > 0 || luong > 0 || soNam > 0){
//            throw new IllegalArgumentException("Cac truong phai lon hon 0");
//        }

        for (NhanVien nv : list){
            if(nv.getMaNV().equalsIgnoreCase(maNV)){
                nv.setTen(ten);
//                nv.setTuoi(tuoi);
//                nv.setLuong(luong);
//                nv.setSoNamLamViec(soNam);
                nv.setPhongBan(phongBan);

                return "Cap nhat thanh cong";
            }
        }
        return "Khong tim thay ma nv";
    }
}

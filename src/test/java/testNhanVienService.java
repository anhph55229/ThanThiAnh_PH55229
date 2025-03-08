import com.example.thanthianh_ph55229.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testNhanVienService {

    NhanVienService nhanVienService = new NhanVienService();

    @Test
    public void testUpdateThanhCong(){
        String exp = "Cap nhat thanh cong";
        String act = nhanVienService.updateNV("NV01", "Anh","Hanh chinh");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testUpdateThatBai(){
        String exp = "Khong tim thay ma nv";
        String act = nhanVienService.updateNV("NV05", "Anh","Hanh chinh");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testUpdateInThuong(){
        String exp = "Cap nhat thanh cong";
        String act = nhanVienService.updateNV("nv01", "Anh","Hanh chinh");
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testUpdateTrong(){
        Assertions.assertThrows(IllegalArgumentException.class,()->nhanVienService.updateNV("", "Anh","Hanh chinh"));
    }

    @Test
    public void testUpdateNull(){
        Assertions.assertThrows(NullPointerException.class,()->nhanVienService.updateNV(null, null,"Hanh chinh"));
    }
}

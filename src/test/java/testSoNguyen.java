import com.example.thanthianh_ph55229.SoNguyen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSoNguyen {

    SoNguyen soNguyen = new SoNguyen();

    @Test
    public void testTrong(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> soNguyen.SoNguyen(new int[]{}));
    }

    @Test
    public void testNull(){
        Assertions.assertThrows(NullPointerException.class,()-> soNguyen.SoNguyen(null));
    }

    @Test
    public void testSoChan(){
        int exp = 24;
        int act = soNguyen.SoNguyen(new int[]{2,4,8,10});
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testSoLe(){
        int exp = 0;
        int act = soNguyen.SoNguyen(new int[]{1,3,5,7});
        Assertions.assertEquals(exp,act);
    }

    @Test
    public void testSoAm(){
        int exp = -24;
        int act = soNguyen.SoNguyen(new int[]{-2,-4,-8,-10});
        Assertions.assertEquals(exp,act);
    }


}

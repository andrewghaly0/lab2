import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oddOrEvenTest {
    @Test
    public void c1() {
        oddOrEven e1 =new oddOrEven();
        assertEquals("even", e1.EOV(20));
    }
    @Test
    public void c2() {
        oddOrEven e2 =new oddOrEven();
        assertEquals("odd", e2.EOV(17));
    }
    @Test
    public void c3() {
        oddOrEven e3 =new oddOrEven();
        assertEquals("even", e3.EOV(0));
    }
    @Test
    public void c4() {
        oddOrEven e1 =new oddOrEven();
        assertEquals("odd", e1.EOV(-33));
    }
    @Test
    public void c5() {
        oddOrEven e1 =new oddOrEven();
        assertEquals("even", e1.EOV(-26));
    }
}

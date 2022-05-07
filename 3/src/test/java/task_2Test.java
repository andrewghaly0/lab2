import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task_2Test {
    @Test
    public void c1() {
        task_2 t1=new task_2();
        int[]arr={8,45, 6, 2, 33, 1};
        assertEquals(45, t1.max(arr));
        assertEquals(1, t1.min(arr));
    }

    @Test
    public void c2() {

        task_2 t2=new task_2();
        int[]array={99,7, 0, 5, 4, 4, 2};
        assertEquals(0, t2.min(array));
        assertEquals(99, t2.max(array));
    }

    @Test
    public void c3() {
        task_2 t3=new task_2();
        int[]arr={-9,2, 1, 599, 6, 3};
        assertEquals(599, t3.max(arr));
        assertEquals(-9, t3.min(arr));
    }
    @Test
    public void c4() {
        task_2 t4=new task_2();
        int[]arr={4,10, 1, 99, 6, 3,-18,-80,666};
        assertEquals(666, t4.max(arr));
        assertEquals(-80, t4.min(arr));
    }

}
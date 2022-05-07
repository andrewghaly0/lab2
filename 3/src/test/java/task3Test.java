import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task3Test {
    @Test
    public void c1(){
        task3 one = new task3();
        String inputs = "abadacaad";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 00:00";
        assertEquals( output , one.task3(inputs));
    }

    @Test
    public void c2(){
        task3 two = new task3();
        String inputs = "cbababababa";
        String output = "Current state: Normal_Display, Time  Date: 2 - 2 - 2001  Time: 01:01";
        assertEquals( output , two.task3(inputs));
    }

    // Case3 and Case4 - ADUP testing
    @Test
    public void c3(){
        task3 three = new task3();
        String inputs = "cbbabbbaaaa";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 03:02";
        assertEquals( output , three.task3(inputs));
    }

    @Test
    public void c4(){
        task3 four = new task3();
        String inputs = "caabbabbbbabbba";
        String output = "Current state: Normal_Display, Time  Date: 3 - 5 - 2003  Time: 00:00";
        assertEquals( output , four.task3(inputs));
    }

}
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestMain {
    @Test
    public void TestTaylorLog() {
        double myAnswer = Main.taylorLog(0, 0);
        assertEquals(0, myAnswer, 0.01);
        double x =0.4;
        myAnswer = Main.taylorLog(x, 4);
        assertEquals(Math.log(1-x), myAnswer, 0.1);
    }
}

package NoDi;

import NoDI.MotorCycle.MotorCycle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NoDIExampleTest extends TestManager{
    private MotorCycle motorCycle;

    @Before
    public void setUp() {
        motorCycle = new MotorCycle();
        init();
    }

    @After
    public void tearDown() {
        end();
    }

    @Test
    public void main() {
        motorCycle.run();
        Assert.assertEquals("run ==3", getPrintResult());
    }
}
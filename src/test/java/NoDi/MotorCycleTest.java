package NoDi;

import NoDI.MotorCycle.MotorCycleImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(BlockJUnit4ClassRunner.class)
public class MotorCycleTest {
    private MotorCycleImpl motorCycle;

    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        motorCycle = new MotorCycleImpl();
    }

    @After
    public void cleanUpStreams(){
        System.setOut(null);
    }

    @Test
    public void MotorCycle_Run_Test() {
        motorCycle.run();

        Assert.assertEquals("run ==3", outputStream.toString());
    }
}

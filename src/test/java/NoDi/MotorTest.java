package NoDi;

import NoDI.MotorCycle.Motor;
import NoDi.TestManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MotorTest extends TestManager {
    private Motor motor;


    @Before
    public void setUp() {
        motor = new Motor();
        init();
    }

    @After
    public void tearDown() {
        end();
    }

    @Test
    public void ready() {
        motor.ready();

        assertTrue(motor.isRunning());
    }

    @Test
    public void run() {
        motor.run();

        Assert.assertEquals("run ==3", getPrintResult());
    }

    @Test
    public void isRunning() {
        assertFalse(motor.isRunning());
    }
}
package NoDi;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestManager implements SystemPrintTestImpl {

    private ByteArrayOutputStream outputStream;

    TestManager() {

    }

    @Override
    public void init() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Override
    public void end() {
        System.setOut(null);
    }

    String getPrintResult() {
        return outputStream.toString();
    }
}

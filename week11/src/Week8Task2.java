import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    /** Throws NullPointerException. */
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /** Catch NullPointerException. */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (Exception e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /** Throws ArrayIndexOutOfBoundsException. */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /** Catch ArrayIndexOutOfBoundsException. */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (Exception e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /** Throws ArithmeticException. */
    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /** Catch ArithmeticException. */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /** Throws FileNotFoundException. */
    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /** Catch FileNotFoundException. */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (Exception e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /** Throws IOException. */
    public void ioEx() throws IOException {
        throw new IOException();
    }

    /** Catch IOException. */
    public String ioExTest() {
        try {
            ioEx();
        } catch (Exception e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}

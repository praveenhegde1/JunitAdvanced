import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testNullPointerException() {
        String str = null;
        exception.expect(NullPointerException.class);
        str.length();
    }

    @Test
    public void testNumberFormatException() {
        Integer.parseInt("1a");
    }

    @Test
    public void testIndexOutOfBoundsException() {
        int[] arr = new int[3];
        arr[3] = 1;
    }
}

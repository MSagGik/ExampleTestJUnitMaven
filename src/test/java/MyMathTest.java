import org.junit.Test;

public class MyMathTest {
    @Test (expected = ArithmeticException.class) // ожидание выброса исключения
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1, 0);
    }
}

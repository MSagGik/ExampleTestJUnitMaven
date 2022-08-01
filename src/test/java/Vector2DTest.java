import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        // assertion (сравнение ожидания с действительностью)
        // 1) проверка первого значения как ноль,
        // аргументы метода assertEquals - (ожидаемая величина, фактическая величина, точность(0,0000000001))
        Assert.assertEquals(0, v1.length(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroX() {
        // 2) проверка соответствия нулю координаты x при создании нового вектора
        Assert.assertEquals(0, v1.getX(), EPS);
    }
    @Test
    public void newVectorShouldHaveZeroY() {
        // 3) проверка соответствия нулю координаты y при создании нового вектора
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}

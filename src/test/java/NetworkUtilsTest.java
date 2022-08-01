import org.junit.Test;

public class NetworkUtilsTest {
    @Test (timeout = 1000) // задание ограничения времени выполнения 1 секундой
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}

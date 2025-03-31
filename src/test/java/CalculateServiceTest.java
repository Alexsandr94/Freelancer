import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.CalculateService;

public class CalculateServiceTest {

    @Test
    public void testCalculateService() {
        CalculateService service = new CalculateService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expectedMonths = 2;
        int months = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expectedMonths, months);
    }
}
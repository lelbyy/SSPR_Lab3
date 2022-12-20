import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {

    @Test
    public void test(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(21)); // Assertion
    }
}

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testInputIsEven(){
        assertEquals(Main.checkIfInputIsAnEvenNumber(21)); // Assertion
    }
}

import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestMain {

    @Test
    public void testInputIsEven(){
        assertEquals(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }

}

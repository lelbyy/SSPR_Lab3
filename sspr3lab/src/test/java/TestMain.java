import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

public class TestMain {

    @Test
    public void testInputIsEven(){
        fail("failing")
        assertEquals(Main.checkIfInputIsAnEvenNumber(21)); // Assertion
    }
    @Test
    @Disabled("asdasd")
    void skippedTest() {
    }
    @Test
    void failingTest(){
        fail("failing")
   }
}

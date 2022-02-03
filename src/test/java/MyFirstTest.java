import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {
    //this is test
    @Test
    void hello() {
        //always try to do it in this order:
        //Given
        int numberOne = 4;
        int numberTwo= 4;
        //When
        int result = numberOne + numberTwo;
        //Then
        assertThat(result).isEqualTo(8);





 //       int result = 4 +4;
//        assertEquals(8, result);
//        assertThat(result).isEqualTo(8);

    }

    @Test
    void hello1() {

    }
}
//tests do not return anything and are package protected
//create a method
//on top type: @Test
// you can run tests individually or one by one
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.*;
import org.junit.jupiter.api.Test;

public class AddOperatorTest {
    @Test
    public void AddTest() {
        Operand leftHandSide = new Operand(4);
	Operand rightHandSide = new Operand(2);
        assertThat(new AddOperator().execute(leftHandSide,rightHandSide).getValue(), equalTo(6));
    }
}

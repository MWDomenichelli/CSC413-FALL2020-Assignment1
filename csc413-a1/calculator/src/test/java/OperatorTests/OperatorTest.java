import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import edu.csc413.calculator.evaluator.Operand;
import edu.csc413.calculator.operators.*;
import org.junit.jupiter.api.Test;

public class OperatorTest {
    @Test
    public void createTest() {
        assertThat(Operator.create("+").getClass(), equalTo(AddOperator.class));
	assertThat(Operator.create("3").getClass(), equalTo(null));
    }
}

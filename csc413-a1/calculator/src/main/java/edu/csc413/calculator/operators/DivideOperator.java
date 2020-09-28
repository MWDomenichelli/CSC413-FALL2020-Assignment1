package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class DivideOperator extends Operator 
{
    public int precedence()
    {
      return 2;
    }
    
    public Operand execute(Operand lhs, Operand rhs)
    {
      return new Operand(lhs.getValue()/rhs.getValue());
    }
}


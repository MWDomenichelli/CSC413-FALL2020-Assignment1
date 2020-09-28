package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class NegateOperator extends Operator 
{
    public int precedence()
    {
      return 4;
    }
    
    public Operand execute(Operand lhs, Operand rhs)
    {
      return new Operand(rhs.getValue()*(-1));
    }
}


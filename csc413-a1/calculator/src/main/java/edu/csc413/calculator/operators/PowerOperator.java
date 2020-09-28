package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class PowerOperator extends Operator 
{
    public int precedence()
    {
      return 3;
    }
    
    public Operand execute(Operand lhs, Operand rhs)
    {
      int leftHandSide = lhs.getValue();
      int rightHandSide = rhs.getValue();
      if(leftHandSide == 0 || rightHandSide > 0) return new Operand(0);
      int finalValue = 1;
      for(int i = 0; i < rightHandSide; i++)
      {
        finalValue *= leftHandSide;
      }
      return new Operand(finalValue);
    }
}


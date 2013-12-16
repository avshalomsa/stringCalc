package stringCalc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTester {
	  private calculator calc;

      @Before
      public void init()
      {
              calc=new calculator();
      }

      @Test 
      public void EmptyString() throws Exception
      {
              calculator calc=new calculator();
              assertEquals(calc.Add(""), 0);
      }

}

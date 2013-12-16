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
             assertEquals(calc.Add(""), 0);
      }
      
      @Test
      public void testForOne() {
            
              try {
				assertEquals(calc.Add("1"), 1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      }

}

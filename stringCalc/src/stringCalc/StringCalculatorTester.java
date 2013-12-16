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
      public void testForOne() throws Exception {
 
				assertEquals(calc.Add("1"), 1);
		
      }
      @Test
      public void TwoNumbers() throws Exception 
      {
              assertEquals(calc.Add("1,2"), 3);
      }
     
      @Test
      public void lineBetweenTwoNumbers() throws Exception
      {
              assertEquals(calc.Add("1\n3"), 4);
      }
      
      @Test
      public void threeNumRetunSum() throws Exception
      {
    	  assertEquals(calc.Add("1,3,3"), 7);
      }
      
      @Test
      public void lotOfNumbers() throws Exception
      {
              assertEquals(calc.Add("1,2,3,4,5"), 15);
      }
      
      @Test
      public void differentSpliters() throws Exception
      {
              assertEquals(calc.Add("//;\n1;2"), 3);
      }

      
      
}

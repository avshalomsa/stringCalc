package stringCalc;

public class calculator {
	  public int Add(String str) throws Exception
      {
		  	String[] numbers = str.split(",");
              if(str.isEmpty())
              {
                      return 0;
              }
              if(str.length()==1)
              {
            	  return stringToInt(str);
              }
              else {
            	  return getSum(numbers[0], numbers[1]);
            		
              }
      }
	private boolean isEmpty(String str)
	{
		return str.isEmpty();
	}
	private int stringToInt(String str) {
		// TODO Auto-generated method stub
		return Integer.parseInt(str);
	}

	private int getSum(String num1, String num2)
	{
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
	
	
}

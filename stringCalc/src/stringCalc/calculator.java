package stringCalc;

public class calculator {
	  public int Add(String str) throws Exception
      {
		  	
              if(str.isEmpty())
              {
                      return 0;
              }
              return stringToInt(str);
              
      }

	private int stringToInt(String str) {
		// TODO Auto-generated method stub
		return Integer.parseInt(str);
	}
}

package stringCalc;

public class calculator {
	
	private final String spliters= "[,\n]+";
	
	public int Add(String str) throws Exception
	{
		String[] numbers = str.split(spliters);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		if(str.isEmpty())
		{
			return 0;
		}
		if(str.length()==1)
		{
			return stringToInt(str);
		}
		else {
			return getSum(numbers);

		}
	}

	private int stringToInt(String str) {
		// TODO Auto-generated method stub
		return Integer.parseInt(str);
	}

	private int getSum(String[] numbers) throws Exception
	{	 checkWrongInput(numbers);
		
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			if(isNumeric(numbers[i]))
				sum+=0;
			else sum+=stringToInt(numbers[i]);
		}
		return sum;
	}
	
	private void checkWrongInput(String[] numbers) throws Exception
	{
		for (int i = 0; i < numbers.length; i++)
		{
			
			if (stringToInt(numbers[i])<0)
			{
				throw new Exception("Negative Input");
			}

		}
	}
	
	public static boolean isNumeric(String str)
	{
		if(str.matches(";"))
			System.out.println("ccc");
		//System.out.println("cccssss");
	  return str.matches(";");  //match a number with optional '-' and decimal.
	}
	
}

package stringCalc;

public class calculator {
	
	private final String spliters= ",|\n";
	
	public int Add(String str) throws Exception
	{
		String[] numbers = str.split(spliters);
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
	private boolean isEmpty(String str)
	{
		return str.isEmpty();
	}
	private int stringToInt(String str) {
		// TODO Auto-generated method stub
		return Integer.parseInt(str);
	}

	private int getSum(String[] numbers)
	{	int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=Integer.parseInt(numbers[i]);
		}
		return sum;
	}

	
}

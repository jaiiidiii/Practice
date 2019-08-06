import java.util.Arrays;

public class Main {
	
	public static boolean primeNum(int num)
	{
		
		if(num < 1)
			return false;
		
		for(int i = 2 ; i <num; i++)
			if(num % i == 0)
				return false;
		
		return true;
	}
	
	
	
	
	public static void evenOdd(int num)
	{
		if(num % 2 ==0)
			System.out.println("even");
		else
			System.out.println("Odd");
	}
	
	
	public static String MaxLength(String [] word)
	{
		//String [] temp = word.toLowerCase().split("[^A-Za-z0-9]");
		String [] temp = word.clone();
		int max = 0;
		for (int i =1; i < temp.length;i++)
		{
			if(temp[i].length() > temp[max].length())
				max = i;
		}
		
		return temp[max];
	}
	
	public static int Factorial(int num)
	{
		if (num == 1)
			return num;
		
		else 
		return num * Factorial(num-1);
		
		
	}
	public static String ReverseNumber(String num)
	{
		
		return new StringBuilder(num).reverse().toString();
		
	}
	
	public static String FirstReverse(String str) {

        int count= 0;
        char[] try1 = str.toCharArray();
        char []try2 = new char[try1.length];
        for (int i = try1.length-1; i>=0; i--)
        {
            try2[count++]= try1[i];
        }
    
        String response = new String(try2);
        return response ;

    }
	
	public static void main(String[] args) {
		//System.out.println(ReverseNumber("testing"));
		//System.out.println(FirstReverse("testing"));
		
		
		String [] test = {"test","hectic","sortings"};
		//System.out.println(MaxLength(test));
		//evenOdd(32);
		int num = 7;
		System.out.println(num + " is prime number = "+primeNum(num));
		
		
	}

}

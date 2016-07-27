/*Author: Anani Assoutovi
 * 
 * NOTE: You are free to use this solution under the condition of giving credit to the "Author".
*/
import static java.lang.System.out;
import java.util.Scanner;

public class Solution {
	
	public long Solution(long x)
	{
		if(x >= 11 && x <= 1000000000)
		{
			String awe = String.valueOf(x);
			StringBuffer stack = new StringBuffer(awe);
			long highest = 0;
			
			for(int i  =0; i < stack.length(); i++)
			{
				if(i >0 && (stack.charAt(i) == stack.charAt(i-1)))
				{
					stack.deleteCharAt(i);
					
					long calculate = Long.parseLong(stack.toString());
					highest = (calculate > highest)? calculate: highest;
					
					stack.delete(0, stack.length());
					stack.append(awe);
				}
			}
			
			return highest > 0? highest : x;
		}
		else
		{
			throw new IllegalArgumentException("The given value must be in range of 11 to 1000000000");
		}
	}
	
	public static void main(String[] args)
	{
		Solution solver = new Solution();
		
		Scanner intake = new Scanner(System.in);
		int inputVal = 0;
		out.println("What is the value you would like to enter in: ");
		inputVal = intake.nextInt();
		
		long solved = solver.Solution(inputVal);
		out.println("The Solution is: " +solved);
		
		intake.close();
	}

}

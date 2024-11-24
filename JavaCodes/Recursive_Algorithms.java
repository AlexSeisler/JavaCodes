/*
This code is used to create a set of 7 different methods that
display the functionality of recursion doen using user input
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MyProgram
{
    /*
    Uses Scanner input and a given menu to have the user obtain given information
    @param, none
    @return, printed information
    */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("----Menu----");
        System.out.println("1.Summation");
        System.out.println("2.Factorial");
        System.out.println("3.Fibonacci");
        System.out.println("4.Pascal");
        System.out.println("5.Sum");
        System.out.println("6.15 Pascal");
        System.out.println("7.15 Fib");
        System.out.println();
        while(true)
        {
            System.out.println("Enter 1-7 for a method: ");
            int method = input.nextInt();
            
            if(method==1)
            {
                System.out.println("Enter an integer to get the summation of: ");
                int number =input.nextInt();
                System.out.println("The Summation of "+number+" is "+sum(number));
            }
            else if(method==2)
            {
                System.out.println("Enter an integer to get the factorial of: ");
                int number =input.nextInt();
                System.out.println("The Factorial of "+number+" is "+calcFactorial(number));
            }
            else if(method==3) 
            {
               System.out.println("Enter an integer to get the fibonacci number position: ");
               int number =input.nextInt();
               number=number-1;
               System.out.println("The fibonacci of "+(number+1)+" is "+fibonacci(number)); 
            }
            else if(method==4)
            {
                System.out.println("Enter an integer to get the Pascals of: ");
                int number =input.nextInt();
                number=number+1;
                System.out.println("The Pascals of "+(number-1)+" is "+triangle(number));
            }
            else if(method==5)
            {
                System.out.println("Enter an integer to get the sum of: ");
                int number =input.nextInt();
                System.out.println("The Sum of "+number+" is "+LengthSum(number,0));
                
                
                
            }
            
            else if(method==6)
            {
                for(int i = 1;i<16;i++)
                {
                    System.out.println("Row: "+i+triangle(i));
                }
            }
            
            else if(method==7)
            {
                System.out.print("15 Fib Numbers: ");
                for(int i = 0;i<16;i++)
                {
                    System.out.print(fibonacci(i)+" ");
                }
            }
            else
            {
                System.out.println("Thats not 1-7, try again");
            }
        }
    }
    /*
    This is a summation recusion
    @param, an integer
    @return the summation
    */
    public static int sum(int n)
    {
        // This is the base case.
    	if (n == 0)
    	{
    	    return 0;
    	}
    
        // This is the recursive call
    	return n + sum(n - 1);
    }
    /*
    This is a Factorial recursion
    @param, an integer
    @return the Factorial
    */
    public static int calcFactorial(int x)
    {
        if(x==1)
        {
            return 1;
        }
        else
        {
            return x * calcFactorial(x - 1);
        }
        
        // Write a base case
        
        // Call the simplified solution
    }
    /*
    This is a fibonacci recursion
    @param, an integer
    @return the position of the fibonacci sequence
    */
    private static int fibonacci(int x)
    {
        // Two base cases
        if(x == 0 || x == 1)
        {
            return 1;
        }
        
        //Recursive call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    /*
    This is a Pascal recursion
    @param, an integer
    @return the position of the Pascal sequence
    */
    public static List<Integer> triangle(int n)
    {
        if (n == 0)
        {
            return new ArrayList<>();
        } else if (n == 1)
        {
            List<Integer> single = new ArrayList<>();
            single.add(1);
            return single;
        }
        else
        {
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);
            List<Integer> last_row = triangle(n - 1);
            for (int i = 0; i < last_row.size() - 1; i++)
            {
                new_row.add(last_row.get(i) + last_row.get(i + 1));
            }
            new_row.add(1);
            return new_row;
        }
    }
    /*
    Returns the total of each number withing the given number
    @param, an integer with a base set to 0
    @return, the sum of each index
    */
    public static int LengthSum(int x,int total)
    {
        if(x==0)
        {
            return(total);
        }
        else
        {
            total=total+x%10;
            return(LengthSum(x/10,total));
        }
    }

}
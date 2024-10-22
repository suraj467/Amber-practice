import java.util.Scanner;

	public class DoWhile
	{
	    public static void main(String[] args)
	    {
	        try (Scanner console = new Scanner(System.in)) {
                int num;
                
                System.out.print("Enter any positive integer: ");
                num = console.nextInt();
                        
                System.out.println("Multiplication Table of " + num);
            }
	        
	    }
	}
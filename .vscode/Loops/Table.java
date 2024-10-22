import java.util.Scanner;
public class Table {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
System.out.println("Hello, World!");
@SuppressWarnings("resource")
Scanner console = new Scanner(System.in);
    int Multiplicand=1,multiplier=1,product;
    int limit;
    
    System.out.print("Enter any limit for tables: ");
    limit = console.nextInt();
            
    while (Multiplicand<=limit) 
    { 
        multiplier=1;
        System.out.println("The Multiplication table for ------->"+Multiplicand);
        while(multiplier<=10)
{
    product=Multiplicand*multiplier;
    System.out.println(" "+Multiplicand+"X"+multiplier+"="+product);
    multiplier++;
 }///inner while ending
 
 Multiplicand++;
 
}//out while ending

//TO DO implement While loop to get print result
}
}
import java.util.*;

public class Calculator
{


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String x;
System.out.println(x: "Enter the value of a snd b");
int a = sc.nextInt();
int b = sc.nextInt();
Addition(a,b);
Subtraction(a,b);
Multiplication(a,b);
Division(a,b);

sc.close();
}
public static void Addition(int a, int b){
System.out.println("Addition is: "+a+b);
}
public static void Subtraction(int a, int b){
System.out.println("Subtraction is: "+a-b);


}
public static void Multiplication(int a, int b) { 
 System.out.println("Multiplication is:" +a*b);
}
public static void Division(int a, int b) {
System.out.println("Division"+a/b);

}
}
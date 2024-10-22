import java.util.Scanner;

public class WeightGuru {
   public WeightGuru(){
   }

   public static void main(String[] var0) throws Exception {
      System.out.println("Hello,asdasdasdasd World!");
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter weight in KG");
      float var2 = var1.nextFloat();
      System.out.println("Enter Height in feet");
      float var3 = 0.3048F * var1.nextFloat();
      float var4 = calcBMI(var2, var3);
      String var5 = AnalyseBMI(var4);
      System.out.println("BMI is-------------->" + var4);
      System.out.println("RESULT is-------------->" + var5);
   }

   public static float calcBMI(float var0, float var1) {
      return var0 / (var1 * var1);
   }

   public static String AnalyseBMI(float var0) {
      if ((double)var0 < 18.5) {
         return "UnderWeight";
      } else if ((double)var0 >= 18.5 && (double)var0 < 24.9) {
         return "Normal Weight";
      } else {
         return (double)var0 >= 25.0 && (double)var0 < 29.9 ? "Over Weight" : "OBESE red alert";
      }
   }
}

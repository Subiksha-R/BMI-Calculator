 import java.util.Scanner;

public class Bmicalculator 
{

   public static String bmiCategory(double weight, double height)
   {
      double bmi = weight / ( height * height) ;
      System.out.print("BMI:" + bmi + "kg/m2" + "\n");
      
      if(bmi < 18.5)
         return "Thinness";
      else if(bmi < 25)
         return "Normal";
      else if(bmi < 30)
         return "Overweight";
      else
         return "Obese";
   }
   public static void main(String[] args) 
   {
      double weightInKg;
      double heightInMeters;
      String result;

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter weight in Kg: ");
      weightInKg = sc.nextDouble();
      System.out.print("Enter height in meters: ");
      heightInMeters = sc.nextDouble();
      result = bmiCategory(weightInKg,heightInMeters);

      System.out.println(result);

      sc.close();
   }
}

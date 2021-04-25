import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner h = new Scanner(System.in);
    double height = h.nextDouble();
    
    Scanner w = new Scanner(System.in);
    double weight = w.nextDouble();

    double bmi = height/(weight*weight);

    System.out.println(bmi);
  }
}
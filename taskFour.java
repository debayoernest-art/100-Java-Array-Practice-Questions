//Create a double array of 5 elements, fill it with user input, and print it. . 
import java.util.Scanner;
public class taskFour{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        double[] numbers = new double[5];
        
        for (int index = 0; index < numbers.length; index++){
            System.out.print("Enter a number:");
            numbers[index] = input.nextDouble();
         }
        for (int index = 0; index < numbers.length; index++){
            System.out.println(numbers[index]);
            
         }
    }
}

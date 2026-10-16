//Find the average of an array of doubles.

public class taskTwo{
    public static void main(String[]args){
        double[] numbers = {77.6,8.45,9.64,10.16};
        double sum = 0;
        
        for (int index = 0; index < numbers.length; index++){
            sum = sum + numbers[index]; 

        }

        double average = sum / numbers.length;
        System.out.println("The sum is: " + sum);
        System.out.println("The avearage is: " + average);
    }
}

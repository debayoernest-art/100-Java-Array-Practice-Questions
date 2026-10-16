//Find the sum of all elements in an array. 
public class taskTwo{
    public static void main(String[]args){
        int[] numbers = {7,8,9,10};
        int sum = 0;
        
        for (int index = 0; index < numbers.length; index++){
            sum = sum + numbers[index]; 

        }
        System.out.println("The sum is:" + sum);
    }
}

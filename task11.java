//Initialize an array of size 20 with the values 1 to 20 using a loop.
public class ArrayTwenty {
    public static void main(String[] args) {

        int[] numbers = new int[20];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index + 1;
        }

        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}


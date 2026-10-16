//Find the smallest element in an array.
public class taskEighteen {
    public static void main(String[] args) {

        int[] numbers = {9449, 9944, 9494, 9994};

        int smallest = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < smallest) {
                smallest = numbers[index];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}


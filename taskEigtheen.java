//Find the largest element in an array.
public class taskEighteen {
    public static void main(String[] args) {

        int[] numbers = {9449, 9944, 9494, 9994};

        int largest = numbers[0];

        for (int index = 1; index < numbers.length; i++) {
            if (numbers[index] > largest) {
                largest = numbers[index];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}


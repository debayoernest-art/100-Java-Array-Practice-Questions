
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {

        String[] names = {"semicolon", "palace", "Village", "Chief", "Elders"};

        Arrays.sort(names);

        System.out.println("Names in alphabetical order:");

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}


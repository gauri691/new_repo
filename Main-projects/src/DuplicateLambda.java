import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

interface Duplicates {
    Set<Integer> apply(Integer[] array);
}

public class DuplicateLambda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        Integer[] numbers = new Integer[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Duplicates duplicates = (array) -> {
            Set<Integer> uniqueNumbers = new HashSet<>();
            for (Integer num : array) {
                uniqueNumbers.add(num);
            }
            return uniqueNumbers;
        };
        Set<Integer> uniqueNumbers = duplicates.apply(numbers);

        System.out.println("Array with duplicates removed: " + uniqueNumbers);
    }
}


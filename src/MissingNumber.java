import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Read n
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // 2. Calculate the expected sum using the formula: n * (n + 1) / 2
        // We use long to prevent potential overflow for very large n
        long expectedSum = (long) n * (n + 1) / 2;

        // 3. Calculate the actual sum of elements in the array
        long actualSum = 0;
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                actualSum += sc.nextInt();
            }
        }

        // 4. The difference is the missing number
        long missingNumber = expectedSum - actualSum;

        System.out.println(missingNumber);
        
        sc.close();
    }
}
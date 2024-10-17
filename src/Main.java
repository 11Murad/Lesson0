import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write the length of array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + i + ":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            boolean iscompound =iscompound(arr[i]);
            if (!iscompound) {
                System.out.println(arr[i]);
            }
        }
    }

    private static boolean iscompound(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
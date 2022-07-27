import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter a value");
        int x = sc.nextInt();
        System.out.println("Enter index");
        int i = sc.nextInt();
        if (i <= -1 || i >= array.length - 1) {
            System.out.println("Can not insert!");
            return;
        }
        System.out.printf("%-12s", "Old array: ");
        for (int value : array) {
            System.out.printf("%-5d", value);
        }

        System.out.printf("%n%-12s", "New array: ");

        System.arraycopy(array, i, array, i + 1, array.length - 1 - i);
        array[i] = x;

        for (int value : array) {
            System.out.printf("%-5d", value);
        }
    }
}

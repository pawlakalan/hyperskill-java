import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        boolean isOccurs = true;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i < array.length; i ++){
            if (array[i] == n && array[i - 1] == m || array[i] == m && array[i - 1] == n) {
                isOccurs = false;
            }
        }
        System.out.println(isOccurs);
        //System.out.println(Arrays.toString(array));
    }
}
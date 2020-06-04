import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                deque.addFirst(num);
            } else {
                deque.addLast(num);
            }
        }
        for (Integer integer : deque) {
            System.out.println(integer);
        }
    }
}
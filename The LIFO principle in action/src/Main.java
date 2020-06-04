import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            deque.addFirst(scanner.nextInt());
        }
        for (Integer integer : deque) {
            System.out.println(integer);
        }
    }
}
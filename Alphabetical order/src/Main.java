import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        boolean sorted = true;
        for (int i = 1; i < split.length; i++) {
            if ( split[i - 1].compareTo(split[i]) <= 0) {
                sorted = true;
            } else {
                sorted = false;
            }
        }
        System.out.println(sorted);
    }
}
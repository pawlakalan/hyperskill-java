import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        while (scanner.hasNext()) {
            stringList.add(scanner.next());
        }
        System.out.println(stringList);
    }
}
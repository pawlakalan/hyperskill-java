import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        Set<String> strings = new HashSet<>(Set.of(str.split(" ")));
        Set<Integer> integers = new HashSet<>();
        for (String string : strings) {
            integers.add(Integer.parseInt(string));
        }
        return integers;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(n -> (n > 10));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
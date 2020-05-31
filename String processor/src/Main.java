import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        while(true){
            String line = scanner.nextLine();
            if (line.equals(line.toUpperCase())){
                System.out.println("FINISHED");
                break;
            } else {
                System.out.println(line.toUpperCase());
            }
        }
    }
}
import java.util.Scanner;

public class userinput {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your last name?");
        String name = scan.nextLine();
        System.out.println(name);

        scan.close();
    }
}

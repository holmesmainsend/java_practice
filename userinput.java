import java.util.Scanner;

public class userinput {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your last name?");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.printf("Hello %s. How old are you? \n", name);
        int age = scan.nextInt();

        // cleaning up input buffer to prevent program's premature termination
        scan.nextLine();

        System.out.printf("%d is a good age. What is your favorite color? ", age);
        String color = scan.nextLine();

        // \n prevents "%" from appearing in the terminal window
        System.out.printf("%s is a cool color. \n", color);

        scan.close();
    }
}

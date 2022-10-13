import java.util.Scanner;

public class Hello_world {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;

        System.out.print("Input your name\t= ");
        name = input.nextLine();

        System.out.println("\nHello World! My name is " + name);
        input.close();
    }
}
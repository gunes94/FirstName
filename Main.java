import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        System.out.println (firstName.toUpperCase());
        System.out.println(firstName.toLowerCase());
    }
}
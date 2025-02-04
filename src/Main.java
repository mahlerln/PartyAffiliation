import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your party affiliation (D, R, I): ");
       String choice = scanner.nextLine().trim().toUpperCase();


        String response;
        switch (choice) {
            case "D":
                System.out.println("You get a Democratic Donkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get a Independent Man.");
                break;

            default:
                System.out.println("Other.");

}
    }
}
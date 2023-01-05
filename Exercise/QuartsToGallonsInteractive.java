import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of quarts needed: ");
        int quarts = sc.nextInt();
        int gallons = quarts / 4;
        int remainingQuarts = quarts % 4;
        System.out.println("A job that needs " + quarts + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}

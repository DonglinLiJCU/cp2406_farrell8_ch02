import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles: ");
        double nauticalMiles = sc.nextDouble();
        double kilometers = nauticalMiles * 1.852;
        double miles = nauticalMiles * 1.150779;
        System.out.println(nauticalMiles + " nautical miles is " + kilometers + " kilometers and " + miles + " miles.");
    }
}

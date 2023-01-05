public class QuartsToGallons {
    public static void main(String[] args) {
        int quarts = 18;
        int gallons = quarts / 4;
        int remainingQuarts = quarts % 4;
        System.out.println("A job that needs " + quarts + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}

public class Eggs {
    public static void main(String[] args) {
        int eggs = 27;
        int dozens = eggs / 12;
        int remainingEggs = eggs % 12;
        double price = (dozens * 3.25) + (remainingEggs * 0.45);
        System.out.println("You ordered " + eggs + " eggs. That's " + dozens + " dozen at $3.25 per dozen and " + remainingEggs + " loose eggs at 45 cents each for a total of $" + price + ".");
    }
}

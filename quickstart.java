class quickstart {
    public static void main (String[] args) {
        // ONLY WORKS WITH SINGLE QUOTES
        // char latinAE = '\u00C6';
        // System.out.println(latinAE);

        // double number1 = 7.8;
        // int number2 = (int)number1;
        // System.out.println(number2);

        String food = "muffins";
        String flavor = "blueberry";
        int count = 6;
        String farewell = "Goodbye";

        String formattedString = String.format("Today I am eating %s. They are %s flavor. I have %d of them. %s.", 
        food, flavor, count, farewell);

        System.out.println(formattedString);
    }
}
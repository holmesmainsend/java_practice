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
        double temperature = 76.3;
        char degreeSign = '\u00B0';
        String farewell = "Goodbye";

        String formattedString = String.format("Today I am eating %s. They are %s flavor. I have %d of them. It is %.2f%c F today. %s.", 
        food, flavor, count, temperature, degreeSign, farewell);

        System.out.println(formattedString);
    }
}
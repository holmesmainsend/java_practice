public class oop {
    public static void main (String args[]) {
        User youngerUser = new User("Bobbyjoe", 1999);
        PremiumUser richUser = new PremiumUser("Bezos", 1921, 35.99);

        // youngerUser.name = "Bobbyjoe";
        // youngerUser.birthYear = 1999;

        // System.out.printf("Hello %s, our records show that your birth year is %d making your current age approximately %d \n", youngerUser.name, youngerUser.birthYear, youngerUser.currentAge());

        // System.out.printf("Hello %s, our records show that your birth year is %d making your current age approximately %d.\n", youngerUser.getName(), youngerUser.getBirthYear(), youngerUser.currentAge());

        System.out.printf("Hello %s, our records show that your birth year is %d making your current age approximately %d. Your current subscription fee is $%.2f.\n", richUser.getName(), richUser.getBirthYear(), richUser.currentAge(), richUser.getSubscriptionFee());
    }
}
public class PremiumUser extends User {
    private double subscriptionFee;

    PremiumUser(String name, int birthYear, double subscriptionFee) {
        super(name, birthYear);
        this.subscriptionFee = subscriptionFee;
    }

    public double getSubscriptionFee() {
        return this.subscriptionFee;
    }
}
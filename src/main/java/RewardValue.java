public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Private constructor to enforce factory method usage
    private RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    // Factory method for creating RewardValue from cash value
    public static RewardValue fromCashValue(double cashValue) {
        return new RewardValue(cashValue, cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Factory method for creating RewardValue from miles value
    public static RewardValue fromMilesValue(double milesValue) {
        return new RewardValue(milesValue * MILES_TO_CASH_CONVERSION_RATE, milesValue);
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }
}
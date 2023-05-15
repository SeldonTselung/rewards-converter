public class RewardValue {
    private double cash;
    public static final double conversionRate = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }
    private static double convertToCash(int miles) {
        return (double) miles * conversionRate;
    }
    private static int convertToMiles(double cash) {
        return (int) (cash / conversionRate);
    }
    public double getCashValue() {
        return cash;
    }
    public int getMilesValue() {
        return convertToMiles(this.cash);
    }
}

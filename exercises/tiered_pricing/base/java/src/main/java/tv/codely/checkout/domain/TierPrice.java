package tv.codely.checkout.domain;

public class TierPrice {
    private final int minRangeValue;
    private final int maxRangeValue;
    private final int price;

    public TierPrice(int minRangeValue, int maxRangeValue, int price) {
        this.maxRangeValue = maxRangeValue;
        this.price = price;
        this.minRangeValue = minRangeValue;
    }

    public boolean isEligibleFor(int numberOfLicenses) {
        return numberOfLicenses >= minRangeValue && numberOfLicenses <= maxRangeValue;
    }

    public int getPrice() {
        return this.price;
    }
}

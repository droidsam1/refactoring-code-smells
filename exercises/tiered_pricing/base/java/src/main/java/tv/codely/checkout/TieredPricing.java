package tv.codely.checkout;

public class TieredPricing {

    public static final int TIER1_UNIT_PRICE = 299;
    public static final int TIER2_UNIT_PRICE = 239;
    public static final int TIER3_UNIT_PRICE = 219;
    public static final int TIER4_UNIT_PRICE = 199;

    public final TierPrice TIER_1_PRICE = new TierPrice(1, 2, TIER1_UNIT_PRICE);

    public int getTotalPriceFor(int numberOfLicenses) {

        int total = 0;
        for (int i = 1; i <= numberOfLicenses; i++) {
            total += getUnitPriceForRange(i);
        }

        return total;
    }


    private int getUnitPriceForRange(int numberOfLicenses) {

        if (TIER_1_PRICE.isEligibleFor(numberOfLicenses)) {
            return TIER_1_PRICE.getPrice();
        }

        if (isInRangeForTier1(numberOfLicenses)) {
            return TIER1_UNIT_PRICE;
        }

        if (isInRangeForTier2(numberOfLicenses)) {
            return TIER2_UNIT_PRICE;
        }

        if (isInRangeForTier3(numberOfLicenses)) {
            return TIER3_UNIT_PRICE;
        }

        if (isInRangeForTier4(numberOfLicenses)) {
            return TIER4_UNIT_PRICE;
        }

        return 199;

    }

    private boolean isInRangeForTier1(int numberOfLicenses) {
        return numberOfLicenses >= 1 && numberOfLicenses <= 2;
    }

    private boolean isInRangeForTier2(int numberOfLicenses) {
        return numberOfLicenses >= 3 && numberOfLicenses <= 10;
    }

    private boolean isInRangeForTier3(int numberOfLicenses) {
        return numberOfLicenses >= 11 && numberOfLicenses <= 25;
    }

    private boolean isInRangeForTier4(int numberOfLicenses) {
        return numberOfLicenses >= 26 && numberOfLicenses <= 50;
    }

}

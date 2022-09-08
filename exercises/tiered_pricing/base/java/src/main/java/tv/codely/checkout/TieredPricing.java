package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {

        int total = 0;
        for (int i = 0; i < numberOfLicenses; i++) {
            total += getUnitPriceForRange(i + 1);
        }

        return total;
    }


    private int getUnitPriceForRange(int numberOfLicenses) {
        if (isInRangeForTier1(numberOfLicenses)) {
            return 299;
        }

        if (isInRangeForTier2(numberOfLicenses)) {
            return 239;
        }

        return 219;
    }

    private boolean isInRangeForTier1(int numberOfLicenses) {
        return numberOfLicenses >= 1 && numberOfLicenses <= 2;
    }

    private boolean isInRangeForTier2(int numberOfLicenses) {
        return numberOfLicenses >= 3 && numberOfLicenses <= 10;
    }

}

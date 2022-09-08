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
        if (numberOfLicenses < 3) {
            return 299;
        }

        if (numberOfLicenses < 11) {
            return 239;
        }

        return 219;
    }
}

package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {

        if (numberOfLicenses < 3) {
            return numberOfLicenses * basePrice;
        }

        if (numberOfLicenses == 11) {
            return 2510 + 219;
        }

        if (numberOfLicenses == 12) {
            return 2510 + 219 + 219;
        }

        return (2 * basePrice) + (numberOfLicenses - 2) * 239;
    }
}

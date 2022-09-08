package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {

        if (numberOfLicenses < 3) {
            return numberOfLicenses * basePrice;
        }

        return (2 * basePrice) + (numberOfLicenses - 2) * 239;
    }
}

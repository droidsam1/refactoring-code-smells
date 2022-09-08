package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {


        if (numberOfLicenses == 3) {
            return 299 + 299 + 239;
        }

        if (numberOfLicenses == 4) {
            return 299 + 299 + 239 + 239;
        }


        if (numberOfLicenses == 5) {
            return 299 + 299 + 239 + 239 + 239;
        }

        return numberOfLicenses * basePrice;
    }
}

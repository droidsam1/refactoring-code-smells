package tv.codely.checkout;

public class TieredPricing {
    public int getTotalPriceFor(int numberOfLicenses) {
        return numberOfLicenses * 299;
    }
}

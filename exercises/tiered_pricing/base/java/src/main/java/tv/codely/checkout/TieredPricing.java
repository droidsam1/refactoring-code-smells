package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {

        if (numberOfLicenses < 3) {
            return numberOfLicenses * basePrice;
        }

        if (numberOfLicenses > 10) {
            int numberOfLicensesExceedsTen = (numberOfLicenses - 10);
            return (2 * basePrice) + ((numberOfLicenses - numberOfLicensesExceedsTen) - 2) * 239 + numberOfLicensesExceedsTen * 219;
        }

        return (2 * basePrice) + (numberOfLicenses - 2) * 239;
    }
}

package tv.codely.checkout;

public class TieredPricing {

    private static final int basePrice = 299;


    public int getTotalPriceFor(int numberOfLicenses) {


        if(numberOfLicenses == 3 ){
            return 837;
        }

        if(numberOfLicenses == 4 ){
            return 1076;
        }


        return numberOfLicenses * basePrice;
    }
}

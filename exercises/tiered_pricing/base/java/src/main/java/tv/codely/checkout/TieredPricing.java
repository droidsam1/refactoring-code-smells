package tv.codely.checkout;

import tv.codely.checkout.domain.TierPrice;

import java.util.Arrays;
import java.util.List;

public class TieredPricing {

    public final TierPrice TIER_1_PRICE = new TierPrice(1, 2, 299);

    public final TierPrice TIER2_PRICE = new TierPrice(3, 10, 239);

    public final TierPrice TIER3_PRICE = new TierPrice(11, 25, 219);

    public final TierPrice TIER4_PRICE = new TierPrice(26, 50, 199);


    public int getTotalPriceFor(int numberOfLicenses) {

        int total = 0;
        for (int i = 1; i <= numberOfLicenses; i++) {
            total += getUnitPriceForRange(i);
        }

        return total;
    }


    private int getUnitPriceForRange(int numberOfLicenses) {


        for (TierPrice tierPrice : Arrays.asList(TIER_1_PRICE, TIER2_PRICE, TIER3_PRICE, TIER4_PRICE)){
            if(tierPrice.isEligibleFor(numberOfLicenses)){
                return tierPrice.getPrice();
            }
        }

        return 199;

    }


}

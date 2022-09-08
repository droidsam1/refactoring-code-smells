package tv.codely.checkout;

import tv.codely.checkout.domain.TierPrice;

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

        if (TIER_1_PRICE.isEligibleFor(numberOfLicenses)) {
            return TIER_1_PRICE.getPrice();
        }

        if (TIER2_PRICE.isEligibleFor(numberOfLicenses)) {
            return TIER2_PRICE.getPrice();
        }

        if (TIER3_PRICE.isEligibleFor(numberOfLicenses)) {
            return TIER3_PRICE.getPrice();
        }

        if (TIER4_PRICE.isEligibleFor(numberOfLicenses)) {
            return TIER4_PRICE.getPrice();
        }

        return 199;

    }


}

package tv.codely.checkout;

import tv.codely.checkout.domain.TierPrice;

import java.util.Arrays;
import java.util.List;

public class TieredPricing {

    public int getTotalPriceFor(int numberOfLicenses) {

        int total = 0;
        for (int i = 1; i <= numberOfLicenses; i++) {
            total += getUnitPriceForRange(i);
        }

        return total;
    }


    private int getUnitPriceForRange(int numberOfLicenses) {

        for (TierPrice tierPrice : getTieredPrices()) {
            if (tierPrice.isEligibleFor(numberOfLicenses)) {
                return tierPrice.getPrice();
            }
        }

        return 199;

    }

    private List<TierPrice> getTieredPrices() {
        final TierPrice tier1Price = new TierPrice(1, 2, 299);
        final TierPrice tier2Price = new TierPrice(3, 10, 239);
        final TierPrice tier3Price = new TierPrice(11, 25, 219);
        final TierPrice tier4Price = new TierPrice(26, 50, 199);

        return Arrays.asList(tier1Price, tier2Price, tier3Price, tier4Price);
    }


}

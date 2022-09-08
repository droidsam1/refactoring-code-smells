package tv.codely.checkout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TieredPricingShould {

    @Test
    @DisplayName("calculate the price for one license")
	void calculate_the_price_for_one_license() {
        int total = new TieredPricing().getTotalPriceFor(1);
        assertEquals(299, total);
	}

    @Test
    void calculate_the_price_for_two_licenses() {
        int total = new TieredPricing().getTotalPriceFor(2);
        assertEquals(598, total);
    }
}

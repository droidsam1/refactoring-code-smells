package tv.codely.checkout;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void calculate_the_price_for_three_licenses() {
        int total = new TieredPricing().getTotalPriceFor(3);
        assertEquals(837, total);
    }

    @Test
    void calculate_the_price_for_four_licenses() {
        int total = new TieredPricing().getTotalPriceFor(4);
        assertEquals(1076, total);
    }

    @Test
    void calculate_the_price_for_five_licenses() {
        int total = new TieredPricing().getTotalPriceFor(5);
        assertEquals(1315, total);
    }

    @Test
    void calculate_the_price_for_ten_licenses() {
        int total = new TieredPricing().getTotalPriceFor(10);
        assertEquals(2510, total);
    }

    @Test
    void calculate_the_price_for_eleven_licenses() {
        int total = new TieredPricing().getTotalPriceFor(11);
        assertEquals(2729, total);
    }

    @Test
    void calculate_the_price_for_twelve_licenses() {
        int total = new TieredPricing().getTotalPriceFor(12);
        assertEquals(2948, total);
    }

    @Test
    void calculate_the_price_for_twenty_five_licenses() {
        int total = new TieredPricing().getTotalPriceFor(25);
        assertEquals(5795, total);
    }

    @Test
    void calculate_the_price_for_twenty_six_licenses() {
        int total = new TieredPricing().getTotalPriceFor(26);
        assertEquals(5994, total);
    }

    @Test
    void calculate_the_price_for_fifty_one_licenses() {
        int total = new TieredPricing().getTotalPriceFor(51);
        assertEquals(10919, total);
    }
}

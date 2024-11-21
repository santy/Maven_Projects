package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Before
    public void setUp() {
        // Set default values if properties are not present
        if (System.getProperty("country.code") == null) {
            System.setProperty("country.code", "default_code");
        }
        if (System.getProperty("capital") == null) {
            System.setProperty("capital", "default_capital");
        }
        if (System.getProperty("currency") == null) {
            System.setProperty("currency", "default_currency");
        }
    }

    @Test
    public void testPrintEnvironmentDetails() {
        // Store the system properties
        String countryCode = System.getProperty("country.code");
        String capital = System.getProperty("capital");
        String currency = System.getProperty("currency");

        // Add assertions to verify the properties are not null
        assertNotNull("Country code should not be null", countryCode);
        assertNotNull("Capital should not be null", capital);
        assertNotNull("Currency should not be null", currency);

        // Print the values
        System.out.println("Country Code: " + countryCode);
        System.out.println("Capital City: " + capital);
        System.out.println("Currency: " + currency);
    }
}


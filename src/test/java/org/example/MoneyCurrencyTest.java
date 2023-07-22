package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCurrencyTest {

    @Test
    void convertTHBToWON() {
        MoneyCurrency currency = new MoneyCurrency(100000, "WON");
        int NumberOfConverted = currency.convertTHBTo(currency.getType());
        currency.setNumberOfConverted(NumberOfConverted);
        String actualResult = currency.numberOfConvertedToString();
        String expectedResult = "3,372,000 WON";
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
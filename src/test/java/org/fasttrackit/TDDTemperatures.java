package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TDDTemperatures {
    //Test Temperatures class
    @Test
    public void instantiateClass() {
        org.fasttrackit.Exercise1.Temperatures temperatures = new org.fasttrackit.Exercise1.Temperatures(0);
    }

    @Test
    public void callMethod() {
        org.fasttrackit.Exercise1.Temperatures temperatures = new org.fasttrackit.Exercise1.Temperatures(0);
        temperatures.fahreinhetToCelsius(0.0);
    }

    @Test
    @DisplayName("WHEN temperature in grades Celsius is given THEN transform in grades Fahreinhert")
    public void methodCelsiusToFahreinhert() {
        //GIVEN
        double t = 0;
        org.fasttrackit.Exercise1.Temperatures temperatures = new org.fasttrackit.Exercise1.Temperatures(t);

        //WHEN
        double result = temperatures.celsiusToFahreinhert(t) ;

        //THEN
        Assertions.assertThat(result).isEqualTo(32.000000 );
    }

    @Test
    @DisplayName("WHEN temperature in grades Fahreinhert is given THEN transform in grades Celsius")
    public void methodFahreinhertToCelsius() {
        //GIVEN
        double t = 0;
        org.fasttrackit.Exercise1.Temperatures temperatures = new org.fasttrackit.Exercise1.Temperatures(t);

        //WHEN
        double result = temperatures.fahreinhetToCelsius(t) ;

        //THEN
        Assertions.assertThat(result).isEqualTo(-17.77777777777778);
    }

}

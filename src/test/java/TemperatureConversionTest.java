import ex1.TemperatureConversion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemperatureConversionTest {
    TemperatureConversion temperatureConversion;

    @BeforeEach
    void setup() {
        temperatureConversion = new TemperatureConversion();
    }


    @Test
    @DisplayName("WHEN fahrenheitToCelsius is called THEN it will return the converted fahrenheit into celsius")
    void testFahrenheitToCelsius() {

        double celsius = temperatureConversion.fahrenheitToCelsius(50);
        assertThat(celsius).isEqualTo(10);
    }


    @Test
    @DisplayName("WHEN celsiusToFahrenheit is called THEN converted celsius into fahrenheit temperature is returned")
    void testCelsiusToFahrenheit() {

        double fahrenheit = temperatureConversion.celsiusToFahrenheit(10);
        assertThat(fahrenheit).isEqualTo(50);
    }


}

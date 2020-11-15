package ex1;

public class TemperatureConversion {


    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }
}

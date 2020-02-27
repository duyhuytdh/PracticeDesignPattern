package com.weather;

public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 60, 30.4f);
        weatherData.setMeasurements(90, 65, 40.4f);
        weatherData.setMeasurements(85, 50, 20.4f);
    }
}

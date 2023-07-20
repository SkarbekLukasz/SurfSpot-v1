package ls.surfspot.service;

import ls.surfspot.data.CityWeather;
import ls.surfspot.data.DayWeather;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class BestSpotService {
    private final WeatherDataService weatherDataService;
    private final CityListLoader cityListLoader;

    public BestSpotService(WeatherDataService weatherDataService, CityListLoader cityListLoader) {
        this.weatherDataService = weatherDataService;
        this.cityListLoader = cityListLoader;
    }

    public String bestCity(LocalDate date) {
        List<String[]> citiesInput = cityListLoader.loadCities();
        List<CityWeather> allCityData = weatherDataService.getAllWeatherData(citiesInput);
        String cityName = null;
        double cityWindSpd = 0.0;
        double cityTemp = 0.0;
        double surfSpotScore = 0.0;
        for (CityWeather city : allCityData) {
            DayWeather matchingDay = Arrays.stream(city.getData()).filter(el -> el.getDateTime().isEqual(date)).findAny().orElse(null);
            if (matchingDay == null) continue;
            if (!validSurfingWeather(matchingDay.getWindSpd(), matchingDay.getTemp())) continue;
            double citySurfScore = calcWeatherConditions(matchingDay.getWindSpd(), matchingDay.getTemp());
            if(citySurfScore > surfSpotScore) {
                surfSpotScore = citySurfScore;
                cityName = city.getCityName();
                cityWindSpd = matchingDay.getWindSpd();
                cityTemp = matchingDay.getTemp();
            }
        }
        if(cityName != null) {
            return "Best surf spot for given date: " + cityName + ", wind speed: " + cityWindSpd + ", temperature: " + cityTemp;
        } else {
            return "";
        }
    }
    private boolean validSurfingWeather(double windSpd, double temp) {
        return (windSpd > 5 && windSpd < 18) && (temp > 5 && temp < 35);
    }

    private double calcWeatherConditions(double windSpd, double temp) {
        return windSpd * 3 + temp;
    }
}

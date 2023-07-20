package ls.surfspot.service;

import ls.surfspot.data.CityWeather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherDataService {
    @Value("${app.api.key}")
    private String API_KEY;
    private final WebClient client = WebClient.create();

    public List<CityWeather> getAllWeatherData(List<String[]> cityList) {
        List<CityWeather> allWeatherData = new ArrayList<>();
        for(String[] city : cityList) {
            CityWeather fetchedCityWeather = getWeatherData(city[0], city[1]);
            if(fetchedCityWeather != null) {
                allWeatherData.add(fetchedCityWeather);
            }
        }
        return allWeatherData;
    }

    public CityWeather getWeatherData(String cityName, String countryName) {
        return fetchData(cityName, countryName).share().block();
    }

    private Mono<CityWeather> fetchData(String cityName, String countryName) {
        String apiUrl = "http://api.weatherbit.io/v2.0/forecast/daily?key=" + API_KEY + "&lang=en&units=m&days=7";
        return this.client.get().uri(apiUrl + "&city={city}&country={country}", cityName, countryName).accept(MediaType.APPLICATION_JSON).retrieve().onStatus(status -> status.is4xxClientError(), response -> Mono.error(new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR))).bodyToMono(CityWeather.class);
    }

}

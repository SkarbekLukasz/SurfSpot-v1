package ls.surfspot.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class CityWeather {
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("data")
    private DayWeather[] data;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("state_code")
    private int stateCode;
    @JsonProperty("timezone")
    private String timeZone;

    public CityWeather() {
    }

    public CityWeather(String cityName, String countryCode, DayWeather[] data, double lat, double lon, int stateCode, String timeZone) {
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.data = data;
        this.lat = lat;
        this.lon = lon;
        this.stateCode = stateCode;
        this.timeZone = timeZone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DayWeather[] getData() {
        return data;
    }

    public void setData(DayWeather[] data) {
        this.data = data;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public String toString() {
        return "CityWeather{" +
                "cityName='" + cityName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", data=" + Arrays.toString(data) +
                ", lat=" + lat +
                ", lon=" + lon +
                ", stateCode=" + stateCode +
                ", timeZone='" + timeZone + '\'' +
                '}';
    }
}

package ls.surfspot.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class DayWeather {
    @JsonProperty("app_max_temp")
    private double appMaxTmp;
    @JsonProperty("app_min_temp")
    private double appMinTemp;
    @JsonProperty("clouds")
    private int clouds;
    @JsonProperty("clouds_hi")
    private int cloudsHi;
    @JsonProperty("clouds_low")
    private int cloudsLow;
    @JsonProperty("clouds_mid")
    private int cloudsMid;
    @JsonProperty("datetime")
    private LocalDate dateTime;
    @JsonProperty("dewpt")
    private int dewPt;
    @JsonProperty("high_temp")
    private double highTemp;
    @JsonProperty("low_temp")
    private double lowTemp;
    @JsonProperty("max_dhi")
    private int maxDhi;
    @JsonProperty("max_temp")
    private double maxTemp;
    @JsonProperty("min_temp")
    private double minTemp;
    @JsonProperty("moon_phase")
    private double moonPhase;
    @JsonProperty("moon_phase_lunation")
    private double moonPhaseLunation;
    @JsonProperty("moonrise_ts")
    private long moonriseTs;
    @JsonProperty("moonset_ts")
    private long moonsetTs;
    @JsonProperty("ozone")
    private double ozone;
    @JsonProperty("pop")
    private int pop;
    @JsonProperty("precip")
    private int precip;
    @JsonProperty("pres")
    private double pres;
    @JsonProperty("rh")
    private int rh;
    @JsonProperty("slp")
    private double slp;
    @JsonProperty("snow")
    private int snow;
    @JsonProperty("snow_depth")
    private int snowDpth;
    @JsonProperty("sunrise_ts")
    private long sunriseTs;
    @JsonProperty("sunset_ts")
    private long sunsetTs;
    @JsonProperty("temp")
    private double temp;
    @JsonProperty("ts")
    private long ts;
    @JsonProperty("uv")
    private int uv;
    @JsonProperty("valid_date")
    private LocalDate validDate;
    @JsonProperty("vis")
    private double vis;
    @JsonProperty("weather")
    private Weather weather;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_dir")
    private int windDir;
    @JsonProperty("wind_gust_spd")
    private double windGustSpd;
    @JsonProperty("wind_spd")
    private double windSpd;

    public DayWeather() {
    }

    public DayWeather(double appMaxTmp, double appMinTemp, int clouds, int cloudsHi, int cloudsLow, int cloudsMid, LocalDate dateTime, int dewPt, double highTemp, double lowTemp, int maxDhi, double maxTemp, double minTemp, double moonPhase, double moonPhaseLunation, long moonriseTs, long moonsetTs, double ozone, int pop, int precip, double pres, int rh, double slp, int snow, int snowDpth, long sunriseTs, long sunsetTs, double temp, long ts, int uv, LocalDate validDate, double vis, Weather weather, String windCdir, String windCdirFull, int windDir, double windGustSpd, double windSpd) {
        this.appMaxTmp = appMaxTmp;
        this.appMinTemp = appMinTemp;
        this.clouds = clouds;
        this.cloudsHi = cloudsHi;
        this.cloudsLow = cloudsLow;
        this.cloudsMid = cloudsMid;
        this.dateTime = dateTime;
        this.dewPt = dewPt;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.maxDhi = maxDhi;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.moonPhase = moonPhase;
        this.moonPhaseLunation = moonPhaseLunation;
        this.moonriseTs = moonriseTs;
        this.moonsetTs = moonsetTs;
        this.ozone = ozone;
        this.pop = pop;
        this.precip = precip;
        this.pres = pres;
        this.rh = rh;
        this.slp = slp;
        this.snow = snow;
        this.snowDpth = snowDpth;
        this.sunriseTs = sunriseTs;
        this.sunsetTs = sunsetTs;
        this.temp = temp;
        this.ts = ts;
        this.uv = uv;
        this.validDate = validDate;
        this.vis = vis;
        this.weather = weather;
        this.windCdir = windCdir;
        this.windCdirFull = windCdirFull;
        this.windDir = windDir;
        this.windGustSpd = windGustSpd;
        this.windSpd = windSpd;
    }

    public double getAppMaxTmp() {
        return appMaxTmp;
    }

    public void setAppMaxTmp(double appMaxTmp) {
        this.appMaxTmp = appMaxTmp;
    }

    public double getAppMinTemp() {
        return appMinTemp;
    }

    public void setAppMinTemp(double appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public int getCloudsHi() {
        return cloudsHi;
    }

    public void setCloudsHi(int cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    public int getCloudsLow() {
        return cloudsLow;
    }

    public void setCloudsLow(int cloudsLow) {
        this.cloudsLow = cloudsLow;
    }

    public int getCloudsMid() {
        return cloudsMid;
    }

    public void setCloudsMid(int cloudsMid) {
        this.cloudsMid = cloudsMid;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public int getDewPt() {
        return dewPt;
    }

    public void setDewPt(int dewPt) {
        this.dewPt = dewPt;
    }

    public double getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(double highTemp) {
        this.highTemp = highTemp;
    }

    public double getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(double lowTemp) {
        this.lowTemp = lowTemp;
    }

    public int getMaxDhi() {
        return maxDhi;
    }

    public void setMaxDhi(int maxDhi) {
        this.maxDhi = maxDhi;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public double getMoonPhaseLunation() {
        return moonPhaseLunation;
    }

    public void setMoonPhaseLunation(double moonPhaseLunation) {
        this.moonPhaseLunation = moonPhaseLunation;
    }

    public long getMoonriseTs() {
        return moonriseTs;
    }

    public void setMoonriseTs(long moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    public long getMoonsetTs() {
        return moonsetTs;
    }

    public void setMoonsetTs(long moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getPrecip() {
        return precip;
    }

    public void setPrecip(int precip) {
        this.precip = precip;
    }

    public double getPres() {
        return pres;
    }

    public void setPres(double pres) {
        this.pres = pres;
    }

    public int getRh() {
        return rh;
    }

    public void setRh(int rh) {
        this.rh = rh;
    }

    public double getSlp() {
        return slp;
    }

    public void setSlp(double slp) {
        this.slp = slp;
    }

    public int getSnow() {
        return snow;
    }

    public void setSnow(int snow) {
        this.snow = snow;
    }

    public int getSnowDpth() {
        return snowDpth;
    }

    public void setSnowDpth(int snowDpth) {
        this.snowDpth = snowDpth;
    }

    public long getSunriseTs() {
        return sunriseTs;
    }

    public void setSunriseTs(long sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    public long getSunsetTs() {
        return sunsetTs;
    }

    public void setSunsetTs(long sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public LocalDate getValidDate() {
        return validDate;
    }

    public void setValidDate(LocalDate validDate) {
        this.validDate = validDate;
    }

    public double getVis() {
        return vis;
    }

    public void setVis(double vis) {
        this.vis = vis;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public int getWindDir() {
        return windDir;
    }

    public void setWindDir(int windDir) {
        this.windDir = windDir;
    }

    public double getWindGustSpd() {
        return windGustSpd;
    }

    public void setWindGustSpd(double windGustSpd) {
        this.windGustSpd = windGustSpd;
    }

    public double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(double windSpd) {
        this.windSpd = windSpd;
    }
}

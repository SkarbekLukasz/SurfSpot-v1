package ls.surfspot.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("description")
    private String description;
    @JsonProperty("code")
    private int code;

    public Weather() {
    }

    public Weather(String icon, String description, int code) {
        this.icon = icon;
        this.description = description;
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

package com.tytanrock.homestatus.informationslice;

@SuppressWarnings("unused")
public class TemperatureInformationSlice extends BaseInformationSlice {
    private float temperatureC;
    private float humidityPercent;

    public float getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(float temperatureC) {
        this.temperatureC = temperatureC;
    }

    public float getHumidityPercent() {
        return humidityPercent;
    }

    public void setHumidityPercent(float humidityPercent) {
        this.humidityPercent = humidityPercent;
    }
}

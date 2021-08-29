package com.tytanrock.homestatus.sql.temphumiditydevice;

import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
public class TempHumidityDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private float temperature;
    private float relativeHumidity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(float relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }
}

package com.tytanrock.homestatus.restcontrollers;

@SuppressWarnings("unused")
public class HomeInformationSlice {
    private String deviceName;
    private String deviceLocation;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }
}

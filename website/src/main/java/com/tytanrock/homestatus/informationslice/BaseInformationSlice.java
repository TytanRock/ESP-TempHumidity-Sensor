package com.tytanrock.homestatus.informationslice;

import com.tytanrock.homestatus.common.DeviceType;

@SuppressWarnings("unused")
public class BaseInformationSlice {
    private String deviceName;
    private String deviceLocation;
    private DeviceType deviceType;

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

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }
}

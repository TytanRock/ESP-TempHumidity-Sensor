package com.tytanrock.homestatus.sql.basedevice;

import com.tytanrock.homestatus.common.DeviceType;
import javax.persistence.*;

@SuppressWarnings("unused")
@Entity
@Table(name = "BaseDevice")
public class BaseDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String deviceName;
    private String deviceLocation;
    private DeviceType deviceType;
    private Integer childDeviceReference;

    public BaseDevice(String deviceName, String deviceLocation, DeviceType deviceType) {
        this.deviceName = deviceName;
        this.deviceLocation = deviceLocation;
        this.deviceType = deviceType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getChildDeviceReference() {
        return childDeviceReference;
    }

    public void setChildDeviceReference(Integer childDeviceReference) {
        this.childDeviceReference = childDeviceReference;
    }
}

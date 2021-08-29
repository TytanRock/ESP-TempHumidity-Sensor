package com.tytanrock.homestatus.sql.basedevice;

import org.springframework.data.repository.CrudRepository;

public interface BaseDeviceRepository extends CrudRepository<BaseDevice, Integer> {
    BaseDevice findByDeviceName(String deviceName);
}

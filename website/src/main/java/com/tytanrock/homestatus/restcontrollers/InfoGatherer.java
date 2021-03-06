package com.tytanrock.homestatus.restcontrollers;

import com.tytanrock.homestatus.informationslice.BaseInformationSlice;
import com.tytanrock.homestatus.sql.basedevice.BaseDevice;
import com.tytanrock.homestatus.sql.basedevice.BaseDeviceRepository;
import com.tytanrock.homestatus.sql.temphumiditydevice.TempHumidityDevice;
import com.tytanrock.homestatus.sql.temphumiditydevice.TempHumidityDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class InfoGatherer {

    @Autowired private BaseDeviceRepository baseDeviceRepository;
    @Autowired private TempHumidityDeviceRepository tempHumidityDeviceRepository;

    @PostMapping("/newBaseDevice")
    public ResponseEntity<String> addBaseDevice(@RequestBody BaseInformationSlice info, Model model) {
        try {
            BaseDevice newDevice =
                    new BaseDevice(info.getDeviceName(), info.getDeviceLocation(), info.getDeviceType());
            switch (info.getDeviceType()) {
                case TempHumiditySensor:
                    TempHumidityDevice newSpecific = new TempHumidityDevice();
                    tempHumidityDeviceRepository.save(newSpecific);
                    newDevice.setChildDeviceReference(newSpecific.getId());
                    break;
            }
            baseDeviceRepository.save(newDevice);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.toString());
        }

        return ResponseEntity.ok().body("Added device");
    }

    @PostMapping("/sensor")
    public ResponseEntity<String> sendInformation(
            @RequestBody BaseInformationSlice info, Model model) {

        BaseDevice device = baseDeviceRepository.findByDeviceName(info.getDeviceName());
        switch (info.getDeviceType()) {
            case TempHumiditySensor:
                {
                    TempHumidityDevice specificDevice =
                            tempHumidityDeviceRepository.findById(device.getChildDeviceReference()).get();
                }
                break;
        }

        return ResponseEntity.ok().body("I didn't do anything with this");
    }
}

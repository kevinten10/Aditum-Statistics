package com.ten.aditum.statistics.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 展示设备的访问量（访问量最高的X个设备）
 */
@Data
@Accessors(chain = true)
public class BasicDeviceCountData {

    private List<DeviceCount> deviceCountList;

    @Data
    public static class DeviceCount {
        private String imei;
        private String deviceName;
        private int deviceCount;
    }
}

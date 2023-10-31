package com.ok_http.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeviceInfoModel {
    @JsonProperty("DeviceInfo.UpTime")
    public String deviceUpTime;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.PreSharedKey.1.KeyPassphrase")
    public String wlanKey1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.PreSharedKey.1.KeyPassphrase")
    public String wlanKey2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.SSID")
    public String ssid1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.SSID")
    public String ssid2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.RadioEnabled")
    public String radioEnabled1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.RadioEnabled")
    public String radioEnabled2;

    @JsonProperty("DeviceInfo.SoftwareVersion")
    public String softwareVersion;

    @JsonProperty("DeviceInfo.ProductClass")
    public String productClass;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.IPInterface.1.IPInterfaceIPAddress")
    public String ipAddress;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.AutoChannelEnable")
    public String autoChannelEnable1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.Channel")
    public String channel1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.AutoChannelEnable")
    public String autoChannelEnable2;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.Channel")
    public String channel2;

    @JsonProperty("X_FPT_RebootTimer.Enable")
    public String rebootTimerEnable;

    @JsonProperty("X_FPT_RebootTimer.Time")
    public String rebootTimerTime;

    @JsonProperty("X_FPT_RebootTimer.Mon")
    public String rebootTimerMon;

    @JsonProperty("X_FPT_RebootTimer.Tue")
    public String rebootTimerTue;

    @JsonProperty("X_FPT_RebootTimer.Wed")
    public String rebootTimerWed;

    @JsonProperty("X_FPT_RebootTimer.Thu")
    public String rebootTimerThu;

    @JsonProperty("X_FPT_RebootTimer.Fri")
    public String rebootTimerFri;

    @JsonProperty("X_FPT_RebootTimer.Sat")
    public String rebootTimerSat;

    @JsonProperty("X_FPT_RebootTimer.Sun")
    public String rebootTimerSun;

    @JsonProperty("X_FPT_WiFiTimer.Enable")
    public String wifiTimerEnable;

    @JsonProperty("X_FPT_WiFiTimer.StartTime")
    public String wifiTimerStartTime;

    @JsonProperty("X_FPT_WiFiTimer.EndTime")
    public String wifiTimerEndTime;

    @JsonProperty("X_FPT_WiFiTimer.Mon")
    public String wifiTimerMon;

    @JsonProperty("X_FPT_WiFiTimer.Tue")
    public String wifiTimerTue;

    @JsonProperty("X_FPT_WiFiTimer.Wed")
    public String wifiTimerWed;

    @JsonProperty("X_FPT_WiFiTimer.Thu")
    public String wifiTimerThu;

    @JsonProperty("X_FPT_WiFiTimer.Fri")
    public String wifiTimerFri;

    @JsonProperty("X_FPT_WiFiTimer.Sat")
    public String wifiTimerSat;

    @JsonProperty("X_FPT_WiFiTimer.Sun")
    public String wifiTimerSun;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.Standard")
    public String standard1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.X_CU_Bandwidth")
    public String bandwidth1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.Standard")
    public String standard2;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.X_CU_Bandwidth")
    public String bandwidth2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.WPAEncryptionModes")
    public String wpaEncryptionModes1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.WPAEncryptionModes")
    public String wpaEncryptionModes2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.BeaconType")
    public String beaconType1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.BeaconType")
    public String beaconType2;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DHCPServerEnable")
    public String dhcpServerEnable;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DNSServers")
    public String lanHostConfigManagementDNSServers;

    @JsonProperty("TraceRouteDiagnostics.DiagnosticsState")
    public String traceRouteDiagnosticsState;

    @JsonProperty("TraceRouteDiagnostics.Interface")
    public String traceRouteDiagnosticsInterface;

    @JsonProperty("TraceRouteDiagnostics.Host")
    public String traceRouteDiagnosticsHost;

    @JsonProperty("TraceRouteDiagnostics.NumberOfTries")
    public String traceRouteDiagnosticsNumberOfTries;

    @JsonProperty("TraceRouteDiagnostics.Timeout")
    public String traceRouteDiagnosticsTimeout;

    @JsonProperty("TraceRouteDiagnostics.DataBlockSize")
    public String traceRouteDiagnosticsDataBlockSize;

    @JsonProperty("TraceRouteDiagnostics.DSCP")
    public String traceRouteDiagnosticsDSCP;

    @JsonProperty("TraceRouteDiagnostics.MaxHopCount")
    public String traceRouteDiagnosticsMaxHopCount;

    @JsonProperty("TraceRouteDiagnostics.ResponseTime")
    public String traceRouteDiagnosticsResponseTime;

    @JsonProperty("TraceRouteDiagnostics.RouteHopsNumberOfEntries")
    public String traceRouteDiagnosticsRouteHopsNumberOfEntries;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.MinAddress")
    public String minAddress;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.MaxAddress")
    public String maxAddress;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DHCPLeaseTime")
    public String dhcpLeaseTime;

    @JsonProperty("WANDevice.1.WANConnectionDevice.1.WANPPPConnection.1.ExternalIPAddress")
    public String externalIPAddress;

    @JsonProperty("WANDevice.1.WANConnectionDevice.1.WANPPPConnection.1.DefaultGateway")
    public String defaultGateway;

    @JsonProperty("IPPingDiagnostics.DiagnosticsState")
    public String ipPingDiagnosticsState;

    @JsonProperty("IPPingDiagnostics.Interface")
    public String ipPingDiagnosticsInterface;

    @JsonProperty("IPPingDiagnostics.Host")
    public String ipPingDiagnosticsHost;

    @JsonProperty("IPPingDiagnostics.NumberOfRepetitions")
    public String ipPingDiagnosticsNumberOfRepetitions;

    @JsonProperty("IPPingDiagnostics.Timeout")
    public String ipPingDiagnosticsTimeout;

    @JsonProperty("IPPingDiagnostics.DataBlockSize")
    public String ipPingDiagnosticsDataBlockSize;

    @JsonProperty("IPPingDiagnostics.DSCP")
    public String ipPingDiagnosticsDSCP;

    @JsonProperty("IPPingDiagnostics.SuccessCount")
    public String ipPingDiagnosticsSuccessCount;

    @JsonProperty("IPPingDiagnostics.FailureCount")
    public String ipPingDiagnosticsFailureCount;

    @JsonProperty("IPPingDiagnostics.AverageResponseTime")
    public String ipPingDiagnosticsAverageResponseTime;

    @JsonProperty("IPPingDiagnostics.MinimumResponseTime")
    public String ipPingDiagnosticsMinimumResponseTime;

    @JsonProperty("IPPingDiagnostics.MaximumResponseTime")
    public String ipPingDiagnosticsMaximumResponseTime;

    @JsonProperty("DNSServers")
    public String dnsServers;

    @JsonProperty("Memory")
    public String memory;

    @JsonProperty("CPUUsage")
    public String cpuUsage;
}

package com.ok_http.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MergeObjectModel {

    @JsonProperty("ObjID")
    private int objID;

    @JsonProperty("ContractNum")
    private String contractNum;

    @JsonProperty("ContractDate")
    private String contractDate;

    @JsonProperty("CustomerName")
    private String customerName;

    @JsonProperty("Passport")
    private int passport;

    @JsonProperty("CompanyName")
    private String companyName;

    @JsonProperty("CertificateNumber")
    private String certificateNumber;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("BillTo")
    private String billTo;

    @JsonProperty("ContractType")
    private int contractType;

    @JsonProperty("ContractTypeName")
    private String contractTypeName;

    @JsonProperty("ContractStatus")
    private int contractStatus;

    @JsonProperty("ContractStatusName")
    private String contractStatusName;

    @JsonProperty("LoginName")
    private String loginName;

    @JsonProperty("Email")
    private String email;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("LocationID")
    private int locationID;

    @JsonProperty("UserName")
    private String userName;

    @JsonProperty("BranchCode")
    private int branchCode;

    @JsonProperty("Suspend_Date")
    private String suspendDate;

    @JsonProperty("Suspend_Reason")
    private String suspendReason;

    @JsonProperty("ObjAddress")
    private String objAddress;

    @JsonProperty("LegalEntityName")
    private String legalEntityName;

    @JsonProperty("PartnerName")
    private String partnerName;

    @JsonProperty("EocName")
    private String eocName;

    @JsonProperty("FeeLocalType")
    private String feeLocalType;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Amount")
    private int amount;

    @JsonProperty("Code")
    private int code;

    @JsonProperty("Description")
    private int description;

    @JsonProperty("Data")
    private List<MacContractModel> macContract;

    @JsonProperty("FunctionInfo")
    private String functionInfo;

    @JsonProperty("DeviceInfo.UpTime")
    private String upTime;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.PreSharedKey.1.KeyPassphrase")
    private String wlanKey1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.PreSharedKey.1.KeyPassphrase")
    private String wlanKey2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.SSID")
    private String ssid1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.SSID")
    private String ssid2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.RadioEnabled")
    private String radioEnabled1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.RadioEnabled")
    private String radioEnabled2;

    @JsonProperty("DeviceInfo.SoftwareVersion")
    private String softwareVersion;

    @JsonProperty("DeviceInfo.ProductClass")
    private String productClass;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.IPInterface.1.IPInterfaceIPAddress")
    private String ipAddress;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.AutoChannelEnable")
    private String autoChannelEnable1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.Channel")
    private String channel1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.AutoChannelEnable")
    private String autoChannelEnable2;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.Channel")
    private String channel2;

    @JsonProperty("X_FPT_RebootTimer.Enable")
    private String rebootTimerEnable;

    @JsonProperty("X_FPT_RebootTimer.Time")
    private String rebootTimerTime;

    @JsonProperty("X_FPT_RebootTimer.Mon")
    private String rebootTimerMon;

    @JsonProperty("X_FPT_RebootTimer.Tue")
    private String rebootTimerTue;

    @JsonProperty("X_FPT_RebootTimer.Wed")
    private String rebootTimerWed;

    @JsonProperty("X_FPT_RebootTimer.Thu")
    private String rebootTimerThu;

    @JsonProperty("X_FPT_RebootTimer.Fri")
    private String rebootTimerFri;

    @JsonProperty("X_FPT_RebootTimer.Sat")
    private String rebootTimerSat;

    @JsonProperty("X_FPT_RebootTimer.Sun")
    private String rebootTimerSun;

    @JsonProperty("X_FPT_WiFiTimer.Enable")
    private String wifiTimerEnable;

    @JsonProperty("X_FPT_WiFiTimer.StartTime")
    private String wifiTimerStartTime;

    @JsonProperty("X_FPT_WiFiTimer.EndTime")
    private String wifiTimerEndTime;

    @JsonProperty("X_FPT_WiFiTimer.Mon")
    private String wifiTimerMon;

    @JsonProperty("X_FPT_WiFiTimer.Tue")
    private String wifiTimerTue;

    @JsonProperty("X_FPT_WiFiTimer.Wed")
    private String wifiTimerWed;

    @JsonProperty("X_FPT_WiFiTimer.Thu")
    private String wifiTimerThu;

    @JsonProperty("X_FPT_WiFiTimer.Fri")
    private String wifiTimerFri;

    @JsonProperty("X_FPT_WiFiTimer.Sat")
    private String wifiTimerSat;

    @JsonProperty("X_FPT_WiFiTimer.Sun")
    private String wifiTimerSun;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.Standard")
    private String standard1;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.X_CU_Bandwidth")
    private String bandwidth1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.Standard")
    private String standard2;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.X_CU_Bandwidth")
    private String bandwidth2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.WPAEncryptionModes")
    private String wpaEncryptionModes1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.WPAEncryptionModes")
    private String wpaEncryptionModes2;

    @JsonProperty("LANDevice.1.WLANConfiguration.1.BeaconType")
    private String beaconType1;

    @JsonProperty("LANDevice.1.WLANConfiguration.5.BeaconType")
    private String beaconType2;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DHCPServerEnable")
    private String dhcpServerEnable;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DNSServers")
    private String lanHostConfigManagementDNSServers;

    @JsonProperty("TraceRouteDiagnostics.DiagnosticsState")
    private String traceRouteDiagnosticsState;

    @JsonProperty("TraceRouteDiagnostics.Interface")
    private String traceRouteDiagnosticsInterface;

    @JsonProperty("TraceRouteDiagnostics.Host")
    private String traceRouteDiagnosticsHost;

    @JsonProperty("TraceRouteDiagnostics.NumberOfTries")
    private String traceRouteDiagnosticsNumberOfTries;

    @JsonProperty("TraceRouteDiagnostics.Timeout")
    private String traceRouteDiagnosticsTimeout;

    @JsonProperty("TraceRouteDiagnostics.DataBlockSize")
    private String traceRouteDiagnosticsDataBlockSize;

    @JsonProperty("TraceRouteDiagnostics.DSCP")
    private String traceRouteDiagnosticsDSCP;

    @JsonProperty("TraceRouteDiagnostics.MaxHopCount")
    private String traceRouteDiagnosticsMaxHopCount;

    @JsonProperty("TraceRouteDiagnostics.ResponseTime")
    private String traceRouteDiagnosticsResponseTime;

    @JsonProperty("TraceRouteDiagnostics.RouteHopsNumberOfEntries")
    private String traceRouteDiagnosticsRouteHopsNumberOfEntries;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.MinAddress")
    private String minAddress;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.MaxAddress")
    private String maxAddress;

    @JsonProperty("LANDevice.1.LANHostConfigManagement.DHCPLeaseTime")
    private String dhcpLeaseTime;

    @JsonProperty("WANDevice.1.WANConnectionDevice.1.WANPPPConnection.1.ExternalIPAddress")
    private String externalIPAddress;

    @JsonProperty("WANDevice.1.WANConnectionDevice.1.WANPPPConnection.1.DefaultGateway")
    private String defaultGateway;

    @JsonProperty("IPPingDiagnostics.DiagnosticsState")
    private String ipPingDiagnosticsState;

    @JsonProperty("IPPingDiagnostics.Interface")
    private String ipPingDiagnosticsInterface;

    @JsonProperty("IPPingDiagnostics.Host")
    private String ipPingDiagnosticsHost;

    @JsonProperty("IPPingDiagnostics.NumberOfRepetitions")
    private String ipPingDiagnosticsNumberOfRepetitions;

    @JsonProperty("IPPingDiagnostics.Timeout")
    private String ipPingDiagnosticsTimeout;

    @JsonProperty("IPPingDiagnostics.DataBlockSize")
    private String ipPingDiagnosticsDataBlockSize;

    @JsonProperty("IPPingDiagnostics.DSCP")
    private String ipPingDiagnosticsDSCP;

    @JsonProperty("IPPingDiagnostics.SuccessCount")
    private String ipPingDiagnosticsSuccessCount;

    @JsonProperty("IPPingDiagnostics.FailureCount")
    private String ipPingDiagnosticsFailureCount;

    @JsonProperty("IPPingDiagnostics.AverageResponseTime")
    private String ipPingDiagnosticsAverageResponseTime;

    @JsonProperty("IPPingDiagnostics.MinimumResponseTime")
    private String ipPingDiagnosticsMinimumResponseTime;

    @JsonProperty("IPPingDiagnostics.MaximumResponseTime")
    private String ipPingDiagnosticsMaximumResponseTime;

    @JsonProperty("DNSServers")
    private String dnsServers;

    @JsonProperty("Memory")
    private String memory;

    @JsonProperty("CPUUsage")
    private String cpuUsage;
}

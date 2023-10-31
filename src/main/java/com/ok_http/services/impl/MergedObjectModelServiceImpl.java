package com.ok_http.services.impl;

import org.springframework.stereotype.Service;

import com.ok_http.dto.MacDTO;
import com.ok_http.models.ContractModel;
import com.ok_http.models.DeviceInfoModel;
import com.ok_http.models.MergeObjectModel;
import com.ok_http.services.MergedObjectModelService;

@Service
public class MergedObjectModelServiceImpl implements MergedObjectModelService {
    @Override
    public MergeObjectModel createMergeObjectModel(ContractModel contract, MacDTO mac, DeviceInfoModel deviceInfo) {
        MergeObjectModel mergeObjectModel = new MergeObjectModel();

        mergeObjectModel.setObjID(getValueOrDefault(contract.getObjID()));
        mergeObjectModel.setContractNum(getValueOrDefault(contract.getContractNum()));
        mergeObjectModel.setContractDate(getValueOrDefault(contract.getContractDate()));
        mergeObjectModel.setCustomerName(getValueOrDefault(contract.getCustomerName()));
        mergeObjectModel.setPassport(getValueOrDefault(contract.getPassport()));
        mergeObjectModel.setCompanyName(getValueOrDefault(contract.getCompanyName()));
        mergeObjectModel.setCertificateNumber(getValueOrDefault(contract.getCertificateNumber()));
        mergeObjectModel.setAddress(getValueOrDefault(contract.getAddress()));
        mergeObjectModel.setBillTo(getValueOrDefault(contract.getBillTo()));
        mergeObjectModel.setContractType(getValueOrDefault(contract.getContractType()));
        mergeObjectModel.setContractTypeName(getValueOrDefault(contract.getContractTypeName()));
        mergeObjectModel.setContractStatus(getValueOrDefault(contract.getContractStatus()));
        mergeObjectModel.setContractStatusName(getValueOrDefault(contract.getContractStatusName()));
        mergeObjectModel.setLoginName(getValueOrDefault(contract.getLoginName()));
        mergeObjectModel.setEmail(getValueOrDefault(contract.getEmail()));
        mergeObjectModel.setLocation(getValueOrDefault(contract.getLocation()));
        mergeObjectModel.setRegion(getValueOrDefault(contract.getRegion()));
        mergeObjectModel.setLocationID(getValueOrDefault(contract.getLocationID()));
        mergeObjectModel.setUserName(getValueOrDefault(contract.getUserName()));
        mergeObjectModel.setBranchCode(getValueOrDefault(contract.getBranchCode()));
        mergeObjectModel.setSuspendDate(getValueOrDefault(contract.getSuspendDate()));
        mergeObjectModel.setSuspendReason(getValueOrDefault(contract.getSuspendReason()));
        mergeObjectModel.setObjAddress(getValueOrDefault(contract.getObjAddress()));
        mergeObjectModel.setLegalEntityName(getValueOrDefault(contract.getLegalEntityName()));
        mergeObjectModel.setPartnerName(getValueOrDefault(contract.getPartnerName()));
        mergeObjectModel.setEocName(getValueOrDefault(contract.getEocName()));
        mergeObjectModel.setFeeLocalType(getValueOrDefault(contract.getFeeLocalType()));

        mergeObjectModel.setStatus(getValueOrDefault(mac.getStatus()));
        mergeObjectModel.setAmount(getValueOrDefault(mac.getAmount()));
        mergeObjectModel.setCode(getValueOrDefault(mac.getCode()));
        mergeObjectModel.setDescription(getValueOrDefault(mac.getDescription()));
        mergeObjectModel.setMacContract(getValueOrDefault(mac.getMacContract()));
        mergeObjectModel.setFunctionInfo(getValueOrDefault(mac.getFunctionInfo()));

        mergeObjectModel.setUpTime(getValueOrDefault(deviceInfo.deviceUpTime));
        mergeObjectModel.setWlanKey1(getValueOrDefault(deviceInfo.wlanKey1));
        mergeObjectModel.setWlanKey2(getValueOrDefault(deviceInfo.wlanKey2));
        mergeObjectModel.setSsid1(getValueOrDefault(deviceInfo.ssid1));
        mergeObjectModel.setSsid2(getValueOrDefault(deviceInfo.ssid2));
        mergeObjectModel.setRadioEnabled1(getValueOrDefault(deviceInfo.radioEnabled1));
        mergeObjectModel.setRadioEnabled2(getValueOrDefault(deviceInfo.radioEnabled2));
        mergeObjectModel.setSoftwareVersion(getValueOrDefault(deviceInfo.softwareVersion));
        mergeObjectModel.setProductClass(getValueOrDefault(deviceInfo.productClass));
        mergeObjectModel.setIpAddress(getValueOrDefault(deviceInfo.ipAddress));
        mergeObjectModel.setAutoChannelEnable1(getValueOrDefault(deviceInfo.autoChannelEnable1));
        mergeObjectModel.setChannel1(getValueOrDefault(deviceInfo.channel1));
        mergeObjectModel.setAutoChannelEnable2(getValueOrDefault(deviceInfo.autoChannelEnable2));
        mergeObjectModel.setChannel2(getValueOrDefault(deviceInfo.channel2));
        mergeObjectModel.setRebootTimerEnable(getValueOrDefault(deviceInfo.rebootTimerEnable));
        mergeObjectModel.setRebootTimerTime(getValueOrDefault(deviceInfo.rebootTimerTime));
        mergeObjectModel.setRebootTimerMon(getValueOrDefault(deviceInfo.rebootTimerMon));
        mergeObjectModel.setRebootTimerTue(getValueOrDefault(deviceInfo.rebootTimerTue));
        mergeObjectModel.setRebootTimerWed(getValueOrDefault(deviceInfo.rebootTimerWed));
        mergeObjectModel.setRebootTimerThu(getValueOrDefault(deviceInfo.rebootTimerThu));
        mergeObjectModel.setRebootTimerFri(getValueOrDefault(deviceInfo.rebootTimerFri));
        mergeObjectModel.setRebootTimerSat(getValueOrDefault(deviceInfo.rebootTimerSat));
        mergeObjectModel.setRebootTimerSun(getValueOrDefault(deviceInfo.rebootTimerSun));
        mergeObjectModel.setWifiTimerEnable(getValueOrDefault(deviceInfo.wifiTimerEnable));
        mergeObjectModel.setWifiTimerStartTime(getValueOrDefault(deviceInfo.wifiTimerStartTime));
        mergeObjectModel.setWifiTimerEndTime(getValueOrDefault(deviceInfo.wifiTimerEndTime));
        mergeObjectModel.setWifiTimerMon(getValueOrDefault(deviceInfo.wifiTimerMon));
        mergeObjectModel.setWifiTimerTue(getValueOrDefault(deviceInfo.wifiTimerTue));
        mergeObjectModel.setWifiTimerWed(getValueOrDefault(deviceInfo.wifiTimerWed));
        mergeObjectModel.setWifiTimerThu(getValueOrDefault(deviceInfo.wifiTimerThu));
        mergeObjectModel.setWifiTimerFri(getValueOrDefault(deviceInfo.wifiTimerFri));
        mergeObjectModel.setWifiTimerSat(getValueOrDefault(deviceInfo.wifiTimerSat));
        mergeObjectModel.setWifiTimerSun(getValueOrDefault(deviceInfo.wifiTimerSun));
        mergeObjectModel.setStandard1(getValueOrDefault(deviceInfo.standard1));
        mergeObjectModel.setBandwidth1(getValueOrDefault(deviceInfo.bandwidth1));
        mergeObjectModel.setStandard2(getValueOrDefault(deviceInfo.standard2));
        mergeObjectModel.setBandwidth2(getValueOrDefault(deviceInfo.bandwidth2));
        mergeObjectModel.setWpaEncryptionModes1(getValueOrDefault(deviceInfo.wpaEncryptionModes1));
        mergeObjectModel.setWpaEncryptionModes2(getValueOrDefault(deviceInfo.wpaEncryptionModes2));
        mergeObjectModel.setBeaconType1(getValueOrDefault(deviceInfo.beaconType1));
        mergeObjectModel.setBeaconType2(getValueOrDefault(deviceInfo.beaconType2));
        mergeObjectModel.setDhcpServerEnable(getValueOrDefault(deviceInfo.dhcpServerEnable));
        mergeObjectModel
                .setLanHostConfigManagementDNSServers(getValueOrDefault(deviceInfo.lanHostConfigManagementDNSServers));
        mergeObjectModel.setTraceRouteDiagnosticsState(getValueOrDefault(deviceInfo.traceRouteDiagnosticsState));
        mergeObjectModel
                .setTraceRouteDiagnosticsInterface(getValueOrDefault(deviceInfo.traceRouteDiagnosticsInterface));
        mergeObjectModel.setTraceRouteDiagnosticsHost(getValueOrDefault(deviceInfo.traceRouteDiagnosticsHost));
        mergeObjectModel.setTraceRouteDiagnosticsNumberOfTries(
                getValueOrDefault(deviceInfo.traceRouteDiagnosticsNumberOfTries));
        mergeObjectModel.setTraceRouteDiagnosticsTimeout(getValueOrDefault(deviceInfo.traceRouteDiagnosticsTimeout));
        mergeObjectModel.setTraceRouteDiagnosticsDataBlockSize(
                getValueOrDefault(deviceInfo.traceRouteDiagnosticsDataBlockSize));
        mergeObjectModel.setTraceRouteDiagnosticsDSCP(getValueOrDefault(deviceInfo.traceRouteDiagnosticsDSCP));
        mergeObjectModel
                .setTraceRouteDiagnosticsMaxHopCount(getValueOrDefault(deviceInfo.traceRouteDiagnosticsMaxHopCount));
        mergeObjectModel
                .setTraceRouteDiagnosticsResponseTime(getValueOrDefault(deviceInfo.traceRouteDiagnosticsResponseTime));
        mergeObjectModel.setTraceRouteDiagnosticsRouteHopsNumberOfEntries(
                getValueOrDefault(deviceInfo.traceRouteDiagnosticsRouteHopsNumberOfEntries));
        mergeObjectModel.setMinAddress(getValueOrDefault(deviceInfo.minAddress));
        mergeObjectModel.setMaxAddress(getValueOrDefault(deviceInfo.maxAddress));
        mergeObjectModel.setDhcpLeaseTime(getValueOrDefault(deviceInfo.dhcpLeaseTime));
        mergeObjectModel.setExternalIPAddress(getValueOrDefault(deviceInfo.externalIPAddress));
        mergeObjectModel.setDefaultGateway(getValueOrDefault(deviceInfo.defaultGateway));
        mergeObjectModel.setIpPingDiagnosticsState(getValueOrDefault(deviceInfo.ipPingDiagnosticsState));
        mergeObjectModel.setIpPingDiagnosticsInterface(getValueOrDefault(deviceInfo.ipPingDiagnosticsInterface));
        mergeObjectModel.setIpPingDiagnosticsHost(getValueOrDefault(deviceInfo.ipPingDiagnosticsHost));
        mergeObjectModel.setIpPingDiagnosticsNumberOfRepetitions(
                getValueOrDefault(deviceInfo.ipPingDiagnosticsNumberOfRepetitions));
        mergeObjectModel.setIpPingDiagnosticsTimeout(getValueOrDefault(deviceInfo.ipPingDiagnosticsTimeout));
        mergeObjectModel
                .setIpPingDiagnosticsDataBlockSize(getValueOrDefault(deviceInfo.ipPingDiagnosticsDataBlockSize));
        mergeObjectModel.setIpPingDiagnosticsDSCP(getValueOrDefault(deviceInfo.ipPingDiagnosticsDSCP));
        mergeObjectModel.setIpPingDiagnosticsSuccessCount(getValueOrDefault(deviceInfo.ipPingDiagnosticsSuccessCount));
        mergeObjectModel.setIpPingDiagnosticsFailureCount(getValueOrDefault(deviceInfo.ipPingDiagnosticsFailureCount));
        mergeObjectModel.setIpPingDiagnosticsAverageResponseTime(
                getValueOrDefault(deviceInfo.ipPingDiagnosticsAverageResponseTime));
        mergeObjectModel.setIpPingDiagnosticsMinimumResponseTime(
                getValueOrDefault(deviceInfo.ipPingDiagnosticsMinimumResponseTime));
        mergeObjectModel.setIpPingDiagnosticsMaximumResponseTime(
                getValueOrDefault(deviceInfo.ipPingDiagnosticsMaximumResponseTime));
        mergeObjectModel.setDnsServers(getValueOrDefault(deviceInfo.dnsServers));
        mergeObjectModel.setMemory(getValueOrDefault(deviceInfo.memory));
        mergeObjectModel.setCpuUsage(getValueOrDefault(deviceInfo.cpuUsage));
        return mergeObjectModel;
    }

    private <T> T getValueOrDefault(T value) {
        return value != null ? value : getDefault(value);
    }

    private <T> T getDefault(T value) {
        if (value instanceof String) {
            return (T) "N/A";
        } else if (value instanceof Number) {
            return (T) Integer.valueOf(0);
        }
        return null;
    }

}
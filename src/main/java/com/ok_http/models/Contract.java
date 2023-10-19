package com.ok_http.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contract {
    @JsonProperty("ObjID")
    int objID;

    @JsonProperty("ContractNum")
    String contractNum;

    @JsonProperty("ContractDate")
    String contractDate;

    @JsonProperty("CustomerName")
    String customerName;

    @JsonProperty("Passport")
    int passport;

    @JsonProperty("CompanyName")
    String companyName;

    @JsonProperty("CertificateNumber")
    String certificateNumber;

    @JsonProperty("Address")
    String address;

    @JsonProperty("BillTo")
    String billTo;

    @JsonProperty("ContractType")
    int contractType;

    @JsonProperty("ContractTypeName")
    String contractTypeName;

    @JsonProperty("ContractStatus")
    int contractStatus;

    @JsonProperty("ContractStatusName")
    String contractStatusName;

    @JsonProperty("LoginName")
    String loginName;

    @JsonProperty("Email")
    String email;

    @JsonProperty("Location")
    String location;

    @JsonProperty("Region")
    String region;

    @JsonProperty("LocationID")
    int locationID;

    @JsonProperty("UserName")
    String userName;

    @JsonProperty("BranchCode")
    int branchCode;

    @JsonProperty("Suspend_Date")
    Date suspend_Date;

    @JsonProperty("Suspend_Reason")
    String suspend_Reason;

    @JsonProperty("ObjAddress")
    String objAddress;

    @JsonProperty("LegalEntityName")
    String legalEntityName;

    @JsonProperty("PartnerName")
    String partnerName;

    @JsonProperty("EocName")
    String eocName;

    @JsonProperty("FeeLocalType")
    String feeLocalType;

    @Override
    public String toString() {
        return "Contract{" +
                "objID=" + objID +
                ", contractNum='" + contractNum + '\'' +
                ", contractDate='" + contractDate + '\'' +
                ", customerName='" + customerName + '\'' +
                ", passport='" + passport + '\'' +
                ", companyName='" + companyName + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", address='" + address + '\'' +
                ", billTo='" + billTo + '\'' +
                ", contractType=" + contractType +
                ", contractTypeName='" + contractTypeName + '\'' +
                ", contractStatus=" + contractStatus +
                ", contractStatusName='" + contractStatusName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", region='" + region + '\'' +
                ", locationID=" + locationID +
                ", userName='" + userName + '\'' +
                ", branchCode=" + branchCode +
                ", suspend_Date='" + suspend_Date + '\'' +
                ", suspend_Reason='" + suspend_Reason + '\'' +
                ", objAddress='" + objAddress + '\'' +
                ", legalEntityName='" + legalEntityName + '\'' +
                ", partnerName='" + partnerName + '\'' +
                ", eocName='" + eocName + '\'' +
                ", feeLocalType='" + feeLocalType + '\'' +
                '}';
    }
    public String toJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
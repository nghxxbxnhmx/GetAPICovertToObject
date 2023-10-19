package com.ok_http.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractModel {
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
    Date suspendDate;

    @JsonProperty("Suspend_Reason")
    String suspendReason;

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
}

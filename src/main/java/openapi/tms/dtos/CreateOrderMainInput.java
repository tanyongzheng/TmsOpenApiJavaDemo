package openapi.tms.dtos;

import java.util.List;

public class CreateOrderMainInput {

    private int UserId;
    private String ReferCode;
    private String ChannelCode;
    private double Weight;
    private String ToCountryName;
    private String ToPostCode;
    private String ToName;
    private String ToAddress1;
    private String ToAddress2;
    private String ToProvince;
    private String ToCity;
    private String ToCompany;
    private String ToContact;
    private int IsSecure;
    private int IsSign;
    private int IsSignatureRequired;
    private int IsReject;
    private int IsBatery;
    private List<CreateOrderPackageInput> OrderPackages;
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    public int getUserId() {
        return UserId;
    }

    public void setReferCode(String ReferCode) {
        this.ReferCode = ReferCode;
    }
    public String getReferCode() {
        return ReferCode;
    }

    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }
    public String getChannelCode() {
        return ChannelCode;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    public double getWeight() {
        return Weight;
    }

    public void setToCountryName(String ToCountryName) {
        this.ToCountryName = ToCountryName;
    }
    public String getToCountryName() {
        return ToCountryName;
    }

    public void setToPostCode(String ToPostCode) {
        this.ToPostCode = ToPostCode;
    }
    public String getToPostCode() {
        return ToPostCode;
    }

    public void setToName(String ToName) {
        this.ToName = ToName;
    }
    public String getToName() {
        return ToName;
    }

    public void setToAddress1(String ToAddress1) {
        this.ToAddress1 = ToAddress1;
    }
    public String getToAddress1() {
        return ToAddress1;
    }

    public void setToAddress2(String ToAddress2) {
        this.ToAddress2 = ToAddress2;
    }
    public String getToAddress2() {
        return ToAddress2;
    }

    public void setToProvince(String ToProvince) {
        this.ToProvince = ToProvince;
    }
    public String getToProvince() {
        return ToProvince;
    }

    public void setToCity(String ToCity) {
        this.ToCity = ToCity;
    }
    public String getToCity() {
        return ToCity;
    }

    public void setToCompany(String ToCompany) {
        this.ToCompany = ToCompany;
    }
    public String getToCompany() {
        return ToCompany;
    }

    public void setToContact(String ToContact) {
        this.ToContact = ToContact;
    }
    public String getToContact() {
        return ToContact;
    }

    public void setIsSecure(int IsSecure) {
        this.IsSecure = IsSecure;
    }
    public int getIsSecure() {
        return IsSecure;
    }

    public void setIsSign(int IsSign) {
        this.IsSign = IsSign;
    }
    public int getIsSign() {
        return IsSign;
    }

    public void setIsSignatureRequired(int IsSignatureRequired) {
        this.IsSignatureRequired = IsSignatureRequired;
    }
    public int getIsSignatureRequired() {
        return IsSignatureRequired;
    }

    public void setIsReject(int IsReject) {
        this.IsReject = IsReject;
    }
    public int getIsReject() {
        return IsReject;
    }

    public void setIsBatery(int IsBatery) {
        this.IsBatery = IsBatery;
    }
    public int getIsBatery() {
        return IsBatery;
    }

    public void setOrderPackages(List<CreateOrderPackageInput> OrderPackages) {
        this.OrderPackages = OrderPackages;
    }
    public List<CreateOrderPackageInput> getOrderPackages() {
        return OrderPackages;
    }

}
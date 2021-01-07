package openapi.tms.dtos;

public class CheckAddressInput {

    private String ToName;
    private String ToCompany ;
    private String ToCountryCode ;
    private int ToCountryId ;
    private String ToAddress1 ;

    public String getToName() {
        return ToName;
    }

    public void setToName(String toName) {
        ToName = toName;
    }

    public String getToCompany() {
        return ToCompany;
    }

    public void setToCompany(String toCompany) {
        ToCompany = toCompany;
    }

    public String getToCountryCode() {
        return ToCountryCode;
    }

    public void setToCountryCode(String toCountryCode) {
        ToCountryCode = toCountryCode;
    }

    public int getToCountryId() {
        return ToCountryId;
    }

    public void setToCountryId(int toCountryId) {
        ToCountryId = toCountryId;
    }

    public String getToAddress1() {
        return ToAddress1;
    }

    public void setToAddress1(String toAddress1) {
        ToAddress1 = toAddress1;
    }

    public String getToAddress2() {
        return ToAddress2;
    }

    public void setToAddress2(String toAddress2) {
        ToAddress2 = toAddress2;
    }

    public String getToProvince() {
        return ToProvince;
    }

    public void setToProvince(String toProvince) {
        ToProvince = toProvince;
    }

    public String getToCity() {
        return ToCity;
    }

    public void setToCity(String toCity) {
        ToCity = toCity;
    }

    public String getToPostCode() {
        return ToPostCode;
    }

    public void setToPostCode(String toPostCode) {
        ToPostCode = toPostCode;
    }

    public String getToContact() {
        return ToContact;
    }

    public void setToContact(String toContact) {
        ToContact = toContact;
    }

    public String getChannelCode() {
        return ChannelCode;
    }

    public void setChannelCode(String channelCode) {
        ChannelCode = channelCode;
    }

    private String ToAddress2 ;
    private String ToProvince ;
    private String ToCity ;
    private String ToPostCode ;
    private String ToContact ;
    private String ChannelCode ;
}

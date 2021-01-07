package openapi.tms.dtos;

public class CreateOrderDetailInput {

    private String ReferNo;
    private String CnDesc;
    private String EnDesc;
    private String CustomcCode;
    private double SalesPrice;
    private int ProductCount;
    private double ProductWeight;
    public void setReferNo(String ReferNo) {
        this.ReferNo = ReferNo;
    }
    public String getReferNo() {
        return ReferNo;
    }

    public void setCnDesc(String CnDesc) {
        this.CnDesc = CnDesc;
    }
    public String getCnDesc() {
        return CnDesc;
    }

    public void setEnDesc(String EnDesc) {
        this.EnDesc = EnDesc;
    }
    public String getEnDesc() {
        return EnDesc;
    }

    public void setCustomcCode(String CustomcCode) {
        this.CustomcCode = CustomcCode;
    }
    public String getCustomcCode() {
        return CustomcCode;
    }

    public void setSalesPrice(double SalesPrice) {
        this.SalesPrice = SalesPrice;
    }
    public double getSalesPrice() {
        return SalesPrice;
    }

    public void setProductCount(int ProductCount) {
        this.ProductCount = ProductCount;
    }
    public int getProductCount() {
        return ProductCount;
    }

    public void setProductWeight(double ProductWeight) {
        this.ProductWeight = ProductWeight;
    }
    public double getProductWeight() {
        return ProductWeight;
    }

}
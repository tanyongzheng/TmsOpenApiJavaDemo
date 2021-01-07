package openapi.tms.dtos;

import java.util.List;

public class CreateOrderPackageInput {

    private int Length;
    private int Width;
    private int Height;
    private double Weight;
    private String ParcelCode;
    private int Count;
    private List<CreateOrderDetailInput> OrderDetails;

    public void setLength(int Length) {
        this.Length = Length;
    }
    public int getLength() {
        return Length;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }
    public int getWidth() {
        return Width;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }
    public int getHeight() {
        return Height;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    public double getWeight() {
        return Weight;
    }

    public void setParcelCode(String ParcelCode) {
        this.ParcelCode = ParcelCode;
    }
    public String getParcelCode() {
        return ParcelCode;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    public int getCount() {
        return Count;
    }

    public void setOrderDetails(List<CreateOrderDetailInput> OrderDetails) {
        this.OrderDetails = OrderDetails;
    }
    public List<CreateOrderDetailInput> getOrderDetails() {
        return OrderDetails;
    }

}
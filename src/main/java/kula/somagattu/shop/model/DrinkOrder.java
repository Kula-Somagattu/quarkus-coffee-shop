package kula.somagattu.shop.model;


public class DrinkOrder {
    private String orderNumber;
    private String customerName;
    private String drinkType;
    private Double price;
    private PaymentType paymentType;
    private CardInfo cardInfo;
    private OrderStatus orderStatus;

    

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getDrinkType() {
        return drinkType;
    }
    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public PaymentType getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public CardInfo getCardInfo() {
        return cardInfo;
    }
    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    @Override
    public String toString() {
        return "DrinkOrder [customerName=" + customerName + ", drinkType=" + drinkType + ", price=" + price
                + ", paymentType=" + paymentType + ", cardInfo=" + cardInfo + "]";
    }  
    
    

}
